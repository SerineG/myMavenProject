package technostudyB7.Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitlyWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
        //<div id="start">
        //    <button>Start</button>
        //  </div>

        WebElement start=driver.findElement(By.cssSelector("#start>button"));
        start.click();
        Thread.sleep(5000);

        //<div id="finish" style=""><h4>Hello World!</h4></div>

        WebElement word=driver.findElement(By.cssSelector("#finish>h4"));

        String actual= word.getText();
        String expected="Hello World!";
        if(actual.equals(expected)){
            System.out.println("Pass");
        }else {
            System.out.println("Failed");
            System.out.println("The hidden word is: \"Hello World\"");
        }

//        Thread.sleep(10000);
//        driver.quit();

    }
}
