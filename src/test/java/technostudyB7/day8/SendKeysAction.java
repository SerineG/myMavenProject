package technostudyB7.day8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SendKeysAction {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/auto-complete");

//        Actions actions=
//<div class="auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3"><div class="auto-complete__placeholder css-1wa3eu0-placeholder"></div><div class="css-1g6gooi"><div class="auto-complete__input" style="display: inline-block;"><input autocapitalize="none" autocomplete="off" autocorrect="off" id="autoCompleteMultipleInput" spellcheck="false" tabindex="0" type="text" aria-autocomplete="list" value="" style="box-sizing: content-box; width: 2px; background: 0px center; border: 0px; font-size: inherit; opacity: 1; outline: 0px; padding: 0px; color: inherit;"><div style="position: absolute; top: 0px; left: 0px; visibility: hidden; height: 0px; overflow: scroll; white-space: pre; font-size: 16px; font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, Roboto, &quot;Helvetica Neue&quot;, Arial, &quot;Noto Sans&quot;, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;, &quot;Noto Color Emoji&quot;; font-weight: 400; font-style: normal; letter-spacing: normal; text-transform: none;"></div></div></div></div>
        WebElement name=driver.findElement(By.cssSelector("div[class=\"auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3\"]"));
        Actions actions=new Actions(driver);
        Action shift=actions.moveToElement(name).click().keyDown(Keys.SHIFT).sendKeys("J").keyUp(Keys.SHIFT).sendKeys("ohn").build();
        shift.perform();
    }
}
