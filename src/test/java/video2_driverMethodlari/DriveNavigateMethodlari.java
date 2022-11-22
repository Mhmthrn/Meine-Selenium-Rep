package video2_driverMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriveNavigateMethodlari {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

       // 1- driver.navigate().to("url");==> istenen URL'ye gider
       //    driver.get("url");==> ile ayni isi yapar ama forward ve back yapilmasina imkan tanir
        driver.get("https://amazon.com");
        driver.navigate().to("https://www.facebook.com");

       // 2- driver.navigate().back();==> bir onceki sayfaya donus yapar
        driver.navigate().back();// amazona donus yapacak

       // 3- driver.navigate().forward();==> back() ile geldigi sayfaya yeniden gider
        driver.navigate().forward();// facebook 'a gitmis oluruz

       // 4- driver.navigate().refresh();==> icinde oldugu sayfayi yenileyecek
        driver.navigate().refresh();

        // driver olusturuldugunda acilan sayfayi kapatmak istersek
       //driver.close();

       // driver calisirken birden fazla tab veya windov actiysa tumunu kapatmak icin
       driver.quit();



    }
}
