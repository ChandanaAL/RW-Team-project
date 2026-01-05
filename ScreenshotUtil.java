package utils;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static void takeScreenshot(WebDriver driver, String fileName) {

        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);

        // Ensure the folder exists
        File destFolder = new File("screenshots");
        if (!destFolder.exists()) {
            destFolder.mkdir();
        }

        // Destination file
        File dest = new File(destFolder, fileName + ".png");

        try {
            java.nio.file.Files.copy(
                src.toPath(),
                dest.toPath(),
                java.nio.file.StandardCopyOption.REPLACE_EXISTING
            );
            System.out.println("Screenshot saved at: " + dest.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
