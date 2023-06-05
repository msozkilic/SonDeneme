import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;

public class IkeaPom extends GenelWebDriver{



    @Test
    public void ikeaShop(){

        Elements elements=new Elements(driver);

        elements.CookingsAkzeptieren.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.einLoggen));

       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id=\"loyalty-modal\"]")));
       // wait.until(ExpectedConditions.visibilityOf(elements.einLoggen2)).click();
       // wait.until(ExpectedConditions.elementToBeClickable(elements.einLoggen2));

        wait.until(ExpectedConditions.visibilityOf(elements.searchButton)).sendKeys("regal");
        wait.until(ExpectedConditions.elementToBeClickable(elements.searchButtonClick));

        //Assert.assertTrue(driver.getCurrentUrl().contains("search"));
        //wait.until(ExpectedConditions.urlContains("search"));
      //  wait.until(ExpectedConditions.urlToBe("https://www.ikea.com/de/de/search/?q=regal"));
        //wait.until(ExpectedConditions.elementToBeClickable(elements.regalZuWarenkoob));
    }

}
