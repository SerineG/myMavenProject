package technostudyB7.Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChatGTP {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();



        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        WebElement start = driver.findElement(By.cssSelector("#start>button"));
        start.click();

        String text = "";
        int counter = 0; // initialize the counter variable
        while (text.equals("")) {
            try {
                WebElement word = driver.findElement(By.cssSelector("#finish>h4"));
                text = word.getText();
            } catch (NoSuchElementException exception) {
                try {
                    Thread.sleep(1000); // wait for 1 second before finding the element again
                    counter++; // increment the counter variable
                    System.out.println("Waiting for the text to appear... Attempt #" + counter);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("The text is: " + text);
        driver.quit();
    }
}
