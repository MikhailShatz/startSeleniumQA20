package sileniumour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LocatorsSeleniumStartPhonebook {
    WebDriver driver;

    @Test
    public void phoneBookTest(){
        driver = new ChromeDriver();
        driver.navigate().to("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        WebElement className = driver.findElement(By.className("container"));
        WebElement h2TagByName = driver.findElement(By.tagName("h2"));
        WebElement h1TagByName = driver.findElement(By.cssSelector("h1"));
        WebElement h1TagName = driver.findElement(By.cssSelector(".active"));
        WebElement inputCityById = driver.findElement(By.id("root"));
        //WebElement Link = driver.findElement(By.linkText("Web site created using create-react-app"));
       // WebElement partLink = driver.findElement(By.partialLinkText("create-react-app"));
        WebElement byXPath = driver.findElement(new By.ByXPath("//div[contains(@style, '50vw')]"));

        driver.quit();
    }
}
