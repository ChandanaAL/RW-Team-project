package test;

import base.BaseTest;
import pages.HomePage;
import pages.ProductPage;
import utils.ScreenshotUtil;

public class AmazonTest extends BaseTest {

    public static void main(String[] args) {

        AmazonTest test = new AmazonTest();
        test.setup();

        HomePage home = new HomePage(test.driver, test.wait);
        ProductPage product = new ProductPage(test.driver, test.wait);

        // Open Amazon
        home.openSite();

        // Search for a product
        home.searchProduct("laptop");

        // Click first product from search results
        home.clickFirstProduct();

     
        for (String win : test.driver.getWindowHandles()) {
            test.driver.switchTo().window(win);
        }

        if (product.isProductPageLoaded()) {
            System.out.println("Product page loaded successfully");
            ScreenshotUtil.takeScreenshot(test.driver, "ProductPage");

            product.clickAddToCart();
            System.out.println("Clicked Add to Cart button");
            ScreenshotUtil.takeScreenshot(test.driver, "AfterAddToCart");
        } else {
            System.out.println("Product page did not load");
        }

        test.tearDown();
    }
}
