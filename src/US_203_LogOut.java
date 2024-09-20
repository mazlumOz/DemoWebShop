package src;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class US_203_LogOut extends BaseDriver {

    @Test

    public void Test()
    {
        driver.get("https://demowebshop.tricentis.com");

        WebElement loginButton1=driver.findElement(By.xpath("//a[@class='ico-login']"));
        loginButton1.click();
        MyFunc.Bekle(2);

        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("TestUserr123@hotmail.com");
        MyFunc.Bekle(2);

        WebElement password=driver.findElement(By.id("Password"));
        password.sendKeys("1Bilgisayar1");
        MyFunc.Bekle(2);

        WebElement loginButton2=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginButton2.click();
        MyFunc.Bekle(2);

        WebElement checkName = driver.findElement(By.linkText("TestUserr123@hotmail.com"));
        Assert.assertEquals("TestUserr123@hotmail.com", checkName.getText());

        WebElement logout=driver.findElement(By.xpath("//a[@class='ico-logout']"));
        logout.click();
        MyFunc.Bekle(2);

        WebElement logInText=driver.findElement(By.xpath("//a[text()='Log in']"));

        System.out.print("Log in görünür durumda mı? : "+logInText.isDisplayed());
        Assert.assertTrue("Log in görüntülenemiyor!",logInText.getText().contains("Log in"));

        BekleKapat();



















    }
}
