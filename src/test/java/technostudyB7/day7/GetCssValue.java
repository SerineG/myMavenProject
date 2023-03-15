package technostudyB7.day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
    public static void main(String[] args) {
        //https://www.snapdeal.com
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //<input autocomplete="off" name="keyword" type="text" class="col-xs-20 searchformInput keyword"
        // id="inputValEnter" onkeypress="clickGo(event, this)" placeholder="Search products &amp;
        // brands" value="" fdprocessedid="xal49m" strtindx="" endindx="">

        driver.get("https://www.snapdeal.com");

        WebElement searchInput=driver.findElement(By.id("inputValEnter"));

        System.out.println("searchInput.getAttribute(\"autocomplete\")"+searchInput.getAttribute("autocomplete"));
        System.out.println(" searchInput.getAttribute(\"name\")"+ searchInput.getAttribute("name"));
        System.out.println("searchInput.getAttribute(\"id\")"+searchInput.getAttribute("id"));
        System.out.println("searchInput.getCssValue(\"background\")"+searchInput.getCssValue("background"));
        System.out.println("searchInput.getCssValue(\"font-family\")"+searchInput.getCssValue("font-family"));
        System.out.println("searchInput.getCssValue(\"color\")"+searchInput.getCssValue("color"));
    }
}
