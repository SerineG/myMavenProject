package technostudyB7.Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WaitByTryTech {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
        //<div id="start">
        //    <button>Start</button>
        //  </div>

        WebElement start = driver.findElement(By.cssSelector("#start>button"));
        start.click();


        //<div id="finish" style=""><h4>Hello World!</h4></div>
        String text="";
        while (text.equals("")){
            try {
                WebElement word = driver.findElement(By.cssSelector("#finish>h4"));
                text= word.getText();
            }
            catch (NoSuchElementException exception){
//                int counter=0;
//                while (text.equals("")){
//                    Thread.sleep(2000);
//                    counter++;
//                    if (text.equals("Hello World!")){
//                        break;
//                    }
//                }
            }
        }
        System.out.println(text);

      //copied  WebElement word = driver.findElement(By.cssSelector("#finish>h4"));

//        String actual = word.getText();
//        String expected = "Hello World!";
//        if (actual.equals(expected)) {
//            System.out.println("Pass");
//        } else {
//            System.out.println("Failed");
//            System.out.println("The hidden word is: \"Hello World\"");
//        }

//
    }
}
