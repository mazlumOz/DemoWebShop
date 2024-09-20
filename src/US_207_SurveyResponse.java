package src;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_207_SurveyResponse extends BaseDriver {

    @Test

    public void Test1(){

        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        MyFunc.Bekle(1);

        WebElement exButton = driver.findElement(By.xpath("//input[@value='1']"));
        exButton.click();
        MyFunc.Bekle(1);

        WebElement voteButton = driver.findElement(By.xpath("//input[@value='Vote']"));
        voteButton.click();
        MyFunc.Bekle(1);

        try {
            WebElement errorMessage = driver.findElement(By.xpath("//div[contains(@class,'validation-summary-errors')]"));
            System.out.println("Uyarı mesajı: " + errorMessage.getText());
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("Hata mesajı görünmüyor, giriş yapılmış olabilir.");
        }
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

        WebElement exButtonA = driver.findElement(By.xpath("//input[@value='1']"));
        exButtonA.click();
        MyFunc.Bekle(1);

        WebElement voteButtonB = driver.findElement(By.xpath("//input[@value='Vote']"));
        voteButtonB.click();
        MyFunc.Bekle(1);







    }
}
