package technostudyB7.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import technostudyB7.Utilities.UtilityClass;

public class Example3 extends UtilityClass {
    public static void main(String[] args) {
        /** Navigate to https://www.phptravels.net
         * Click on Account button
         * Click on Customer Sign Up
         * Fill the form
         * Check the "I am not robot" check box
         * Click on Sign Up button
         * Check if the title is "Login - PHPTRAVELS"
         * Enter same login information that you used during registration and click login
         * Verify the welcome message contains the first name that you used during registration then close the browser
         *
         * Note: You can use any locator you want.
         * */



        driver.get("https://www.phptravels.net");

//        <button class="btn btn-primary dropdown-toggle waves-effect" type="button" id="ACCOUNT" data-bs-toggle="dropdown" aria-expanded="false">
//                                    <svg class="pe-1" xmlns="http://www.w3.org/2000/svg" width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="#ffffff" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"><path d="M20 21v-2a4 4 0 0 0-4-4H8a4 4 0 0 0-4 4v2"></path><circle cx="12" cy="7" r="4"></circle></svg>
//                                    Account                                    <i class="la la-angle-down"></i>
//                                    </button>
        WebElement accountButton=driver.findElement(By.id("ACCOUNT"));
        accountButton.click();
//        <a class="dropdown-item waves-effect" href="https://phptravels.net/signup">Customer Signup</a>
        WebElement signUp=driver.findElement(By.linkText("Customer Signup"));
        signUp.click();
//        <input class="form-control" type="text" placeholder="First Name" name="first_name" value="" required="">

        WebElement inputName=driver.findElement(By.name("first_name")); //(By.cssSelector("#type>placeholder='First Name'"));
        inputName.sendKeys("Hello");
//        <input class="form-control" type="text" placeholder="Last Name" name="last_name" value="" required="">
        WebElement inputLastName=driver.findElement(By.name("last_name"));
        inputLastName.sendKeys("How are you?");
//        <input class="form-control" type="text" placeholder="Phone" name="phone" value="" required="">

        WebElement phone=driver.findElement(By.name("phone"));
        phone.sendKeys("818747787");

//        <input class="form-control" type="text" placeholder="Email" name="email" value="" required="">
        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("Hello@gmail.com");

//        <input class="form-control" type="password" placeholder="Password" name="password" value="" required="">

        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("Iamgood7");



//        <span class="recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox" role="checkbox"
//        aria-checked="false" id="recaptcha-anchor" tabindex="0" dir="ltr" aria-labelledby="recaptcha-anchor-label">
//        <div class="recaptcha-checkbox-border" role="presentation"></div><div class="recaptcha-checkbox-borderAnimation"
//        role="presentation"></div><div class="recaptcha-checkbox-spinner" role="presentation"><div class="recaptcha-checkbox-spinner-overlay">
//        </div></div><div class="recaptcha-checkbox-checkmark" role="presentation"></div></span>

//        WebElement checkBox=driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
//        checkBox.click();

//        WebDriverWait wait=new WebDriverWait(driver,60);
//        wait.until(ExpectedConditions.elementToBeClickable())



    }
}
