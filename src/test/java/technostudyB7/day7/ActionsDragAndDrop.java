package technostudyB7.day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragAndDrop {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

//        <div class="dragableBox" id="box3" dragableelement="2">Washington</div>

        WebElement washington=driver.findElement(By.id("box3"));

        System.out.println(washington.getCssValue("background-color"));
//        <div id="box103" class="dragableBoxRight">United States</div>
        WebElement US=driver.findElement(By.id("box103"));

        Actions actions=new Actions(driver);

        Action dragAndDropWashington=actions.dragAndDrop(washington,US).build();
        dragAndDropWashington.perform();
        System.out.println(washington.getCssValue("background-color"));

        //<div class="dragableBox" id="box4" dragableelement="3" style="visibility: visible;">Copenhagen</div>

        WebElement copenhagen=driver.findElement(By.id("box4"));
//      <div id="box104" class="dragableBoxRight">Denmark</div>
        WebElement denmark=driver.findElement(By.id("box104"));



        Action dragAndDropCopenhagen=actions.dragAndDrop(copenhagen,denmark).build();
        dragAndDropCopenhagen.perform();



    }
}
