package technostudyB7.day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickAndHold {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        //        <div class="dragableBox" id="box3" dragableelement="2">Washington</div>
        WebElement washington=driver.findElement(By.id("box3"));
        //        <div id="box103" class="dragableBoxRight">United States</div>
        WebElement US=driver.findElement(By.id("box103"));

        Actions actions=new Actions(driver);
        Action ClAndHoldWash=actions.clickAndHold(washington).build();
        ClAndHoldWash.perform();
        Action moveWash=actions.moveToElement(US).release().build();
        moveWash.perform();



    }
}
