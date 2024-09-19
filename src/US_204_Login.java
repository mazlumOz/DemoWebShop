package src;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_204_Login extends BaseDriver {

    @Test

    public void Test1() {

        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        MyFunc.Bekle(1);

        WebElement login = driver.findElement(By.linkText("Log in"));
        login.click();
        MyFunc.Bekle(1);

        WebElement email = driver.findElement(By.xpath("//input [@class ='email']"));
        email.sendKeys("TestUserr123@hotmail.com");
        MyFunc.Bekle(1);

        WebElement password = driver.findElement(By.xpath("//input[@class='password']"));
        password.sendKeys("1Bilgisayar1");
        MyFunc.Bekle(1);


        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
        loginButton.click();
        MyFunc.Bekle(1);



        driver.quit();


    }
}
