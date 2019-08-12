package com.metamagic.auth;

import java.util.Properties;

public class MongoConfig {

	public Properties getDBConfig() {
		
		String dbhost = System.getenv("MONO_HOST");
		String port = System.getenv("MONO_PORT");

		if(dbhost == null){
			dbhost = "localhost";
		}

		if(port == null){
			port = "27017";
		}

		
		Properties properties = new Properties();
		properties.put("spring.data.mongodb.database", "authdb");
		properties.put("spring.data.mongodb.host", dbhost);
		properties.put("spring.data.mongodb.port", port);
		return properties;
	}

}
