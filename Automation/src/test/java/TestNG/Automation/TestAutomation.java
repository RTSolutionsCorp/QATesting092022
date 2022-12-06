package TestNG.Automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestAutomation {
	WebDriver driver = null;
	
  @Test(groups = "Functional")
  public void testcase1() {
	  //Verify the title of the page
	  String pageTitle1 = driver.getTitle();
	  System.out.println("The page title is: "+ pageTitle1);
	  Assert.assertEquals(pageTitle1, "Selenium");
  }
  
  @Test(enabled = false, groups = "Smoke")
  public void testcase2() throws InterruptedException {
	 WebElement downloads = driver.findElement(By.xpath("//span[normalize-space()='Downloads']"));
	 downloads.click();
	 Thread.sleep(2000);
	 String pageTitle2 = driver.getTitle();
	 System.out.println("The page title is: "+ pageTitle2);
  }
  
  @Test(groups = "Regression")
  public void testcase3() throws InterruptedException {
	  WebElement documentation = driver.findElement(By.xpath("//span[normalize-space()='Documentation']"));
	  documentation.click();
	  Thread.sleep(2000);
		 String pageTitle3 = driver.getTitle();
		 System.out.println("The page title is: "+ pageTitle3);	  
  }
  
  @Test(alwaysRun = true, groups = {"Functional","Regression"})
  public void testcase4() throws InterruptedException {
	  WebElement projects = driver.findElement(By.xpath("//span[normalize-space()='Projects']"));
	  projects.click();
	  Thread.sleep(2000);
		 String pageTitle4 = driver.getTitle();
		 System.out.println("The page title is: "+ pageTitle4);		  
	  
  }
  
  
  @BeforeClass(alwaysRun = true)
  public void beforeClass() throws InterruptedException {
	  System.out.println("##### Now Running Before Class ####");
	  System.out.println("##### Navigating to the application ####");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tothe\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev");
		Thread.sleep(2000);
  }

  @AfterClass(alwaysRun = true)
  public void afterClass() {
	  System.out.println("##### Now Running After Class ####");
	  System.out.println("Closing all browsers");
	  driver.quit();
  }

}
