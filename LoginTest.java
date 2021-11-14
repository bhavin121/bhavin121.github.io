package selenium1;

import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {
	
	  private WebDriver driver;
	  private Map<String, Object> vars;
	  JavascriptExecutor js;
	  
	  @Before
	  public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	  }
	  
	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	  
	  @Test
	  public void untitled() {
	    driver.get("https://bhavin121.github.io");
	    driver.manage().window().maximize();
	    driver.findElement(By.cssSelector(".Login:nth-child(4)")).click();
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).sendKeys("bhavin7014316242@gmail.com");
	    driver.findElement(By.id("pass")).click();
	    driver.findElement(By.id("pass")).sendKeys("abc123");
	    driver.findElement(By.id("signIn")).click();
	    
	    WebDriverWait wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[2]")));
	    
	    driver.findElement(By.xpath("/html/body/div/div/div[2]/a/p")).click();
	    driver.findElement(By.cssSelector("a:nth-child(3) > .Text")).click();
	    driver.close();
	  }
}
