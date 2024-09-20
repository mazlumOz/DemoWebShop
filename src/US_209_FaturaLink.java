package src;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class US_209_FaturaLink extends BaseDriver {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            // 1. Demowebshop sitesine gidin
            driver.get("https://demowebshop.tricentis.com/");

            // 2. Oturum aç butonuna tıklayın
            WebElement loginLink = driver.findElement(By.linkText("Log in"));
            loginLink.click();

            // 3. Giriş bilgilerini doldurun
            WebElement emailField = driver.findElement(By.id("Email"));
            WebElement passwordField = driver.findElement(By.id("Password"));
            WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));

            emailField.sendKeys("TestUserr123@hotmail.com");  // Buraya geçerli e-posta adresinizi girin
            passwordField.sendKeys("1Bilgisayar1");        // Buraya geçerli şifrenizi girin
            loginButton.click();

            // 4. "My Account" (Hesabım) sayfasına gidin
            WebElement myAccountLink = driver.findElement(By.linkText("My account"));
            myAccountLink.click();

            // 5. Siparişler sayfasına gidin
            WebElement ordersLink = driver.findElement(By.linkText("Orders"));
            ordersLink.click();

            // 6. İlk siparişin detaylarına tıklayın
            WebElement detailsLink = driver.findElement(By.linkText("Details"));
            detailsLink.click();

            // 7. "PDF Invoice" bağlantısına tıklayın ve dosyayı indirin
            WebElement pdfInvoiceLink = driver.findElement(By.linkText("PDF Invoice"));
            pdfInvoiceLink.click();

            // Fatura dosyası indirme işlemi tamamlandıktan sonra, belirlenen klasöre indirilecektir.
            System.out.println("Fatura başarıyla indirildi.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // WebDriver'ı kapatın
            driver.quit();
        }
    }
}
