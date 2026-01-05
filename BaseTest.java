package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public void setup() {

    	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Selenium 3 compatible
        wait = new WebDriverWait(driver, 15);
    }

    public void tearDown() {
        driver.quit();
    }
}
