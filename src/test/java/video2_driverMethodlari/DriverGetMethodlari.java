package video2_driverMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethodlari {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        // 1- driver.get(url)==> yazdigimiz url 'ye gider
        driver.get("https://amazon.com");

        // 2- driver.getTitle()==> icinde oldugu sayfanin basligini dondurur
        System.out.println("sayfa title : " + driver.getTitle());// Amayon.com.Spend less.Smile more

        // 3- driver.getCurrentUrl()==> icinde oldugu sayfanin URL'sini dondurur
        System.out.println(driver.getCurrentUrl());//https://amazon.com/

       // 4- driver.getPageSource()==> icinde oldugu sayfanin kaynak kodlarini dondurur
        System.out.println("==========================================================");
        System.out.println(driver.getPageSource());
        System.out.println("==========================================================");

        // 5-driver.getWindowHandle()==> icinde oladugu sayfanin UNIQUE has kodunu dondurur
        System.out.println(driver.getWindowHandle());

        // 6-driver.getWindowHandles()==> driver calisirken acilan tum sayfalarin UNIQUE hash kodunu dondurur



    }
}
