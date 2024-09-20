package src;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_201_Register extends BaseDriver {
    @Test

    public void Test1(){

        driver.get("https://demowebshop.tricentis.com/");

        MyFunc.Bekle(2);

        WebElement register= driver.findElement(By.xpath("//a[@href='/register']"));
        register.click();
        MyFunc.Bekle(2);

        WebElement gender= driver.findElement(By.xpath("//*[@id='gender-male']"));
        gender.click();

        WebElement firstName= driver.findElement(By.xpath("//*[@name='FirstName']"));
        firstName.sendKeys("Yusuf");
        MyFunc.Bekle(2);
        WebElement lastName= driver.findElement(By.xpath("//*[@name='LastName']"));
        lastName.sendKeys("Dikeç");
        MyFunc.Bekle(2);
        WebElement email= driver.findElement(By.xpath("//*[@id='Email']"));
        email.sendKeys("tanlialperen20@gmail.com");
        MyFunc.Bekle(2);
        WebElement password= driver.findElement(By.xpath("//*[@id='Password']"));
        password.sendKeys("projeicin1A");

        WebElement passwordConfirm= driver.findElement(By.xpath("//*[@id='ConfirmPassword']"));
        passwordConfirm.sendKeys("projeicin1A");

        WebElement registerSignin= driver.findElement(By.xpath("//*[@id='register-button']"));
        registerSignin.click();

        BekleKapat();



    }

}
