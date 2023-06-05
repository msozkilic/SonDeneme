import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class GenelWebDriver {

    public static WebDriver driver;
    public static WebDriverWait wait;
    @BeforeClass
    public void beforeClass(){

        WebDriverManager.chromedriver().setup();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        wait=new WebDriverWait(driver,Duration.ofSeconds(30));

        driver.get("https://www.ikea.com/de/de/");



    }


    @AfterClass
    public void afterClass(){

    }
}
