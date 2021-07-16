package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.io.IOException;

public class ConfiguDataProvider {
	Properties pro;
	
	public  ConfiguDataProvider() {
		File src = new File("./CucuConfiguration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (FileNotFoundException e) 
			
			{
				System.out.println("File Not found pls check the location of  config file");
				System.out.println(e.getMessage());
			}
			catch (IOException e)
			{
				System.out.println("Exception while reading the config file");
				System.out.println(e.getMessage());	 	 
			}
	}


public String  getChromePath()
{
	String Chrome_Loc =pro.getProperty("ChromePath");
    return Chrome_Loc;
    
}


public String  getFirefoxPath()
{
	String Firefox_Path=pro.getProperty("FirefoxPath");
	return Firefox_Path;
}
public String  getIEPath()
{
	String IE_Path=pro.getProperty("IEPath");
	return IE_Path;
}

}