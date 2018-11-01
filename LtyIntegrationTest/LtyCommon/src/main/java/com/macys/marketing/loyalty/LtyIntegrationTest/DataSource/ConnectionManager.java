package com.macys.marketing.loyalty.LtyIntegrationTest.DataSource;

import java.sql.Connection;
import java.sql.SQLException;

import com.macys.marketing.msp.LtyIntegrationTest.exception.DBException;

/**
 * 
 * @author rmarla
 *
 */
public interface ConnectionManager {

	public Connection getConnection(String dataSourceName) throws DBException, SQLException;
}
