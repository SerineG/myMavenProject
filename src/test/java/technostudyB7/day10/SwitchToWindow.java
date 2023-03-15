package technostudyB7.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

import java.util.List;
import java.util.Set;

public class SwitchToWindow extends UtilityClass {
    public static void main(String[] args) {

        String mainTab=driver.getWindowHandle();
        driver.get("https://www.selenium.dev");
        List<WebElement>links=driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement link:links){
            if (!link.getAttribute("href").contains("mailto")){
                link.click();
            }

        }
        Set<String> idList=driver.getWindowHandles();
        for (String id:idList){
            if(!id.equals(idList)){
                driver.switchTo().window(id);
                System.out.println(driver.getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(mainTab);
        System.out.println(driver.getTitle());
        driver.quit();


    }

}
