package notes_2;

import java.io.FileReader;
import java.util.Properties;

public class AC_Use_Properties_files {
/**
	on property file:
 	URL=jdbc:postgresql://localhost:5432/PubHub
	CONNECTION_USERNAME=user
	CONNECTION_PASSWORD=password



using File Input Stream
	// create a stream from properties file so we can read from it
	FileInputStream fileStream = new FileInputStream("pathtopropertiesfile"); 

	// create a Properties object and get information from it
	Properties properties = new Properties(); 
	properties.load(fileStream);

	// extract values from the keys into variables
	URL = properties.getProperty("URL");    
	CONNECTION_PASSWORD = properties.getProperty("CONNECTION_PASSWORD"); 
	CONNECTION_USERNAME = properties.getProperty("CONNECTION_USERNAME"); 
	
	
	
	
	
	
	
	
	
	
	
	
	
Using File Reader:
	
	FileReader fr = new FileReader("C:\\Users\\YE\\Documents\\SCHOOL\\Classes\\CS\\Eclipse_Java_Learning\\Maven_Sample_Project\\src\\test\\resources\\configfiles\\config.properties");	
	Properties p = new Properties();	
	p.load(fr);	
	p.getProperty("browser");
	p.getProperty("testurl");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
*/
}
