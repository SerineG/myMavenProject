package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAddressVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String email="serine@gmail.com";
        String password= "12345";
        driver.get("https://www.facebook.com");

      //  WebElement emailBox= driver.findElements(By.id("email"));
        WebElement emailBox=driver.findElement(By.id("email"));
        emailBox.sendKeys(email);
      //  WebElement passwordBox=driver.findElements(By.cssSelector("input[type='password']"));
        WebElement passwordBox=driver.findElement(By.cssSelector("input[type='password']"));
        passwordBox.sendKeys(password);
        WebElement login=driver.findElement(By.cssSelector("button[type='submit']"));
        login.click();
        driver.quit();


    }
}
