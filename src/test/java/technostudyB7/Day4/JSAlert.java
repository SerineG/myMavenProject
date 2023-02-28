package technostudyB7.Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JSAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        // alert <button onclick="jsAlert()">Click for JS Alert</button>

        // result <p id="result" style="color:green">You successfully clicked an alert</p>

//        WebElement alertButton=driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
//        alertButton.click();
//        String jsAlertText=driver.switchTo().alert().getText();
//        System.out.println(jsAlertText);
//        driver.switchTo().alert().accept();
//
//        WebElement result=driver.findElement(By.id("result"));
//        System.out.println(result.getText());

        //<button onclick="jsConfirm()">Click for JS Confirm</button>

//        WebElement jsConfirm=driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
//        jsConfirm.click();
//        String textJSConfirm=driver.switchTo().alert().getText();
//        System.out.println(textJSConfirm);
//        driver.switchTo().alert().dismiss();


        //<button onclick="jsPrompt()">Click for JS Prompt</button>

        WebElement jsPrompt = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        jsPrompt.click();
        driver.switchTo().alert().sendKeys("Hi, how are you?");
        driver.switchTo().alert().accept();
        WebElement result = driver.findElement(By.id("result"));
        System.out.println(result.getText());


        // WebElement result=driver.findElement(By)

    }
}
