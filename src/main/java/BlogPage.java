import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class BlogPage extends BaseActions {
    public BlogPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void testBlogPage() {
        driver.findElement(Locators.LINK_BLOG).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        public List<WebElement> collectAllLinksOfArticles (){
            List<WebElement> linksOfArticles = driver.findElements(Locators.LINKS_OF_ARTICLES);
             return linksOfArticles;
        }
    }


