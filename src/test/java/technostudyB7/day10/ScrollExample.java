package technostudyB7.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

import java.util.List;

public class ScrollExample extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.youtube.com/");
        List<WebElement> videolist= driver.findElements(By.id("video-title"));
        System.out.println(videolist.size());

        while (videolist.size()<100){
            JavascriptExecutor js= (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy( 0,  500)");
            Wait(3);
            videolist=driver.findElements(By.id("video-title"));

        }

        System.out.println(videolist.size());
        System.out.println(videolist.get(100).getText());


    }
}
