package com.online.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Base {
	static Properties prop;
	public static WebDriver driver;
	
	public Base()
	{
		prop = new Properties();
		try {
			//FileInputStream ip=new FileInputStream("D:\\Soaptestprojects\\soapui-groovy-maven-master\\OnlineShopping\\src\\main\\java\\com\\online\\qa\\config\\config.properties");
			FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/online/qa/config/config.properties");
			prop.load(ip);
		    System.out.println(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void init()
	{
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tayade_sh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		}
		 driver.get(prop.getProperty("url"));
		 driver.manage().window().maximize();
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 

		 
	}

}
