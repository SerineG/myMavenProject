package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisabled {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        //<button autocomplete="off" type="button" onclick="swapInput()">Enable</button>

        //<form id="input-example">
        //    <input type="text" disabled="" style="width: 30%;">
        //    <button autocomplete="off" type="button" onclick="swapInput()">Enable</button>
        //  </form>

        WebElement enableButton=driver.findElement(By.cssSelector("#input-example>button"));
        WebElement input=driver.findElement(By.cssSelector("#input-example>input"));
        boolean ifItIsEnabled=input.isEnabled();
        System.out.println(ifItIsEnabled);
        enableButton.click();
        Thread.sleep(3000);
        boolean ifItIsEnabled2=input.isEnabled();
        System.out.println(ifItIsEnabled2);




    }
}
