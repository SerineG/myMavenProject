package technostudyB7.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com");
        System.out.println("Title of page"+driver.getTitle());
        String expectedTitle="Selenium Easy - Best Demo website to practice Selenium Webdriver Online";
        String actualTitle=driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Pass");
        }else {
            System.out.println("Failed");
            System.out.println(actualTitle);
        }
        Thread.sleep(3000);

        String TeslaIRL="https://www.tesla.com/";
        driver.navigate().to("https://www.tesla.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }

}
