import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {

    public Elements(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Alle Cookies inkl. US Partner akzeptieren")
    WebElement CookingsAkzeptieren;



}
