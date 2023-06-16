import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {

    public Elements(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[text()='Alle Cookies inkl. US Partner akzeptieren']")
    WebElement CookingsAkzeptieren;

    @FindBy(xpath = "//*[text()='Jetzt einloggen!']")
    WebElement einLoggen;

    @FindBy(xpath = "//*[text()='Einloggen']")
    WebElement einLoggen2;

    @FindBy(id = "ikea-search-input")
    WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"search-box__searchbutton\"]")
    WebElement searchButtonClick;

    @FindBy(xpath = "//*[@class='plp-filter plp-clearfix']")
    WebElement searchList;

    @FindBy(css = "[aria-label=\" In den Warenkorb, LACK, Wandregal\"]")
    WebElement regalZuWarenkoob;



}
