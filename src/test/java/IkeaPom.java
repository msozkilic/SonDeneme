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

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='search-results']")));
        wait.until(ExpectedConditions.elementToBeClickable(elements.searchButtonClick));
 
        //wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='plp-filter plp-clearfix']")));

       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='plp-filter plp-clearfix']")));
        //wait.until(ExpectedConditions.textToBe(By.xpath("//*[text()='Ergebnisse für „regal“. 1016 Produkte und 519 Inhaltsergebnisse gefunden.']"),"Ergebnisse für „regal“. 1016 Produkte und 519 Inhaltsergebnisse gefunden."));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Ergebnisse für „regal“. 1016 Produkte und 519 Inhaltsergebnisse gefunden.']")));
        //wait.until(ExpectedConditions.urlToBe("https://www.ikea.com/de/de/search/?q=regal"));
        //wait.until(ExpectedConditions.elementToBeClickable(elements.regalZuWarenkoob));
    }

}
