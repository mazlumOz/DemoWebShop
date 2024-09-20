package src;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class US_206_OrderingSiparisVerme extends BaseDriver {

    @Test
    public void US_206_TC_0601_SiparisVermeOrder(){

        driver.get("https://demowebshop.tricentis.com/");


        Actions aksiyonlar=new Actions(driver);

        WebElement logIn=driver.findElement(By.className("ico-login"));
        logIn.click();


        WebElement email=driver.findElement(By.className("email"));
        email.sendKeys("TestUserr123@hotmail.com");


        WebElement password=driver.findElement(By.className("password"));
        password.sendKeys("1Bilgisayar1");


        WebElement logInBtn=driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        new Actions(driver).moveToElement(logInBtn).click().build().perform();


        WebElement computers=driver.findElement(By.cssSelector("ul[class='top-menu']> :nth-child(2)"));
        aksiyonlar.moveToElement(computers).build().perform();


        WebElement notebooks=driver.findElement(By.cssSelector("ul[class='sublist firstLevel active']> :nth-child(2)"));
        notebooks.click();


        WebElement laptop=driver.findElement(By.linkText("14.1-inch Laptop"));
        new Actions(driver).moveToElement(laptop).click().build().perform();



        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='add-to-cart-button-31']")));
        WebElement addToCart=driver.findElement(By.cssSelector("[id='add-to-cart-button-31']"));
        addToCart.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='ico-cart']> :nth-child(1)")));
        WebElement shoppingCart=driver.findElement(By.cssSelector("[class='ico-cart']> :nth-child(1)"));
        shoppingCart.click();


        wait.until(ExpectedConditions.elementToBeClickable(By.id("CountryId")));
        WebElement country=driver.findElement(By.id("CountryId"));
        Select countryElement=new Select(country);
        countryElement.selectByValue("77");

        WebElement estimateBtn=driver.findElement(By.name("estimateshipping"));
        estimateBtn.click();




        WebElement zip=driver.findElement(By.id("ZipPostalCode"));
        zip.sendKeys("38000");


        WebElement checkBox=driver.findElement(By.id("termsofservice"));
        checkBox.click();


        WebElement checkout=driver.findElement(By.id("checkout"));
        checkout.click();


        WebElement company=driver.findElement(By.id("BillingNewAddress_Company"));
        company.sendKeys("Fake Company");


        wait.until(ExpectedConditions.elementToBeClickable(By.id("BillingNewAddress_CountryId")));
        WebElement country2=driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select countryElement2=new Select(country2);
        countryElement2.selectByValue("77");

        WebElement city=driver.findElement(By.id("BillingNewAddress_City"));
        city.sendKeys("istanbul");


        WebElement address1=driver.findElement(By.id("BillingNewAddress_Address1"));
        address1.sendKeys("12.Fake Street");
        ;

        WebElement address2=driver.findElement(By.id("BillingNewAddress_Address2"));
        address2.sendKeys("Apartment 1");


        WebElement zipCode=driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        zipCode.sendKeys("38000");


        WebElement phoneNu=driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        phoneNu.sendKeys("+9051112223344");

        WebElement continueBtn=driver.findElement(By.cssSelector("[class='button-1 new-address-next-step-button']"));
        continueBtn.click();


        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[onclick='Shipping.save()']")));
        WebElement continueBtn2=driver.findElement(By.cssSelector("[onclick='Shipping.save()']"));
        continueBtn2.click();



        WebElement shippingMethod=driver.findElement(By.id("shippingoption_1"));
        shippingMethod.click();


        WebElement continueBtn3=driver.findElement(By.cssSelector("[class='button-1 shipping-method-next-step-button']"));
        continueBtn3.click();


        WebElement paymentMethod=driver.findElement(By.id("paymentmethod_2"));
        paymentMethod.click();


        WebElement continueBtn4=driver.findElement(By.cssSelector("[onclick='PaymentMethod.save()']"));
        continueBtn4.click();



        wait.until(ExpectedConditions.elementToBeClickable(By.id("CreditCardType")));
        WebElement selectCard=driver.findElement(By.id("CreditCardType"));
        Select javaCart=new Select(selectCard);
        javaCart.selectByValue("Visa");

        WebElement cardName=driver.findElement(By.id("CardholderName"));
        cardName.sendKeys("Ezgi Demirci");

        WebElement cardNumber=driver.findElement(By.id("CardNumber"));
        cardNumber.sendKeys("4242424242424242");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("ExpireMonth")));
        WebElement expirationSelect=driver.findElement(By.id("ExpireMonth"));
        Select expirationJava=new Select(expirationSelect);
        expirationJava.selectByValue("1");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("ExpireYear")));
        WebElement dataSelect=driver.findElement(By.id("ExpireYear"));
        Select dataJava=new Select(dataSelect);
        dataJava.selectByValue("2032");

        WebElement cardCode=driver.findElement(By.id("CardCode"));
        cardCode.sendKeys("123");

        WebElement continueBtn5=driver.findElement(By.cssSelector("[onclick='PaymentInfo.save()']"));
        continueBtn5.click();

        WebElement confirm=driver.findElement(By.cssSelector("[onclick='ConfirmOrder.save()']"));
        confirm.click();

        WebElement msj=driver.findElement(By.xpath("//*[text()='Your order has been successfully processed!']"));
        System.out.println("Mesaj kutusu = "+msj.getText());

        Assert.assertTrue("Mesaj bulunmadı", msj.getText().equalsIgnoreCase("Your order has been successfully processed!"));

        WebElement orderNumber=driver.findElement(By.cssSelector("[class='details']> :nth-child(1)"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='details']> :nth-child(1)")));


        String orderNu=orderNumber.getText().substring(13);

        System.out.println("orderNumber = " + orderNu);



        WebElement continueBtn6=driver.findElement(By.cssSelector("[class='buttons']> :nth-child(1)"));
        continueBtn6.click();

        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement anasayfaOrders=driver.findElement(By.linkText("Orders"));
        js.executeScript("arguments[0].click()", anasayfaOrders);

        WebElement orderNuKarsilastirma=driver.findElement(By.cssSelector("[class='section order-item']> :nth-child(1)"));


        wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/customer/orders"));
        Assert.assertTrue("Beklenen Order numarsına ulaşılmadı.",orderNuKarsilastirma.getText().contains(orderNu));

        BekleKapat();

    }

}
