import org.testng.Assert;
import org.testng.annotations.Test;

    public class BlogTests extends BaseUI {
String currentUrl;

        @Test
         public void testBlogPage () {
            blogPage.testBlogPage();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            currentUrl = driver.getCurrentUrl();
            System.out.println(Data.currentUrl);
            Assert.assertEquals(currentUrl, Data.ExpectedUrlBlog);

        }

}

