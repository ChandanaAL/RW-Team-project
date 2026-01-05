package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    WebDriver driver;
    WebDriverWait wait;

    By addToCart = By.xpath("//span[text()='Add to cart' and @id='submit.add-to-cart-announce']");

    public ProductPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean isProductPageLoaded() {
        try {
            WebDriverWait longWait = new WebDriverWait(driver, 30); // 30 seconds
            WebElement addToCartBtn = longWait.until( ExpectedConditions.elementToBeClickable(addToCart) );
            return addToCartBtn.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }


    public void clickAddToCart() {
        WebElement addToCartBtn = wait.until(ExpectedConditions.presenceOfElementLocated(addToCart));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", addToCartBtn);

        try {
            Thread.sleep(500); // 0.5 second pause
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();
    }

    
}
