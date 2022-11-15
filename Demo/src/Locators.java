import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import org.openqa.selenium.JavascriptExecutor;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		 //Set global webdriver properties		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\tothe\\Downloads\\chromedriver_win32\\chromedriver.exe");

	    //Invoke Browser
	    WebDriver driver = new ChromeDriver();   	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	           
	    //Navigate to a website
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  

	    //Maximize current window
	    driver.manage().window().maximize();
	    
	    //Delay execution for 5 seconds to view the maximize operation
	    //Thread.sleep(5000);
	    
//	     * Locators:
//	     * 
//	     * CSS Selector
//	     * Xpath
//	     * ID
//	     * ClassName
//	     * LinkText
//	     * Name
//	     * Tagname
//	     * PartialLinkText
	    
	    
	    
//	    * 
//		 * Css Selector:
//		 * 
//		 * classname -> tagname.classname 
//       * id -> tagname#id
//		 * tagname[attribute='value'] 
//		 * tagname[attribute='value']:nth-child(indexvalue)
//		 * parenttagname childtagname[indexvalue] 
//		 * Regex: tagname[attribute*='value']
//		 * Console: $('cssLocator')
//		 * 
//		 * 
//		 * 
//		 * 
//		 * xpath:
//		 * 
//		 * //tagname[@attribute='value'] 
//		 * //tagname[@attribute='value'][indexvalue]
//		 * //parenttagname/childtagname[indexvalue] 
//		 * Regex:  tagname[contains(@attribute,'value')]
//		 * Console:$x('tagname[@attribute="value"]')
	    
	    //driver.findElement(By.className("text")).click();
	    //driver.findElement(By.className("text")).click();	
	    
//	    
//	    driver.findElement(By.cssSelector("span.text")).click();  //Sytanx: tagname.classname
//	    driver.findElement(By.cssSelector("input#userName")).sendKeys("Habib Khan");  //Syntax:  tagname#id
//	    driver.findElement(By.cssSelector("input[placeholder='name@example.com']")).sendKeys("myemail@email.com");  //Syntax: tagname[attribute='value'] 
//	    driver.findElement(By.cssSelector("textarea[id='currentAddress']")).sendKeys("This is my address"); //tagname[attribute='value']
//        driver.findElement(By.cssSelector("textarea[id*='permanent']")).sendKeys("This is my permanent address"); //tagname[attribute*='value']
//	    
//	 // This  will scroll down the page by  500 pixel vertical		
//       js.executeScript("window.scrollBy(0,500)");
//	    
//	    driver.findElement(By.cssSelector("button.btn-primary")).click();
//	    driver.findElement(By.id("name")).getText();
//	    System.out.println(driver.findElement(By.id("name")).getText());
//	    
//	    String name = driver.findElement(By.id("name")).getText();
//	    String expectedName = "Habib Khan";
//	    
//	    Assert.assertEquals(name, "Name:"+expectedName);
    
	    
	   // driver.findElement(By.xpath("//*[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']")).click();
	    
// Home work from https://demoqa.com/checkbox website do the chekbox selections and some assertions by using xpath
	    
	    
//	    driver.findElement(By.xpath("//*[@id=\"item-1\"]/span")).click();
//	    driver.findElement(By.xpath("//button[@aria-label='Toggle']")).click();
//	    driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button")).click();
//	    driver.findElement(By.xpath("//label[@for='tree-node-notes']")).click();
//	    
//	    
//	    driver.findElement(By.xpath("//*[@id='result']/span[1]")).getText();
//	    
//	    String defaultSelect = driver.findElement(By.xpath("//*[@id='result']/span[1]")).getText();
//	    
//	    driver.findElement(By.xpath("//*[@id='result']/span[2]")).getText();
//	    
//	    String selectedCheckbox = driver.findElement(By.xpath("//*[@id='result']/span[2]")).getText();
//	    
//	    System.out.println(driver.findElement(By.xpath("//*[@id='result']/span[1]")).getText());
//	    
//	    System.out.println(driver.findElement(By.xpath("//*[@id='result']/span[2]")).getText());
//	    
//	    String expectedDefaultSelect = "You have selected :";
//	    String expectedItem = "notes";
//	    
//        Assert.assertEquals(defaultSelect, expectedDefaultSelect);
//        Assert.assertEquals(selectedCheckbox, expectedItem);
        
        //RadioButton
//        driver.findElement(By.xpath("//*[@id=\"item-2\"]/span")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"yesRadio\"]")).click();
	    
	    driver.findElement(By.xpath("//input[@value='radio1']")).click();
	    String linkText = driver.findElement(By.xpath("/html/body/header/a[2]")).getText();
	    boolean homeButton = driver.findElement(By.xpath("/html/body/header/div/button")).isEnabled();
	    System.out.println(homeButton);
	    
	    Assert.assertEquals(homeButton, false);
	    
	    System.out.println(driver.findElement(By.xpath("/html/body/header/div/button")).getText());
	    
	    //Select dropdown
	    
	    driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).isDisplayed();
	    
	    
	  
        
        
        
        
	    
	    
	    
	
	    

	    
	    
	    //Thread.sleep(5000);	    
	    //driver.quit();
	    
	    //Comment
	    //Comment
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
