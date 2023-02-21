package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        //<input class="gLFyf" jsaction="paste:puy29d;" maxlength="2048" name="q" type="text" aria-autocomplete="both" aria-haspopup="false" autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" role="combobox" spellcheck="false" title="Search" value="" aria-label="Search" data-ved="0ahUKEwjyvsDG66L9AhXaLkQIHbZRAXMQ39UDCAY">

        String input="bamboo pen";
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys(input+ Keys.ENTER);

        String actual=driver.getTitle();
        String expected="bamboo pen - Google Search";
        if (actual.equals(expected)){
            System.out.println("Pass");
        }else {
            System.out.println("Failed");
        }



    }
}
