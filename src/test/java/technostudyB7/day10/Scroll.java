package technostudyB7.day10;

import org.openqa.selenium.JavascriptExecutor;
import technostudyB7.Utilities.UtilityClass;

public class Scroll extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.youtube.com/");

        Wait(3);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // window.scrollBy(int x, int y) // positive y value means scroll down, negative y value means scroll up
        // and positive x value means scroll right, negative x value means scroll left by specified pixels
        // window.scrollTo(0, "document.body.scrollHeight") scroll to the end of the page
        // ("arguments[0].scrollIntoView(true);", element) // Scroll to the specified element

        js.executeScript("window.scrollBy( 0,  3000)");
        Wait(2);
        js.executeScript("window.scrollBy(0,-1000)");
        quitDriver(2);



    }
}
