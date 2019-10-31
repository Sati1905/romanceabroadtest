package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BlogTests extends BaseUI {
    String currentUrl;
    String nameOfArticle;
    String titleOfArticle;

    @Test
    public void testBlogPage() {
        blogPage.testBlogPage();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        currentUrl = driver.getCurrentUrl();
        System.out.println(Data.currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlBlog);

    }

    @Test
    public void testArticlesAndTitles() {
        mainPage.clickTabBlog();
        List<WebElement> linksOfArticles = blogPage.collectAllLinksOfArticles();

        for (int i = 0; i < linksOfArticles.size(); i++) {
            WebElement link = linksOfArticles.get(i);
            nameOfArticle = link.getText();
            if (nameOfArticle.contains("How it works")) {
            }
            else if (nameOfArticle.contains("Kharkov dating agency")) {
            }
            else if (nameOfArticle.contains("Kiev dating agency")) {
            }
            else {
                link.click();
                titleOfArticle = blogPage.getAnyTitle();
                Assert.assertEquals(nameOfArticle, titleOfArticle);
                linksOfArticles = blogPage.collectAllLinksOfArticles();

            }
        }

    }
}


