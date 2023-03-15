package technostudyB7.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

import java.util.Set;

public class Window extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev");
        String mainPageId= driver.getWindowHandle();
//        <a href="https://seleniumconf.com/register/?utm_source=seleniumhq&amp;utm_medium=banner" target="_blank" aria-pressed="true">Get Tickets</a>
        //WebElement registerLink=driver.findElement(By.cssSelector("a[href='https://seleniumconf.com/register/?utm_source=seleniumhq&amp;utm_medium=banner/']"));
        WebElement registerLink=driver.findElement(By.linkText("Get Tickets"));
        registerLink.click();

        Set<String> allIds = driver.getWindowHandles();
        for (String id:allIds){
            if (!id.equals(mainPageId)){
                driver.switchTo().window(id);
            }
        }



        System.out.println(driver.getTitle());

    }
}
