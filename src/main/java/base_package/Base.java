package base_package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;



public class Base {
	
      Properties prop;
      public WebDriver driver;
      
      //Logs
      
      public static Logger log = Logger.getLogger("devpinoyLogger");
      
 
	
	public  void intializeDriver()
	
	{
		prop = new Properties();
		
		
		try {
			FileInputStream pathOfFile = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\data.properties");
			
			try {
				prop.load(pathOfFile);
				
				log.debug("File is loading");
				
				String browsername =prop.getProperty("Browser");
				
				if(browsername.contains("chrome"))
				{
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
				     
					driver = new ChromeDriver();
				}
				
				else if(browsername.contains("Firefox"))
				{
					//System.setProperty("webdriver.chrome.driver", "\\API_Challenge\\src\\test\\resources\\Drivers\\chromedriver.exe");
				     
					driver = new FirefoxDriver();
				}
				
				else if(browsername.contains("InternetExplorer"))
				{
					//System.setProperty("webdriver.chrome.driver", "\\API_Challenge\\src\\test\\resources\\Drivers\\chromedriver.exe");
				     
					driver = new InternetExplorerDriver();
				}
				
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		}


		public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
		{
			TakesScreenshot ts=(TakesScreenshot) driver;
			File source =ts.getScreenshotAs(OutputType.FILE);
			String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
			FileUtils.copyFile(source,new File(destinationFile));
			return destinationFile;


		}	
	}

	
	

