package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    By searchBox = By.id("twotabsearchtextbox");
    By searchButton = By.id("nav-search-submit-button");
    By firstProduct = By.xpath("//span[text()='Acer Aspire Lite, Intel Core i3 13th Gen - 1305U, 16GB RAM, 512GB SSD, Full HD 15.6\"/39.62 cm, Windows 11 Home, Steel Gray, 1.59 KG, AL15-53, Metal Body, 36 WHR, Thin and Light Premium Laptop']");

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void openSite() {
        driver.get("https://www.amazon.in/");
    }

    public void searchProduct(String product) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox))
            .sendKeys(product);
        driver.findElement(searchButton).click();
    }

    public void clickFirstProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(firstProduct)).click();
    }
}
