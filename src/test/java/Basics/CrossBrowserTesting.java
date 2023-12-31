package Basics;

import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {

	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception

	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "location of the driver");
			driver = new FirefoxDriver();
		}

		 else if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if(browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.egde,driver", "location of the driver");
			driver = new EdgeDriver();
		}

		else
		{
			throw new Exception ("Browser is not correct");
		}

	}

	@Test
	public void testParameterWithXml() throws InterruptedException
	{
		try
		{
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.name("q")).sendKeys("Selenium");
			driver.findElement(By.name("btnK")).click();
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}