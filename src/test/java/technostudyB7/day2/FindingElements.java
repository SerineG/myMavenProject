package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElements {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techno.study");
        Thread.sleep(3000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().forward();

   //     WebElement sloganText = driver.findElements(By.className("_8eso"));
        WebElement sloganText= driver.findElement(By.className("_8eso"));

        String expectedText = "Connect with friends and the world around you on Facebook.";
        String actText = sloganText.getText();

        if (expectedText.equals(actText)) {
            System.out.println("Verification is done: PASS");
        } else {
            System.out.println("Failed");
            System.out.println("actual text is: " + actText);
        }

    }
}
