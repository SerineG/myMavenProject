package technostudyB7.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import technostudyB7.Utilities.UtilityClass;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Robot1 extends UtilityClass {
    public static void main(String[] args) throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");
        Wait(5);
        Robot robot = new Robot();
        for (int i = 0; i < 21; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            Wait(1);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Wait(2);

        StringSelection StringSelection = new StringSelection("\"C:\\Users\\serin\\OneDrive\\Desktop\\up to date.txt\"");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(StringSelection, StringSelection);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Wait(1);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

//        <input type="checkbox" class="field_check" id="terms" name="terms">
        WebElement check = driver.findElement(By.id("terms"));
        check.click();
//        <button type="button" id="submitbutton" name="send" class="btn buttoncolor has-spinner" style="color:#000;"> <span class="spinner"><img src="images/spinner.gif" width="15" height="15"></span>Submit File</button>

        WebElement submit=driver.findElement(By.id("submitbutton"));
        submit.click();

        WebDriverWait wait = new WebDriverWait(driver,(10));

        WebElement successMessage = driver.findElement(By.id("res"));
        wait.until(ExpectedConditions.visibilityOf(successMessage));

        System.out.println(successMessage.getText().contains("successfully"));

    }
}
