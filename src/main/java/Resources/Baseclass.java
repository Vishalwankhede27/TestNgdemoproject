package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

	public WebDriver driver;
	public WebDriver browserLaunch() throws IOException {
		
		//THis file help us to read data.properties
		FileInputStream fis=new FileInputStream("D:\\Automation Learning 2022\\Selenium Training\\20thjuneTestngFramework\\src\\main\\java\\Resources\\data.properties");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Chrome driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("Firefox")) {
			//Firefoxcode
		}else if(browsername.equalsIgnoreCase("Edge")) {
			//Edge
	} else {
		System.out.println("Please select valid Browser");
	}
		return driver;
		}
}
