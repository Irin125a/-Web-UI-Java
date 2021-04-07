package HomeWork6_1.pages;

import HomeWork6_1.views.NavigationBar;
import org.openqa.selenium.WebDriver;
import HomeWork6_1.base.BaseView;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePage extends BaseView {

    private NavigationBar navigationBar;

    public HomePage(WebDriver driver) {
        super( driver );
        this.navigationBar = new NavigationBar( driver );
    }

    public void checkUrl(String url) {
        assertEquals( driver.getCurrentUrl(), url );
    }

    public NavigationBar getPageNavigation() {
        return navigationBar;
    }
}
