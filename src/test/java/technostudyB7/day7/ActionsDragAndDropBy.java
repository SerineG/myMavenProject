package technostudyB7.day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragAndDropBy {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

//        <div class="ui-slider-range ui-widget-header ui-corner-all" style="left: 21.2%; width: 38.8%;"></div>

//        <span class="ui-slider-handle ui-state-default ui-corner-all" tabindex="0" style="left: 60%;"></span>
        WebElement rightScroll=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-state-default ui-corner-all'][2]"));
        Actions actions=new Actions(driver);
        Thread.sleep(5000);

        Action scrollAction=actions.dragAndDropBy(rightScroll, 100,0).build();
        scrollAction.perform();

        Action scrollAction2=actions.dragAndDropBy(rightScroll, -100,0).build();
        scrollAction2.perform();

    }
}
