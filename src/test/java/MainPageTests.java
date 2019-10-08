import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MainPageTests extends BaseUI {

    BaseActions baseActions = new BaseActions();

    @Test

    public void test() throws InterruptedException {
        Thread.sleep(5000);
        WebElement ele = driver.findElement(By.xpath ("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']"));
        driver.switchTo().frame(ele);
        driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();

    }

}