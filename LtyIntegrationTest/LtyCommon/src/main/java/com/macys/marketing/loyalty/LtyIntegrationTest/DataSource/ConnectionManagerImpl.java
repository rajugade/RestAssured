package com.macys.marketing.loyalty.LtyIntegrationTest.DataSource;



import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.commons.dbcp.BasicDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.macys.marketing.loyalty.LtyIntegrationTest.util.PropertyLoader;
import com.macys.marketing.msp.LtyIntegrationTest.exception.DBException;
/**
 * 
 * @author rmarla
 * This class is for creating Database {@link Connection} based on environments using {@link BasicDataSource}
 *
 */

@Component
public class ConnectionManagerImpl implements ConnectionManager{

	private Logger LOGGER = LoggerFactory.getLogger(ConnectionManagerImpl.class);
	
	private Map<String, Map<String, BasicDataSource>> datasourceMap = new ConcurrentHashMap<String, Map<String, BasicDataSource>>();
	
	@PostConstruct
	public void init() throws DBException, SQLException{
		LOGGER.info("init connection manager");
		if(datasourceMap.size() == 0){
			//If datasource map is empty, Create Connection object and keep in Map
			
			//ods database connection
			String odsDsName = PropertyLoader.getLoyaltyOdsDatasourceName();
			String odsDSUrl = PropertyLoader.getLoyaltyOdsDatasourceUrl();
			String odsDSUserName = PropertyLoader.getLoyaltyOdsDatasourceUsername();
			String odsDSPwd = PropertyLoader.getLoyaltyOdsDatasourcePassword();
			String odsDSDriver = PropertyLoader.getLoyaltyOdsDatasourceDriverClassName();
			int poolSize = PropertyLoader.getLoyaltyOdsDatasourcePoolSize();
			
			BasicDataSource bds = new BasicDataSource();
			bds.setDriverClassName(odsDSDriver);
			bds.setUrl(odsDSUrl);
			bds.setUsername(odsDSUserName);
			bds.setPassword(odsDSPwd);
			bds.setMaxActive(poolSize);
			bds.setMaxIdle(poolSize);
			
			
			String environment = PropertyLoader.getEnvironment();
			Map<String, BasicDataSource> connMap = datasourceMap.get(environment);
			if(connMap == null){
				connMap = new ConcurrentHashMap<String, BasicDataSource>();
				LOGGER.info("New connection map creating");
			}
			
			connMap.put(odsDsName, bds);
			
			
			//offer tool database connection
			String offerToolDsName = PropertyLoader.getLoyaltyOffertoolDatasourceName();
			String offerToolDSUrl = PropertyLoader.getLoyaltyOffertoolDatasourceUrl();
			String offerToolDSUserName = PropertyLoader.getLoyaltyOffertoolDatasourceUsername();
			String offerToolDSPwd = PropertyLoader.getLoyaltyOffertoolDatasourcePassword();
			String offerToolDSDriver = PropertyLoader.getLoyaltyOffertoolDatasourceDriverClassName();
			int offetToolPoolSize = PropertyLoader.getLoyaltyOffertoolDatasourcePoolSize();
			
			BasicDataSource bdsOt = new BasicDataSource();
			bdsOt.setDriverClassName(offerToolDSDriver);
			bdsOt.setUrl(offerToolDSUrl);
			bdsOt.setUsername(offerToolDSUserName);
			bdsOt.setPassword(offerToolDSPwd);
			bdsOt.setMaxActive(offetToolPoolSize);
			bdsOt.setMaxIdle(offetToolPoolSize);
			
			connMap.put(offerToolDsName, bdsOt);
			
			datasourceMap.put(environment, connMap);
			LOGGER.info("Created Connections {}",datasourceMap);
		}
	}
	
	@PreDestroy
	public void destroy(){
		LOGGER.info("destroy connection manager: Closing BasicDataSource(s)");
		datasourceMap.forEach((environment, dataSourceMap)->{
			dataSourceMap.forEach((dsName, dataSource)->{
				if(!dataSource.isClosed()){
					try {
						dataSource.close();
					} catch (SQLException e) {
						LOGGER.error("Exception in closing BasicDataSource {}",e);
					}
				}
			});
		});
	}
	
	@Override
	public Connection getConnection(String schemaName) throws DBException, SQLException{
		Map<String, BasicDataSource> dsMap = datasourceMap.get(PropertyLoader.getEnvironment());
		BasicDataSource bds = dsMap.get(schemaName);
		
		LOGGER.info("num active {} initial size {} max active {} num idle {}",bds.getNumActive(), bds.getInitialSize(), bds.getMaxActive(), bds.getNumIdle());
		return bds.getConnection();
	}
}
