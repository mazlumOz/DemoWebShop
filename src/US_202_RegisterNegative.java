import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_202_RegisterNegative extends BaseDriver {
    @Test
    public void Test1(){
        // Opened to URL link
        driver.get("https://demowebshop.tricentis.com/");

        //Click the register button
        WebElement RgstrButton=driver.findElement(By.xpath("//a[text()='Register']"));
        RgstrButton.click();

        //Enter the First Name Input
        WebElement firstName=driver.findElement(By.xpath("//input[@id=\"FirstName\"]"));
        firstName.sendKeys("Test");

        //Enter the Last Name Input
        WebElement lastName=driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
        lastName.sendKeys("Test1");

        // Enter the Email adress
        WebElement email= driver.findElement(By.xpath("//input[@id=\"Email\"]"));
        email.sendKeys("testuser1@gmail.com");

        //Enter the Password
        WebElement password=driver.findElement(By.xpath("//input[@id=\"Password\"]"));
        password.sendKeys("Testuser1");

        //Confirm the Password
        WebElement passwordAgain=driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]"));
        passwordAgain.sendKeys("Testuser1");

        // Click the register button on Register Page
        WebElement registerButton=driver.findElement(By.xpath("//input[@id=\"register-button\"]"));
        registerButton.click();

        WebElement warningText=driver.findElement(By.xpath("//li[text()=\"The specified email already exists\"]"));
        System.out.println("warningText.getText() = " + warningText.getText());

        BekleKapat();

    }
}
