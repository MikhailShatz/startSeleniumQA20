package sileniumour.hw6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumXpathPhoneBook {
    WebDriver driver;
    @BeforeClass
    public void preconditions(){
        driver = new ChromeDriver();
        driver.navigate().to("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.MILLISECONDS);
    }
    @Test
    public void locatorsForPhonebook(){
        WebElement contains = driver.findElement(By.xpath("//div[contains(@style, '50vw')]"));
        WebElement AND = driver.findElement(By.xpath("//*[@class='active' and @aria-current='page']"));
        WebElement OR = driver.findElement(By.xpath("//*[@class='container' or @id='root']"));
        WebElement text = driver.findElement(By.xpath("//*[text() = 'React Contacts App']"));
        WebElement startsWith = driver.findElement(By.xpath("//*[starts-with(@class, 'navbar')]"));
        WebElement byID = driver.findElement(By.xpath("//*[@id='root']"));
        WebElement byTag = driver.findElement(By.xpath("//h2"));
        WebElement daughterElement = driver.findElement(By.xpath("//div//h2"));

    }

    @AfterClass
    public void postConditions(){
        driver.quit();
    }
}
