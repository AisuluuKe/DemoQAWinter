import org.testng.Assert;
import org.testng.annotations.Test;

public class ProgressBarTest extends BaseTest{
@Test(description = "")
    public void progressBarTest() throws InterruptedException {
    browserHelper.open("https://demoqa.com/progress-bar");
    webElementActions.click(demoQaPages.getProgressBarPage().startStopButton);

    Thread.sleep(2000);
    webElementActions.click(demoQaPages.getProgressBarPage().startStopButton);
    Thread.sleep(6000);

    System.out.println(demoQaPages.getProgressBarPage().aria_valuenow.getAttribute("aria-valuenow"));
    Assert.assertEquals(demoQaPages.getProgressBarPage().aria_valuenow.getAttribute("aria-valuenow"), "52");
}

}
