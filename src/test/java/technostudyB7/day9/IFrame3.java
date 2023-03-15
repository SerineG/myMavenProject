package technostudyB7.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import technostudyB7.Utilities.UtilityClass;

public class IFrame3 extends UtilityClass {
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
//        <iframe id="frame2" data-ezsrc="dropdown-frame.html" class=" ezlazyloaded" ezoid="0.3059332738070446">a</iframe>


        driver.switchTo().defaultContent().switchTo().frame(1);
//        <select class="col-lg-3" id="animals"><option value="cat">Cat</option><option value="babycat">Baby Cat</option>
//        <option value="big baby cat">Big Baby Cat</option><option value="avatar">Avatar</option></select>
        WebElement drop=driver.findElement(By.id("animals"));
        drop.click();
        Select select=new Select(drop);
        Thread.sleep(1000);
        select.selectByValue("big baby cat");




        driver.switchTo().defaultContent();
        //<span>Not a Friendly Topic</span>
        WebElement header=driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
        System.out.println(header.getText());

    }
}
