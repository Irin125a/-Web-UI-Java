package HomeWork6_1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import HomeWork6_1.base.BaseView;

public class NewProjectsPage extends BaseView {

    @FindBy(name = "crm_project[name]")
    private WebElement nameTextInput;

    @FindBy(name = "crm_project[businessUnit]")
    private WebElement businessUnitDropDownSelect;

    @FindBy(name = "crm_project[curator]")
    private WebElement curatorDropDownSelect;

    @FindBy(name = "crm_project[rp]")
    private WebElement rpDropDownSelect;

    @FindBy(name = "crm_project[administrator]")
    private WebElement administratorDropDownSelect;

    @FindBy(name = "crm_project[manager]")
    private WebElement managerDropDownSelect;

    @FindBy(css = "button[class='btn btn-success action-button']")
    private WebElement submitButton;

    public NewProjectsPage(WebDriver driver) {
        super( driver );
    }

    public NewProjectsPage enterName(String description) {
        nameTextInput.sendKeys( description );
        return this;
    }

    // TODO: improve input with ENUM
    public NewProjectsPage selectBusinessUnit(int value) {
        Select businessUnitDropDown = new Select( businessUnitDropDownSelect );
        businessUnitDropDown.selectByValue( String.valueOf( value ) );
        return this;
    }

    public NewProjectsPage clickOrganizations() {
        driver.findElement( By.cssSelector( "div[class='select2-container select2 input-widget']" ) ).click();
        driver.findElement( By.xpath( "//*[@id=\"select2-drop\"]/div/input" ) ).sendKeys( "1234" );
        driver.findElement( By.cssSelector( "#select2-drop > ul.select2-results > li > div" ) ).click();
        return this;
    }

    // TODO: improve input with ENUM
    public NewProjectsPage selectCurator(String value) {
        Select curatorDropDown = new Select( curatorDropDownSelect );
        curatorDropDown.selectByVisibleText( String.valueOf( value ) );
        return this;
    }

    // TODO: improve input with ENUM
    public NewProjectsPage selectRp(String value) {
        Select rpDropDown = new Select( rpDropDownSelect );
        rpDropDown.selectByVisibleText( String.valueOf( value ) );
        return this;
    }

    // TODO: improve input with ENUM
    public NewProjectsPage selectAdministrator(String value) {
        Select administratorDropDown = new Select( administratorDropDownSelect );
        administratorDropDown.selectByVisibleText( String.valueOf( value ) );
        return this;
    }

    // TODO: improve input with ENUM
    public NewProjectsPage selectManager(String value) {
        Select managerDropDown = new Select( managerDropDownSelect );
        managerDropDown.selectByVisibleText( String.valueOf( value ) );
        return this;
    }

    public AllProjectsPage clickSubmit() {
        submitButton.click();
        return new AllProjectsPage( driver );
    }
}
