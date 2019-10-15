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
    public void test2(){
        int number1 = 10;
        int number2 = 10;
        int sum;

        if (number1==number2){
            sum = 95 + 100;

        } else {
            sum = 100 - 95;
        }
        System.out.println(sum);

    }

    @Test
    public void test3(){
        boolean requirement = false;

        if(!requirement){
            System.out.println("Boolean is true!");
        }else {
            Assert.fail("Boolean is false");
        }
    }

    @Test
    public void test4(){
        WebElement tabSearch = driver.findElement(Locators.TAB_SEARCH);

        if (tabSearch.getText().contains("PRETTY WOMEN")){
            tabSearch.click();
        }else {
            Assert.fail("We can't find Pretty Women tab");
        }
        }

    @Test
    public void test5(){
        List<Integer> crunchifyList1 = new ArrayList<>(Arrays.asList(5, 10, 19));
        int sum=crunchifyList1.get(1)+ crunchifyList1.get(2);
        System.out.println(sum);
        for (int i = 0; i < 50; i++) {
            System.out.println("I got!!!");
        }

        }

    @Test
    public void test6(){
        List<WebElement> links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            driver.get(Data.mainUrl);
            links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
        }

    }

}
