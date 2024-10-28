 package App_Hooks;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.qa.factory.Driver_Factory;
import com.qa.util.Config_Reader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Application_Hooks {
 private Config_Reader reader;
 private Driver_Factory factory;
 private WebDriver driver;
 Properties prop;
 @Before(order=0)
 public void getproperty() {
	 reader=new Config_Reader();
	prop= reader.init_prop();
 }
 @Before(order=1)
 public void launching_browser() {
	 String browserName=prop.getProperty("browser");
	factory=new Driver_Factory();
	driver=factory.init_driver(browserName);
	
 }
	
	
	  @After(order=0)
	  public void teardown() {
	  //driver.close();	 
	  //driver.quit(); 
	  }
	 
	  
	  @After (order=1)
	  public void screenshot(Scenario sc)  {
	  if(sc.isFailed()) { 
		  String screenshotName=sc.getName().replaceAll("", "_");
		  byte[] sourcepath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES); 
		  sc.attach(sourcepath, "image/png",screenshotName );
	      }
	  }
	 
}
