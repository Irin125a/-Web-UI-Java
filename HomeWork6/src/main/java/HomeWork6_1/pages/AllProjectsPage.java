package HomeWork6_1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import HomeWork6_1.base.BaseView;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AllProjectsPage extends BaseView {

    @FindBy(css = "div[class='pull-left btn-group icons-holder']")
    private WebElement createNewProjectsButton;

    public AllProjectsPage(WebDriver driver) {
        super( driver );
    }

    public NewProjectsPage clickOnCreateNewProjectsButton() {
        createNewProjectsButton.click();
        return new NewProjectsPage( driver );
    }

//    public AllExpensesPage checkNewExpensePopUp() {
//        String message = wait10second.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(
//            "div[class='message']"))).getText();
//        assertTrue(message.contains("Проект сохранён"));
//        return this;
//    }
}
