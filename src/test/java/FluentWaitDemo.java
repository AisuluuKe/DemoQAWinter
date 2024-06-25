import com.demoqa.drivers.DriverManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class FluentWaitDemo {
    public static void main(String[] args) {
        FluentWait fluentWait = new FluentWait<>(DriverManager.getDriver());

        fluentWait.withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);
      
    }
}
