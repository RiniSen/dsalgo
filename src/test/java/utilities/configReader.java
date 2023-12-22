package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page_object.landing_page;

public class configReader {
	
	public static Properties prop= new Properties();
	private static String proppath= "src/test/resources/config/config.properties";
	public static void configload()throws Throwable {
	
	try {
		FileInputStream ip= new FileInputStream(proppath);
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new RuntimeException("config.properties not found at " + proppath);
	}
	
	}
	public static String getBrowserType() {
		String browser = prop.getProperty("browser");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("browser not specified in the config.properties file.");
	}
	
	public static String getApplicationUrl() {
		String url = prop.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the config.properties file.");
	}
	
		public static String getLoginPage() {
			System.out.println("rini config reader");
			String loginurl = prop.getProperty("loginpage");
			System.out.println(loginurl);
			if (loginurl != null)
				return loginurl;
			else
				throw new RuntimeException("Loginpage not specified in the Configuration.properties file.");
		}
	
	
		public static String getHomePage() {
			System.out.println("rini config reader");
			String Homeurl = prop.getProperty("homepage");
			if (Homeurl != null)
				return Homeurl;
			else
				throw new RuntimeException("Homepage not specified in the Configuration.properties file.");
		}
		
		public static String getexcelfilepath() {
			String excelfilelpath = prop.getProperty("excelfilepath");
			if (excelfilelpath != null)
				return excelfilelpath;
			else
				throw new RuntimeException("Excel file path not specified in the Configuration.properties file.");
		}
}
