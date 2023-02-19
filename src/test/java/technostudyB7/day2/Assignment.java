package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        //<input type="text" class="form-control" placeholder="Enter value" id="sum1">
        //<input type="text" class="form-control" placeholder="Enter value" id="sum2">
        //<button type="button" onclick="return total()" class="btn btn-default">Get Total</button>
        int numOne = 3;
        int numTwo = 5;


        WebElement num1 = driver.findElement(By.id("sum1"));
        num1.sendKeys(Integer.toString(numOne));
        WebElement num2 = driver.findElement(By.id("sum2"));
        num2.sendKeys(Integer.toString(numTwo));
       // WebElement result = driver.findElement(By.cssSelector("button [onclick='return total()']"));
        WebElement result=driver.findElement(By.cssSelector("Button[onclick='return total()']"));
        result.click();

        //<span id="displayvalue">8</span>

        WebElement getResult=driver.findElement(By.id("displayvalue"));

        //verification

        String actual=getResult.getText();
        String expected="8";
        if (actual.equals(expected)){
            System.out.println("PASS");
        }else {
            System.out.println("Failed");
        }
        Thread.sleep(3000);
        driver.quit();

    }
}
