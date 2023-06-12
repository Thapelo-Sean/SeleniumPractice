package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class HandleDropdown {

    public static void main(String [] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Katan\\OneDrive\\Desktop\\MyAutomation\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jsbin.com/osebed/2");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement myElement = driver.findElement(By.xpath("//*[@id=\"fruits\"]"));

        Select select = new Select(myElement);
        select.selectByIndex(2);
        driver.quit();
    }
}