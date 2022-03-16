package section20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValueDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
	
		//To read from data.properties file
		FileInputStream fis = new FileInputStream("C:\\Users\\Rohit\\eclipse - workspace Rohit\\JavaPractice\\src\\data.properties");
		prop.load(fis);   //to load file in read mode
		System.out.println(prop.getProperty("browser"));    // to get property value from data.propertites file ie Browser
		System.out.println(prop.getProperty("URL"));		// to get property value from data.propertites file ie URL
		
		prop.setProperty("browser", "firefox");   // To set property at runtime
		System.out.println(prop.getProperty("browser"));
		
		//to write runtime changes in data.properties file
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Rohit\\eclipse - workspace Rohit\\JavaPractice\\src\\data.properties");
		prop.store(fos, null);    // to store value in properties file
	} 

}
