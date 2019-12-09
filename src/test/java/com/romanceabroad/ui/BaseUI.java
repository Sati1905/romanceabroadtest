package com.romanceabroad.ui;

import com.romanceabroad.ui.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

//Initialization
public class BaseUI {
    WebDriver driver;
    WebDriverWait wait;
    MainPage mainPage;
    SearchPage searchPage;
    RegistrationPage registrationPage;
    TourToUkrainePage tourToUkrainePage;
    BlogPage blogPage;
    MediaPage mediaPage;
    PhotosPage photosPage;
    SignInPage signInPage;
    SoftAssert softAssert = new SoftAssert();

protected TestBox testBox;

protected enum TestBox{
    LOCAL, SAUCE
}

    @BeforeMethod (groups = {"user", "admin", "ie"}, alwaysRun = true)
    @Parameters({"browser","version", "platform", "testbox"})

    public void setup(@Optional("chrome") String browser, @Optional("null") String version,  @Optional("null") String platform, @Optional("null") String box, Method method) throws MalformedURLException {
     Reports.start(method.getDeclaringClass().getName() + " : " + method.getName());

     if (box.equalsIgnoreCase("local")){
     testBox = TestBox.LOCAL;
     }else if(box.equalsIgnoreCase("sauce")){
         testBox = TestBox.SAUCE;
     }

     switch (testBox) {
         case LOCAL:

         if (browser.equalsIgnoreCase("firefox")) {

             System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
             driver = new FirefoxDriver();
         } else if (browser.equalsIgnoreCase("chrome")) {
             System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
             driver = new ChromeDriver();
             driver.get("chrome://settings/clearBrowserData");
         } else if (browser.equalsIgnoreCase("IE")) {
             System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
             driver = new InternetExplorerDriver();
             driver.manage().deleteAllCookies();

         } else {
             System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
             driver = new ChromeDriver();
             driver.get("chrome://settings/clearBrowserData");

         }
         break;

         case SAUCE:
             DesiredCapabilities capabilities = new DesiredCapabilities();
             capabilities.setCapability("username", "Sati1981");
             capabilities.setCapability("accessKey", "9e016ee2-01f7-4ef1-9684-0905da7bfe2c");
             capabilities.setCapability("browserName", browser);
             capabilities.setCapability("platform", platform);
             capabilities.setCapability("version", version);
             capabilities.setCapability("name", method.getName());
             driver = new RemoteWebDriver(
                     new URL("http://" + System.getenv("SAUCE_USERNAME") + ":" + System.getenv("SAUCE_ACCESS_KEY") + "@ondemand.saucelabs.com:80/wd/hub"),
                     capabilities);
             break;

     }
        wait = new WebDriverWait(driver, 20);
        mainPage = new MainPage(driver, wait);
        searchPage = new SearchPage(driver, wait);
        registrationPage = new RegistrationPage(driver, wait);
        blogPage = new BlogPage (driver, wait);
        tourToUkrainePage = new TourToUkrainePage(driver, wait);
        mediaPage = new MediaPage(driver, wait);
        photosPage = new PhotosPage(driver, wait);
        signInPage = new SignInPage(driver, wait);
        driver.manage().window().maximize();
        driver.get(Data.mainUrl);
    }

    @AfterMethod
    public void afterActions (ITestResult testResult) {

        if (testResult.getStatus()== ITestResult.FAILURE){
            Reports.fail(driver, testResult.getName());
        }
        Reports.stop();
        driver.quit();
    }

}
