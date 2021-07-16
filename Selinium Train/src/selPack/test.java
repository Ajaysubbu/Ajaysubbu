import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import DataProvider.$missing$;

public class test {
	Properties pro;
	public static void main(String[] args) {
		try {
			File src =new File("./Configuration/FrameworkConfig.properties");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File Not found pls check the location of  config file");
			System.out.println(e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println("Exception while reading the config file");
			System.out.println(e.getMessage());	 	 
		}

		public String getIEpath()
		{
             String IE_Loc =pro.getProperty("IEPath");
             return IE_Loc;
             
		}
		
		public String getchromepath()
		{
             String IE_Loc =pro.getProperty("ChromePath");
             return IE_Loc;
             
		}

	}

	}

}
