package technostudyB7.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

public class IFrame2 extends UtilityClass {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://chercher.tech/practice/frames");
        driver.switchTo().frame(0);
        WebElement topicInput=driver.findElement(By.tagName("input"));
        topicInput.sendKeys("John Doe");
//        <iframe id="frame3" data-ezsrc="checkbox.html" class=" ezlazyloaded" ezoid="0.23435265163701424">a</iframe>
        WebElement frame=driver.findElement(By.id("frame3"));
        driver.switchTo().frame(frame);
//        <input id="a" type="checkbox">
        WebElement check=driver.findElement(By.id("a"));
        check.click();
        Thread.sleep(3000);

        driver.switchTo().defaultContent();
        //<span>Not a Friendly Topic</span>
        WebElement header=driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
        System.out.println(header.getText());




    }
}
