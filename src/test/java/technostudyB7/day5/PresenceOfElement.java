package technostudyB7.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PresenceOfElement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.seleniumeasy.com/");
        //<a href="/testng-tutorials" title="">TestNG</a>
        WebElement testNG=driver.findElement(By.linkText("TestNG"));
        testNG.click();
        WebDriverWait wait=new WebDriverWait(driver,10);

        //<h1>TestNG Tutorials</h1>
//        <div class="section-title">
//        <h1>TestNG Tutorials</h1>
//		</div>
        WebElement textNJText=driver.findElement(By.cssSelector(".section-title"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".section-title")));
        System.out.println(textNJText.getText());





    }
}
