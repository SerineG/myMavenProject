package technostudyB7.day10;

import org.openqa.selenium.JavascriptExecutor;
import technostudyB7.Utilities.UtilityClass;

public class Scroll2 extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.triplebyte.com/");

        Wait(3);
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Wait(2);
        js.executeScript("window.scrollTo(0,0);");
    }
}
