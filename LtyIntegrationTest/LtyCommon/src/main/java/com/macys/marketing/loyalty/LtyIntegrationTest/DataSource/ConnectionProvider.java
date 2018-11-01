package com.macys.marketing.loyalty.LtyIntegrationTest.DataSource;

import java.sql.Connection;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import com.macys.marketing.msp.LtyIntegrationTest.LtyApplicationContext;
import com.macys.marketing.msp.LtyIntegrationTest.exception.DBException;

/**
 * 
 * @author rmarla
 * This class is to provide {@link java.sql.Connection} object
 *
 */
public class ConnectionProvider {

	private static Logger LOGGER = LoggerFactory.getLogger(ConnectionProvider.class);
	
	/**
	 * 
	 * @param schemaName
	 * @return {@link java.sql.Connection}
	 * @throws DBException
	 * @throws SQLException
	 */
	public Connection getConnection(String schemaName) throws DBException, SQLException{
		ApplicationContext context = LtyApplicationContext.getInstance().getContext();
		ConnectionManager dsm = (ConnectionManager)context.getBean(ConnectionManager.class);
		Connection conn = dsm.getConnection(schemaName);
		
		if(conn == null){
			LOGGER.warn("Connection is null for schema {}", schemaName);
			throw new DBException();
		}
		
		return conn;
	}
}
