package sileniumour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableTest {
    WebDriver driver;
    @BeforeClass
    public void preconditions(){
        driver = new ChromeDriver();
        driver.navigate().to("https://www.w3schools.com/cSS/css_table.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.MILLISECONDS);
    }
    @Test
    public void tableTest1(){
    String text = driver.findElement(By.cssSelector("#customers tr:nth-child(8) td:last-child"))
            .getText().trim();
        System.out.println(text);
        Assert.assertEquals(text, "Canada", "text not Canada");
        Assert.assertTrue(text.contains("Can"));
        System.out.println(driver.findElement(By.xpath("//table[@id='customers']//tr[3]//td[2]")).getText());
        System.out.println(driver.findElement(By.xpath("//table[@id='customers']//tr[3]//td[last()]")).getText());
    }



    @AfterClass
    public void postConditions(){
        driver.quit();
    }
}
