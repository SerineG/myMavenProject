package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

        //<div id="start">
        //    <button>Start</button>
        //  </div>

        //<div id="finish" style="">
        //    <h4>Hello World!</h4>
        //  </div>


        WebElement text=driver.findElement(By.cssSelector("#finish>h4"));
//        boolean isShown= text.isDisplayed();
//        System.out.println(isShown);
        System.out.println(text.isDisplayed());


        WebElement startButton=driver.findElement(By.cssSelector("#start>button"));
        startButton.click();
        Thread.sleep(5000);

        System.out.println(text.isDisplayed());

//        boolean isShownNow=text.isDisplayed();
//        System.out.println(isShownNow);
    }
}
