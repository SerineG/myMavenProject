package technostudyB7.day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IDidIt {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

       // WebDriverWait wait=new WebDriverWait(driver,10);

        driver.get("https://demoqa.com/selectable/");

        WebElement first=driver.findElement(By.xpath("//li[@class='mt-2 list-group-item list-group-item-action']"));
        first.click();

//        WebElement selected=driver.findElement(By.xpath("//li[@class='mt-2 list-group-item active list-group-item-action']"));
//                //mt-2 list-group-item active list-group-item-action



        String selected = first.getAttribute("class");
        if (selected.contains("item active list")) {
            System.out.println("First item is highlighted");
        } else {
            System.out.println("First item is not highlighted");
        }


    }
}
