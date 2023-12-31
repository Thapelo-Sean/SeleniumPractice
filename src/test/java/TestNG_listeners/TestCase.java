package TestNG_listeners;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerTest.class)

public class TestCase {
	@Test
	public void main() throws InterruptedException {
		try
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();

			driver.get("https://www.edureka.co/");
			driver.manage().window().maximize();
			JavascriptExecutor js = (JavascriptExecutor)driver;
			driver.findElement(By.linkText("Cloud Computing")).click();
			js.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(1000);
			js.executeScript("scrollBy(0, 1000)");
			Thread.sleep(1000);
			js.executeScript("scrollBy(0, 1000)");
			Thread.sleep(1000);
			js.executeScript("scrollBy(0, 500)");
			Thread.sleep(1000);
			driver.findElement(By.className("trackButton")).click();
			Thread.sleep(1000);
			driver.quit();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}