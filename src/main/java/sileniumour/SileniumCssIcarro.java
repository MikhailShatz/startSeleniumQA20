package sileniumour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SileniumCssIcarro {
    WebDriver driver;
    @Test
    public void test1(){
        driver = new ChromeDriver();
        driver.navigate().to("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        WebElement h2TextElement = driver.findElement(By.cssSelector("h2")); // h2- it is tag name
        System.out.println(h2TextElement.getText());

        WebElement h2TagByName = driver.findElement(By.tagName("h2"));

        WebElement h2ByClassAndTagTogether =
                driver.findElement(By.cssSelector("h2.subtitle"));

        WebElement h2TextElementByClass = driver.findElement(By.cssSelector(".subtitle")); //by class value
        System.out.println(h2TextElementByClass.getText());

        WebElement h2TextElementByClassName = driver.findElement(By.className("subtitle")); //by class name
        System.out.println(h2TextElementByClassName.getText());

        WebElement inputCityById = driver.findElement(By.cssSelector("#city")); //by id value
        System.out.println(inputCityById.getAttribute("type"));

        WebElement inputCityByIdDirectly = driver.findElement(By.id("city")); //by id value directly
        System.out.println(inputCityByIdDirectly.getAttribute("type"));

        WebElement wildElementAtttribute =
                driver.findElement(By.cssSelector("[style='touch-action: none; user-select: none; -webkit-user-drag: " +
                        "none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);']")); //try not to use that without need;
                                                                            //find by full attribute value

       // WebElement h2ByText = driver.findElement(By.linkText("Type your data and hit Yalla!"));
        WebElement h2ByText = driver.findElement(By.partialLinkText("hit"));

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);

        //xPath

        WebElement xpathLabel = driver.findElement(By.xpath("//label[@for='city']"));
        // //label[@for='city'].. jump to 1 tag up
        //label[@for='city']/span
        System.out.println(xpathLabel.getText());

//        }

        driver.quit();
    }
}