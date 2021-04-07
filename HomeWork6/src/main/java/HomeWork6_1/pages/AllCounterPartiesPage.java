package HomeWork6_1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import HomeWork6_1.base.BaseView;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AllCounterPartiesPage extends BaseView {

    @FindBy(css = "div[class='pull-left btn-group icons-holder']")
    private WebElement createNewCounterPartiesButton;

    public AllCounterPartiesPage(WebDriver driver) {
        super( driver );
    }

    public NewCounterPartiesPage clickOnCreateNewCounterPartiesButton() {
        createNewCounterPartiesButton.click();
        return new NewCounterPartiesPage( driver );
    }

//    public AllExpensesPage checkNewExpensePopUp() {
//        String message = wait10second.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(
//            "div[class='message']"))).getText();
//        assertTrue(message.contains("Проект сохранён"));
//        return this;
//    }
}
