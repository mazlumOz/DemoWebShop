package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;

    //bunun şartı extends olması ve başta yer alması
    //public static void BaslangicIslemleri() // tearStart()
    static // tearStart()
    {

        driver=new ChromeDriver();
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));

        // driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti


    }
    public static void BekleKapat() // tearDown()
    {
        MyFunc.Bekle(3);
        driver.quit();
    }
}
