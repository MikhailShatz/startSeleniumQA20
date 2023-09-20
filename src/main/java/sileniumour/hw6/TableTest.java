package sileniumour.hw6;

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
    public void testTables() {
        //print amount of table rows
        List<WebElement> listRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
        System.out.println("amount of table rows: " + listRows.size());
        // print amount of table columns
        List<WebElement> listColumns = driver.findElements(By.cssSelector("#customers th"));
        System.out.println("amount of table columns: " + listColumns.size());
        //find locators for the row 3
        WebElement thirdRow = driver.findElement(By.cssSelector("#customers tr:nth-child(3)"));
        System.out.println("The third row: " + thirdRow.getText());
        //find locator for the last column
        List<WebElement> lastColumn = driver.findElements(By.cssSelector("#customers tr :nth-of-type(3)"));
        System.out.println("The last column: ");
        for (WebElement column : lastColumn) {
            System.out.println(column.getText());
        }

    }
    @AfterClass
    public void postConditions(){
        driver.quit();
    }
}
