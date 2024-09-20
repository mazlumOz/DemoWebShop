package src;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_205_NegativeLogin extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.xpath("//a[@href='/login'][text()='Log in']"));
        login.click();
        MyFunc.Bekle(2);

        WebElement EMailGiris = driver.findElement(By.xpath("//input[@id='Email']"));
        EMailGiris.click();
        MyFunc.Bekle(2);

        EMailGiris.sendKeys("");
        MyFunc.Bekle(2);

        WebElement passwordGiris = driver.findElement(By.xpath("//input[@id='Password']"));
        passwordGiris.click();
        MyFunc.Bekle(2);

        passwordGiris.sendKeys("");
        MyFunc.Bekle(2);

        WebElement login2 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        login2.click();
        MyFunc.Bekle(2);

        BekleKapat();
    }

    @Test
    public void Test2() {
        // Geçerli e-posta, boş şifreyi dene
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.xpath("//a[@href='/login'][text()='Log in']"));
        login.click();
        MyFunc.Bekle(2);

        WebElement EMailInput = driver.findElement(By.xpath("//input[@id='Email']"));
        EMailInput.click();
        MyFunc.Bekle(2);

        EMailInput.sendKeys("TestUserr123@hotmail.com");
        MyFunc.Bekle(2);

        WebElement passwordKey = driver.findElement(By.xpath("//input[@id='Password']"));
        passwordKey.click();
        MyFunc.Bekle(2);

        passwordKey.sendKeys("");
        MyFunc.Bekle(2);

        WebElement login2 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        login2.click();
        MyFunc.Bekle(2);

        BekleKapat();
    }

    @Test
    public void Test3() {
        //boş e posta , Gecerli sifre
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.xpath("//a[@href='/login'][text()='Log in']"));
        login.click();
        MyFunc.Bekle(2);

        WebElement EMailGiris = driver.findElement(By.xpath("//input[@id='Email']"));
        EMailGiris.click();
        MyFunc.Bekle(2);

        EMailGiris.sendKeys("");
        MyFunc.Bekle(2);

        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='Password']"));
        passwordInput.click();
        MyFunc.Bekle(2);

        passwordInput.sendKeys("1Bilgisayar1");
        MyFunc.Bekle(2);

        WebElement login2 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        login2.click();
        MyFunc.Bekle(2);

        BekleKapat();
    }

    @Test
    public void Test4() {
        //gecersız e postaa ve sıfre
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.xpath("//a[@href='/login'][text()='Log in']"));
        login.click();
        MyFunc.Bekle(2);

        WebElement EMailIntput = driver.findElement(By.xpath("//input[@id='Email']"));
        EMailIntput.click();
        MyFunc.Bekle(2);

        EMailIntput.sendKeys("alayınaİsyan@gmail.com");
        MyFunc.Bekle(2);

        WebElement passwordButton = driver.findElement(By.xpath("//input[@id='Password']"));
        passwordButton.click();
        MyFunc.Bekle(2);

        passwordButton.sendKeys("2bilgisayar1");
        MyFunc.Bekle(2);

        WebElement loginButton2 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginButton2.click();
        MyFunc.Bekle(2);

        BekleKapat();

    }


}