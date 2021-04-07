package HomeWork6_1.views;

import org.openqa.selenium.WebDriver;
import HomeWork6_1.base.BaseView;
import HomeWork6_1.base.SubMenu;
import HomeWork6_1.base.SubMenuButtons;
import HomeWork6_1.enums.ProjectsSubMenuButtons;
import HomeWork6_1.pages.AllProjectsPage;

class ProjectSubMenu extends SubMenu {

    public ProjectSubMenu(WebDriver driver) {
        super( driver );
    }

    @Override
    public BaseView clickSubMenuButton(SubMenuButtons buttons) {
        if (buttons instanceof ProjectsSubMenuButtons) {
            switch ((ProjectsSubMenuButtons) buttons) {
                case PROJECTS_REQUEST:
                    driver.findElement( ( (ProjectsSubMenuButtons) buttons ).getBy() ).click();
                    return new AllProjectsPage( driver );
                default:
                    throw new IllegalArgumentException( "Not implemented yet" );
            }
        } else {
            throw new IllegalArgumentException( "Incorrect button type" );
        }
    }
}
