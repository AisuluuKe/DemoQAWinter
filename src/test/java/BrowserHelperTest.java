import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BrowserHelperTest extends BaseTest{


    @Test
    void test123() throws InterruptedException {
        browserHelper.open("https://demoqa.com/browser-windows");
       Thread.sleep(1000);
       driver.findElement(By.id("tabButton")).click();
       Thread.sleep(1000);
       browserHelper.switchToWindow(0);
       Thread.sleep(1000);
       driver.findElement(By.id("tabButton")).click();
       Thread.sleep(1000);
       browserHelper.switchToWindow(0);
       driver.findElement(By.id("tabButton")).click();
       Thread.sleep(1000);
       browserHelper.switchToWindow(0);
       driver.findElement(By.id("tabButton")).click();
       Thread.sleep(1000);
       browserHelper.switchToWindow(4);
       Thread.sleep(4000);

       browserHelper.switchToParentWithChildClose();
        Thread.sleep(4000);






    }
}


