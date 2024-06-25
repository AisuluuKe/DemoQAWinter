import com.demoqa.utils.ConfigReader;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;

import org.testng.annotations.Test;

import static com.demoqa.enums.Endpoints.ALERT;

public class AlertTest extends BaseTest {

//    (groups = {"Smoke", "UI", "1721"}, description = "Alert test")
//    @Description("Verify that alert is present")
@Test
    @Owner("Ais")
    @Tag("Smoke")
    @Severity(SeverityLevel.CRITICAL)
    @Story("GCPINT-8877")
    @Epic("Registration")
    @Link("www.google.com")
    void alertTest() throws InterruptedException {
        browserHelper.open(ConfigReader.getValue("baseDevURL") + ALERT.getEndpoint());
        webElementActions.click(demoQaPages.getAlertPage().confirmAlertBtn);
        webElementActions.pause(6);
        alertHelper.acceptAlert();

    }

}

//
//    @Test(groups = {"Regression", "API", "1722"}, description = "Alert test 1", dependsOnMethods = {"alertTest"})
//    void alertTest1() throws InterruptedException {
//        driver.get("https://demoqa.com/alerts");
//        webElementActions.click(demoQaPages.getAlertPage().confirmAlertBtn);
//        alertHelper.acceptAlert();
//    }
//
//    @Test(groups = {"E2E", "SQL", "1723"}, description = "Alert test 2")
//    void alertTest2() throws InterruptedException {
//        driver.get("https://demoqa.com/alerts");
//        webElementActions.click(demoQaPages.getAlertPage().confirmAlertBtn);
//        alertHelper.acceptAlert();
//    }
//}
