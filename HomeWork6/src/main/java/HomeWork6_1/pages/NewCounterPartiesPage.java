package HomeWork6_1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import HomeWork6_1.base.BaseView;

public class NewCounterPartiesPage extends BaseView {

    @FindBy(name = "crm_contact[lastName]")
    private WebElement lastNameTextInput;

    @FindBy(name = "crm_contact[firstName]")
    private WebElement firstNameTextInput;

    @FindBy(name = "crm_contact[jobTitle]")
    private WebElement jobTitleTextInput;

    @FindBy(css = "button[class='btn btn-success action-button']")
    private WebElement submitButton;

    public NewCounterPartiesPage(WebDriver driver) {
        super( driver );
    }

    public NewCounterPartiesPage enterLastName(String description) {
        lastNameTextInput.sendKeys( description );
        return this;
    }

    public NewCounterPartiesPage enterFirstName(String description) {
        firstNameTextInput.sendKeys( description );
        return this;
    }

    public NewCounterPartiesPage clickOrganizations() {
        driver.findElement( By.cssSelector( "div[class='select2-container select2 input-widget']" ) ).click();
        driver.findElement( By.xpath( "//*[@id=\"select2-drop\"]/div/input" ) ).sendKeys( "1234" );
        driver.findElement( By.cssSelector( "#select2-drop > ul.select2-results > li > div" ) ).click();
        return this;
    }

    public NewCounterPartiesPage enterJobTitle(String description) {
        jobTitleTextInput.sendKeys( description );
        return this;
    }

    public AllCounterPartiesPage clickSubmit() {
        submitButton.click();
        return new AllCounterPartiesPage( driver );
    }
}