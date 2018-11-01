package com.macys.marketing.loyalty.LtyIntegrationTest.util;

import java.io.File;
import java.io.FileReader;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author soubhagya senapati 
 * This class is for loading environment
 * properties(database credentials,soap endpoints, rest endpoints, TIBCO
 * config) from different properties files depending on env.
 */

public class PropertyConfigManger {

	private static Map<String, ConcurrentHashMap<String, String>> envPropMap = new ConcurrentHashMap<String, ConcurrentHashMap<String, String>>();
	private static String filePath = "../LtyCommon/src/main/resources/env";
	private static String env = "";

	private static Logger LOGGER = LoggerFactory
			.getLogger(PropertyConfigManger.class);

	static {
		env = System.getProperty("env");
		LOGGER.info("Environment details : {} ", env);

		if (env == null)
			env = "QAT04";
		
		LOGGER.info("Connected environment : {}", env);

		File currentDir = new File(filePath);
		load(null, currentDir);
		Set<String> keySet = envPropMap.keySet();
		for (String key : keySet) {
			Map<String, String> prop = envPropMap.get(key);
			LOGGER.info("{} properties {}", key, prop);
		}
	}

	private PropertyConfigManger() {
	}

	private static void load(String name, File dir) {
		try {

			File[] files = dir.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					name = file.getName();
					LOGGER.info("directory:" + file.getName());
					load(name, file);
				} else {
					if (name != null) {
						FileReader reader = new FileReader(
								file.getAbsoluteFile());
						Properties properties = new Properties();
						properties.load(reader);
						ConcurrentHashMap<String, String> map = envPropMap
								.get(name);
						if (map == null) {
							map = new ConcurrentHashMap<String, String>();
							envPropMap.put(name, map);
						}
						loadInPropertiesMap(map, properties);

					}
					LOGGER.info("file:" + file.getName());
				}
			}
		} catch (Exception e) {
			LOGGER.error("PropertyConfigManger.load()::: {}", e);
			throw new RuntimeException(e);
		}
	}

	private static void loadInPropertiesMap(
			ConcurrentHashMap<String, String> map, Properties properties) {

		Set<Object> setOfKeys = properties.keySet();
		for (Object obj : setOfKeys) {
			String key = (String) obj;
			String value = properties.getProperty(key);
			map.put(key, value);
		}
	}

	public static String getEnv() {
		return env;
	}

	public static String getProperty(String env, String key) {
		Map<String, String> propertyMap = envPropMap.get(env);
		return propertyMap.get(key);
	}

	public static String getProperty(String key) {
		Map<String, String> propertyMap = envPropMap.get(env);
		return propertyMap.get(key);
	}

}
