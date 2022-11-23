import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class selenium {

  public static void main(String[] args) throws InterruptedException {
    // TODO Auto-generated method stub

    //Set global webdriver properties		
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\tothe\\Downloads\\chromedriver_win32\\chromedriver.exe");

    //Invoke Browser
    WebDriver driver = new ChromeDriver();    
           
    //Navigate to a website
    driver.get("https://demoqa.com/elements");
  

    //Maximize current window
    driver.manage().window().maximize();
    
    //Delay execution for 5 seconds to view the maximize operation
    Thread.sleep(2000);

    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
    
    Assert.assertEquals(driver.getTitle(), "ToolsQA");    
    Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/elements");        
    driver.findElement(By.className("text")).click();    
    driver.findElement(By.id("userName")).sendKeys("My Full Name");
    driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("someemail@email.com");
 
    
    //Custom CSS Locator
   // driver.findElement(By.cssSelector("input#userName")).sendKeys("First Name"); //By ID Syntax tagname#id
   // driver.findElement(By.cssSelector("input[placeholder='name@example.com']")).sendKeys("myemail@email.com");  //Generic Syntax tagname[attribute='value']
    //driver.findElement(By.cssSelector("#currentAddress")).sendKeys("My Address");
    
    
    
	/*
	 * Css Selector 
	 * 
	 * classname -> tagname.classname id -> tagname#id
	 * tagname[attribute='value'] tagname[attribute='value']:nth-child(indexvalue)
	 * parenttagname childtagname[indexvalue] 
	 * Console: $('cssLocator')
	 * Regex: tagname[attribute*='value']
	 * 
	 * 
	 * 
	 * xpath
	 * 
	 * //tagname[@attribute='value'] //tagname[@attribute='value'][indexvalue]
	 * //parenttagname/childtagname[indexvalue] 
	 * Console:$x('tagname[@attribute="value"]')
	 * Regex:  tagname[contains(@attribute,'value')]
	 */
    
    
    
    //Thread.sleep(2000);
   // driver.navigate().refresh();
       
   // driver.close();
    //driver.quit();

  }

}