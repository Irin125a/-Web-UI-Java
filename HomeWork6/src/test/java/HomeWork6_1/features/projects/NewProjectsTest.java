package HomeWork6_1.features.projects;

import HomeWork6_1.enums.NavigationBarTabs;
import HomeWork6_1.enums.ProjectsSubMenuButtons;
import HomeWork6_1.pages.AllProjectsPage;
import HomeWork6_1.pages.LoginPage;
import org.junit.jupiter.api.Test;
import HomeWork6_1.base.BaseUITest;
import HomeWork6_1.common.Configuration;
import HomeWork6_1.pages.NewProjectsPage;

import java.util.Random;

public class NewProjectsTest extends BaseUITest {

    @Test
    public void createNewProjectsPositiveTest() {
        AllProjectsPage expensesScreen = (AllProjectsPage) new LoginPage( driver )
                .authoriseScenario( Configuration.STUDENT_LOGIN, Configuration.STUDENT_PASSWORD )
                .getPageNavigation()
                .moveCursorToNavigationTab( NavigationBarTabs.PROJECTS )
                .clickSubMenuButton( ProjectsSubMenuButtons.PROJECTS_REQUEST );

        expensesScreen
                .clickOnCreateNewProjectsButton()
                .enterName( Integer.toString( new Random().nextInt() ) )
                .clickOrganizations()
                .selectBusinessUnit( 1 )
                .selectCurator( "Юзеров Юзер" )
                .selectRp( "Литвиненко Станислав" )
                .selectAdministrator( "Студентов Студент" )
                .selectManager( "Горячев Алексей" )
                .clickSubmit();
//            .checkNewExpensePopUp();
    }
}
