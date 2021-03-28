package HomeWork3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Test2 {

    private static final String LOGIN_PAGE_URL = "https://crm.geekbrains.space/user/login";
    private static final String STUDENT_LOGIN = "Applanatest";
    private static final String STUDENT_PASSWORD = "Student2020!";
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
        login();

        driver.findElement( By.xpath( "//*[@id=\"main-menu\"]/ul/li/a" ) ).click();

        driver.findElement( By.xpath( ".//span[@class='title' and text()='Контактные лица']" ) ).click();

        sleep( 5000 );
        driver.findElement( By.cssSelector( "div[class='pull-left btn-group icons-holder" ) ).click();

        sleep( 2000 );
        driver.findElement( By.name( "crm_contact[lastName]" ) ).sendKeys( "Фамилия" );

        driver.findElement( By.name( "crm_contact[firstName]" ) ).sendKeys( "Имя" );

        driver.findElement( By.cssSelector( "div[class='select2-container select2 input-widget']" ) ).click();
        driver.findElement( By.xpath( "//*[@id=\"select2-drop\"]/div/input" ) ).sendKeys( "1234" );
        driver.findElement( By.cssSelector( "#select2-drop > ul.select2-results > li > div" ) ).click();

        driver.findElement( By.name( "crm_contact[jobTitle]" ) ).sendKeys( "Должность" );

        driver.findElement( By.cssSelector( "button[class='btn btn-success action-button']" ) ).click();

        driver.quit();
    }

    private static void login() {
        driver.get( LOGIN_PAGE_URL );

        WebElement loginTextInput = driver.findElement( By.cssSelector( "input[id='prependedInput']" ) );
        loginTextInput.sendKeys( STUDENT_LOGIN );

        WebElement passwordTextInput = driver.findElement( By.cssSelector( ".span2[name='_password']" ) );
        passwordTextInput.sendKeys( STUDENT_PASSWORD );

        WebElement loginButton = driver.findElement( By.xpath( ".//button[@name='_submit']" ) );
        loginButton.click();
    }
}
