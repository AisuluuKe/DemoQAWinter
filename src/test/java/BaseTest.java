import com.demoqa.drivers.DriverManager;
import com.demoqa.helper.AlertHelper;
import com.demoqa.helper.BrowserHelper;
import com.demoqa.helper.IFrameHelper;
import com.demoqa.helper.WebElementActions;
import com.demoqa.pages.DemoQaPages;
import com.demoqa.utils.RandomUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected RandomUtils randomUtils;
    protected WebElementActions webElementActions;
    protected AlertHelper alertHelper;
    protected BrowserHelper browserHelper;
    protected DemoQaPages demoQaPages;
    protected IFrameHelper iFrameHelper;
    protected WebDriverWait wait;


    @BeforeClass(alwaysRun = true)
    public void setUp1() {
        driver = DriverManager.getDriver();
        randomUtils = new RandomUtils();
        webElementActions = new WebElementActions();
        alertHelper = new AlertHelper(driver);
        browserHelper = new BrowserHelper(driver);
        demoQaPages = new DemoQaPages();
        demoQaPages.setUp();
        iFrameHelper = new IFrameHelper(driver);
        wait= new WebDriverWait(driver, Duration.ofSeconds(15));
    }


    @AfterClass(alwaysRun = true)
    public void tearDown(){
        DriverManager.closeDriver();
    }


    @BeforeClass(alwaysRun = true)
    public void setUp3() {
        driver = DriverManager.getDriver();
    }

    }


