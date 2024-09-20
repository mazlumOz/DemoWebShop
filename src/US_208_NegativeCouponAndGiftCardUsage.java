package src;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class US_208_NegativeCouponAndGiftCardUsage extends BaseDriver {

    @Test

    public void Test()
    {
        driver.get("https://demowebshop.tricentis.com");
        MyFunc.Bekle(2);

        WebElement loginButton1=driver.findElement(By.xpath("//a[@class='ico-login']"));
        loginButton1.click();
        MyFunc.Bekle(2);

        WebElement email=driver.findElement(By.cssSelector("[id='Email']"));
        email.sendKeys("TestUserr123@hotmail.com");
        MyFunc.Bekle(2);

        WebElement password=driver.findElement(By.cssSelector("[id='Password']"));
        password.sendKeys("1Bilgisayar1");
        MyFunc.Bekle(2);

        WebElement loginButton2=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginButton2.click();
        MyFunc.Bekle(2);

        Actions aksiyonlar=new Actions(driver);
        MyFunc.Bekle(2);

        WebElement computers=driver.findElement(By.xpath("(//*[@href='/computers'])[1]"));
        Action aksiyon=aksiyonlar.moveToElement(computers).build();
        aksiyon.perform();
        MyFunc.Bekle(2);

        WebElement notebooks=driver.findElement(By.xpath("(//*[@href='/notebooks'])[1]"));
        notebooks.click();
        MyFunc.Bekle(2);

        WebElement laptopLinki=driver.findElement(By.linkText("14.1-inch Laptop"));
        laptopLinki.click();
        MyFunc.Bekle(2);

        WebElement addToCart=driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']"));
        addToCart.click();
        MyFunc.Bekle(2);

        WebElement shoppingCart=driver.findElement(By.xpath("//span[text()='Shopping cart']"));
        shoppingCart.click();
        MyFunc.Bekle(2);

        WebElement applyCoupon=driver.findElement(By.xpath("//input[@value='Apply coupon']"));
        applyCoupon.click();
        MyFunc.Bekle(2);

        WebElement txt=driver.findElement(By.xpath("//div[@class='message']"));
        Assert.assertTrue("Uyarı mesajına ulaşılamadı!",txt.getText().contains("couldn't be applied"));

        WebElement addGiftCard=driver.findElement(By.xpath("//input[@name='applygiftcardcouponcode']"));
        addGiftCard.click();

        WebElement txt2=driver.findElement(By.cssSelector("[class='message']"));
        Assert.assertTrue("Uyarı mesajına ulaşılamadı!",txt2.getText().contains("couldn't be applied"));

        WebElement Ulke=driver.findElement(By.xpath("//*[@id='CountryId']"));
        Select Country=new Select(Ulke);
        MyFunc.Bekle(2);

        Country.selectByVisibleText("United States");
        MyFunc.Bekle(2);

        WebElement eyalet=driver.findElement(By.xpath("//*[@id='StateProvinceId']"));
        Select State=new Select(eyalet);
        MyFunc.Bekle(2);

        State.selectByVisibleText("Texas");
        MyFunc.Bekle(2);

        WebElement kabul=driver.findElement(By.id("termsofservice"));
        kabul.click();
        MyFunc.Bekle(2);

        WebElement checkOut=driver.findElement(By.cssSelector("[id='checkout']"));
        checkOut.click();

        WebElement company=driver.findElement(By.id("BillingNewAddress_Company"));
        company.sendKeys("Fake Company");

        WebElement country2=driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select countryElement2=new Select(country2);
        countryElement2.selectByValue("77");

        WebElement city=driver.findElement(By.id("BillingNewAddress_City"));
        city.sendKeys("istanbul");

        WebElement address1=driver.findElement(By.id("BillingNewAddress_Address1"));
        address1.sendKeys("12.Fake Street");

        WebElement address2=driver.findElement(By.id("BillingNewAddress_Address2"));
        address2.sendKeys("Apartment 1");

        WebElement zipCode=driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        zipCode.sendKeys("38000");

        WebElement phoneNu=driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        phoneNu.sendKeys("+9051112223344");

        WebElement continueBtnn=driver.findElement(By.cssSelector("[class='button-1 new-address-next-step-button']"));
        continueBtnn.click();

        WebElement continueBtn2=driver.findElement(By.cssSelector("[onclick='Shipping.save()']"));
        continueBtn2.click();
        MyFunc.Bekle(2);

        WebElement shippingMethod=driver.findElement(By.id("shippingoption_1"));
        shippingMethod.click();
        MyFunc.Bekle(2);

        WebElement continueBtn3=driver.findElement(By.cssSelector("[class='button-1 shipping-method-next-step-button']"));
        continueBtn3.click();
        MyFunc.Bekle(2);

        WebElement paymentMethod=driver.findElement(By.id("paymentmethod_2"));
        paymentMethod.click();
        MyFunc.Bekle(2);

        WebElement continueBtn4=driver.findElement(By.cssSelector("[onclick='PaymentMethod.save()']"));
        continueBtn4.click();
        MyFunc.Bekle(2);
        
        WebElement selectCard=driver.findElement(By.id("CreditCardType"));
        Select javaCart=new Select(selectCard);
        javaCart.selectByValue("Visa");

        WebElement cardName=driver.findElement(By.id("CardholderName"));
        cardName.sendKeys("Ezgi Demirci");

        WebElement cardNumber=driver.findElement(By.id("CardNumber"));
        cardNumber.sendKeys("4242424242424242");

        WebElement expirationSelect=driver.findElement(By.id("ExpireMonth"));
        Select expirationJava=new Select(expirationSelect);
        expirationJava.selectByValue("1");

        WebElement dataSelect=driver.findElement(By.id("ExpireYear"));
        Select dataJava=new Select(dataSelect);
        dataJava.selectByValue("2032");

        WebElement cardCode=driver.findElement(By.id("CardCode"));
        cardCode.sendKeys("123");

        WebElement continueBtn5=driver.findElement(By.cssSelector("[onclick='PaymentInfo.save()']"));
        continueBtn5.click();

        WebElement confirm=driver.findElement(By.cssSelector("[class='button-1 confirm-order-next-step-button']"));
        confirm.click();

        WebElement tebrikler=driver.findElement(By.xpath("(//div[@class='section order-completed' ])//strong"));
        Assert.assertTrue("Mesaj görüntülenemedi!",tebrikler.getText().contains("successfully processed!"));

        WebElement continueBtn6=driver.findElement(By.cssSelector("[class='button-2 order-completed-continue-button']"));
        continueBtn6.click();


        BekleKapat();




    }
}
