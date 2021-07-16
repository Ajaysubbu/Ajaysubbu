package Factory;

import dataProvider.ConfiguDataProvider;

public class Gdataprovider {
	static ConfiguDataProvider config;
  	
	
	public static  ConfiguDataProvider getconfig()
	{
		if (config==null) {
			config =new ConfiguDataProvider();
			 
		}
		return config;
		
	}



}
