import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conditions extends BaseUI {

    @Test
    public void test1() {
        String fruit1 = "kiwi";
        String fruit2 = "kiwi";

        if (fruit2.contains("kiwi") || fruit1.contains("orange")) {
            System.out.println("We can find our fruit 1!");
        } else {
            Assert.fail("We can't find your fruit!");
        }
    }

    @Test
    public void test2() {
        int number1 = 10;
        int number2 = 10;
        int sum;

        if (number1 == number2) {
            sum = 95 + 100;

        } else {
            sum = 100 - 95;
        }
        System.out.println(sum);

    }

    @Test
    public void test3() {
        boolean requirement = false;

        if (!requirement) {
            System.out.println("Boolean is true!");
        } else {
            Assert.fail("Boolean is false");
        }
    }

    @Test
    public void test4() {
        WebElement tabSearch = driver.findElement(Locators.TAB_SEARCH);

        if (tabSearch.getText().contains("PRETTY WOMEN")) {
            tabSearch.click();
        } else {
            Assert.fail("We can't find Pretty Women tab");
        }
    }

    @Test
    public void test5() {
        List<Integer> crunchifyList1 = new ArrayList<>(Arrays.asList(5, 10, 19));
        int sum = crunchifyList1.get(1) + crunchifyList1.get(2);
        System.out.println(sum);
        for (int i = 0; i < 50; i++) {
            System.out.println("I got it!!!");
        }

    }

    @Test
    public void test6() {
        String actualTitle;
        String actualUrlPrettyWomen;
        String expectedUrlPrettyWomen = "https://romanceabroad.com/users/search";
        String expectedTitleHowWeWork = "Ukrainian women for marriage";
        String expectedTitlePrettyWomen = "Single Ukrainian women online";
        List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        System.out.println(links.size());

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();

            if (info.contains("WORK")) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                Assert.assertEquals(expectedTitleHowWeWork, actualTitle);
            }

            if (info.contains("PRETTY WOMEN")) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                actualUrlPrettyWomen = driver.getCurrentUrl();
                Assert.assertEquals(expectedTitlePrettyWomen, actualTitle);
                Assert.assertEquals(actualUrlPrettyWomen, expectedUrlPrettyWomen);
                driver.findElement(Locators.USERS_GALLERY_PHOTO).isDisplayed();
            }


            driver.get(Data.mainUrl);
            links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        }
    }


    @Test
    public void test7() {
        List<Integer> crunchifyList1 = new ArrayList<>(Arrays.asList(5, 10, 19));
        for (int i = 0; i < crunchifyList1.size(); i++) {
            int element = crunchifyList1.get(i);
            System.out.println(element);
        }

    }

    @Test
    public void test8() {
        List<Integer> crunchifyList1 = new ArrayList<>(Arrays.asList(5, 10, 19));
        System.out.println(crunchifyList1.size());
        crunchifyList1.add(10);
        System.out.println(crunchifyList1.size());

        for (int i = 0; i < crunchifyList1.size(); i++) {
            int element = crunchifyList1.get(i);
            System.out.println(element);
        }

    }

    @Test
    public void test9() {
        List<Integer> crunchifyList1 = new ArrayList<>(Arrays.asList(5, 10, 19));
        crunchifyList1.add(10);
        System.out.println(crunchifyList1);

        for (int i = 0; i < crunchifyList1.size(); i++) {
            int element = crunchifyList1.get(i);

        }

    }

    @Test
    public void test10() {
        String phrase = "Melon is inside list";
        List<String> crunchifyList1 = new ArrayList<>(Arrays.asList("apple", "kiwi", phrase));
        crunchifyList1.add("melon");
        System.out.println(crunchifyList1);

        for (int i = 0; i < crunchifyList1.size(); i++) {
            String element = crunchifyList1.get(i);
            System.out.println(i + " iteration");

            if (element.contains("me")) {
                ;
                System.out.println(phrase);
                continue; //or break;
            }
            if (element.equals("orange")) {
                System.out.println("Orange");
            }

            if (element.contains("i")) {
                System.out.println("IIIII");
            } else {
                System.out.println("Bad loop");
            }
        }

    }

}


