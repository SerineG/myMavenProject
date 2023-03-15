package technostudyB7.day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FromGtp {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver,10);
        driver.get("https://demoqa.com/selectable/");

        // Find the first item and click it
        WebElement first = driver.findElement(By.xpath("//li[@class='mt-2 list-group-item list-group-item-action']"));
        first.click();

        // Verify that the first item is highlighted
        String firstClass = first.getAttribute("class");
        Thread.sleep(7000);
        if (firstClass.contains("ui-selected")) {
            System.out.println("First item is highlighted");
        } else {
            System.out.println("First item is not highlighted");
        }


    }
}


