package HomeWork6_1.features.projects;

import HomeWork6_1.enums.NavigationBarTabs;
import HomeWork6_1.enums.CounterPartiesSubMenuButtons;
import HomeWork6_1.pages.AllCounterPartiesPage;
import HomeWork6_1.pages.LoginPage;
import org.junit.jupiter.api.Test;
import HomeWork6_1.base.BaseUITest;
import HomeWork6_1.common.Configuration;

import java.util.Random;

public class NewCounterPartiesTest extends BaseUITest {

    @Test
    public void createNewCounterPartiesPositiveTest() {
        AllCounterPartiesPage expensesScreen = (AllCounterPartiesPage) new LoginPage( driver )
                .authoriseScenario( Configuration.STUDENT_LOGIN, Configuration.STUDENT_PASSWORD )
                .getPageNavigation()
                .moveCursorToNavigationTab( NavigationBarTabs.COUNTER_PARTIES )
                .clickSubMenuButton( CounterPartiesSubMenuButtons.COUNTER_PARTIES_REQUEST );

        expensesScreen
                .clickOnCreateNewCounterPartiesButton()
                .enterLastName( Integer.toString( new Random().nextInt() ) )
                .enterFirstName( Integer.toString( new Random().nextInt() ) )
                .clickOrganizations()
                .enterJobTitle( Integer.toString( new Random().nextInt() ) )
                .clickSubmit();
//            .checkNewExpensePopUp();
    }
}