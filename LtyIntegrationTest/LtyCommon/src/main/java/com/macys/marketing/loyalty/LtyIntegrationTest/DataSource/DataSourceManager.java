package com.macys.marketing.loyalty.LtyIntegrationTest.DataSource;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import com.macys.marketing.loyalty.LtyIntegrationTest.util.PropertyLoader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataSourceManager {
	private static Logger logger = LoggerFactory.getLogger(DataSourceManager.class);
	Connection dataBaseConnection;
	BasicDataSource basicDataSource = new BasicDataSource();
	JdbcTemplate jdbcTemplate;
	boolean isConnectionClosed;

	public Connection getDataSource() {
		try {

			basicDataSource.setDriverClassName(PropertyLoader.getLoyaltyOffertoolDatasourceDriverClassName());
			basicDataSource.setUrl(PropertyLoader.getLoyaltyOffertoolDatasourceUrl());
			basicDataSource.setUsername(PropertyLoader.getLoyaltyOffertoolDatasourceUsername());
			basicDataSource.setPassword(PropertyLoader.getLoyaltyOffertoolDatasourcePassword());
			dataBaseConnection = basicDataSource.getConnection();
			isConnectionClosed=checkConnectionAliveOrClosed();
			if(isConnectionClosed==true){
				logger.info("Connection has been closed");
			}
			else{
				logger.info("Connection has Alive");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if (dataBaseConnection != null) {
				try {
					dataBaseConnection.close();
				} catch (SQLException e) {}
			}
		}
		return dataBaseConnection;

	}
	
	public boolean checkConnectionAliveOrClosed() throws SQLException{
		boolean connectionClosed=dataBaseConnection.isClosed();
		return connectionClosed;
	}
	
    
	public JdbcTemplate getJdbcTemplate(){
		jdbcTemplate = new JdbcTemplate(basicDataSource);
		return jdbcTemplate;
		
	}

}