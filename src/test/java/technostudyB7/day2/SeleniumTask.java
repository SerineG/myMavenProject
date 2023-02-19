package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement theWord = driver.findElement(By.id("user-message"));
        theWord.sendKeys("Hi how are you?");
       WebElement button = driver.findElement(By.cssSelector("button[class='btn btn-default']"));
       // WebElement button = driver.findElement(By.className("btn btn-default"));
        button.click();

        //<span id="display">Hi how are you?</span>
        WebElement result=driver.findElement(By.id("display"));
        result.getText();
        System.out.println(result.getText());
        String expected="Hi how are you?";
        String actual=result.getText();
        if (expected.equals(actual)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
    }
}
