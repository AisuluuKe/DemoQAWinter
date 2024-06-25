import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTest extends BaseTest {
    @Test(description = "Verify that driver can switch to another frame")
    public void doubleClickTest() {
        browserHelper.open("https://demoqa.com/frames");
        iFrameHelper.switchToFrame("frame1");
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        iFrameHelper.switchToParentFrame();
        System.out.println(driver.findElement(By.tagName("h1")).getText());
    }
}