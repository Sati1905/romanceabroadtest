import org.testng.Assert;
import org.testng.annotations.Test;

    public class BlogTests extends BaseUI {
        String currentUrl;
        String expectedUrlBlog;

       //Created test case for Blog page and used xpath
        @Test
        public void testBlogPage() {
            driver.findElement(Locators.LINK_BLOG).click();
            currentUrl =driver.getCurrentUrl();
            System.out.println(Data.currentUrl);
            Assert.assertEquals(Data.currentUrl,Data.ExpectedUrlBlog);
        }

}
