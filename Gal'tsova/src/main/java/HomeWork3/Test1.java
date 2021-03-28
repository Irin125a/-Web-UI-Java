package HomeWork3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Test1 {

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

        driver.findElement( By.xpath( ".//ul[@class='nav nav-multilevel main-menu']/li[@class='dropdown']/a[@class='unclickable']/span[text()='Проекты']" ) ).click();

        driver.findElement( By.xpath( ".//span[@class='title' and text()='Мои проекты']" ) ).click();

        sleep( 5000 );
        driver.findElement( By.cssSelector( "div[class='pull-left btn-group icons-holder" ) ).click();

        sleep( 2000 );
        driver.findElement( By.name( "crm_project[name]" ) ).sendKeys( "test2" );

        driver.findElement( By.cssSelector( "div[class='select2-container select2 input-widget']" ) ).click();
        driver.findElement( By.xpath( "//*[@id=\"select2-drop\"]/div/input" ) ).sendKeys( "1234" );
        driver.findElement( By.cssSelector( "#select2-drop > ul.select2-results > li > div" ) ).click();

        Select businessUnitDropDown = new Select( driver.findElement( By.name( "crm_project[businessUnit]" ) ) );
        businessUnitDropDown.selectByValue( "1" );

        Select curatorDropDown = new Select( driver.findElement( By.name( "crm_project[curator]" ) ) );
        curatorDropDown.selectByVisibleText( "Юзеров Юзер" );

        Select leaderDropDown = new Select( driver.findElement( By.name( "crm_project[rp]" ) ) );
        leaderDropDown.selectByVisibleText( "Литвиненко Станислав" );

        Select administratorDropDown = new Select( driver.findElement( By.name( "crm_project[administrator]" ) ) );
        administratorDropDown.selectByVisibleText( "Студентов Студент" );

        Select managerDropDown = new Select( driver.findElement( By.name( "crm_project[manager]" ) ) );
        managerDropDown.selectByVisibleText( "Горячев Алексей" );

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
