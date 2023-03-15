package technostudyB7.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

public class Scroll3 extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.triplebyte.com/");

        Wait(3);
//        <div class="home-white-tag">Hire faster</div>

        WebElement hireFaster=driver.findElement(By.xpath("//div[text()='Hire faster']"));
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", hireFaster);
        System.out.println(hireFaster.getText());


    }
}
