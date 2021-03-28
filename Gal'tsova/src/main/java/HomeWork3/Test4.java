package HomeWork3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Test4 {

    private static final WebDriver driver;

    static {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.addArguments( "--disable-notifications" );
        options.addArguments( "--disable-popup-blocking" );

        driver = new ChromeDriver( options );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 15, TimeUnit.SECONDS );
    }

    public static void main(String[] args) throws InterruptedException {

        driver.get( "https://geekbrains.ru/" );

        driver.findElement( By.xpath( "//a[contains(.,'Тесты')]" ) ).click();

        driver.findElement( By.cssSelector( "body > div.gb__main-wrapper > div.page-content > div > div:nth-child(5) > div.test-card__inf > ul > li:nth-child(1) > a" ) ).click();

        driver.findElement( By.cssSelector( "body > div.gb__main-wrapper > div.page-content > div > div.gb-test-page__left.test-control > a" ) ).click();

        /*
        После нажатия появляется модальное окно с формой регистрации
        Тест показал, что незарегистрированный пользователь не может пройти тест на сайте
         */

        sleep( 4000 );

        driver.quit();
    }
}


