package technostudyB7.day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClick {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/buttons");
        //<button id="doubleClickBtn" type="button" class="btn btn-primary">Double Click Me</button>
        WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));

        Actions actions = new Actions(driver);
        Action doubleClickButton = actions.doubleClick(doubleClick).build();
        doubleClickButton.perform();
//<button id="rightClickBtn" type="button" class="btn btn-primary">Right Click Me</button>
        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        Actions rightClick =actions.contextClick(rightClickButton).contextClick();
        rightClick.perform();
//        <button id="2fUaK" type="button" class="btn btn-primary">Click Me</button>

        WebElement click=driver.findElement(By.xpath("//button[text()='Click Me']"));
        Action clickButton=actions.click(click).build();
        clickButton.perform();
//        Second way
        Action doubleClickAction=actions.moveToElement(doubleClick).doubleClick().build();
        doubleClickAction.perform();



        //<p id="doubleClickMessage">You have done a double click</p>
//        WebElement expected=driver.findElement(By.id("doubleClickMessage"));
//
//        String actual="You have done a double click";
//        if (actual.equals(expected.getText())){
//            System.out.println("Pass");
//        }else {
//            System.out.println("Fail");
//        }

    }
}
