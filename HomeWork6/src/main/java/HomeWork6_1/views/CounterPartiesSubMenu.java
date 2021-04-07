package HomeWork6_1.views;

import org.openqa.selenium.WebDriver;
import HomeWork6_1.base.BaseView;
import HomeWork6_1.base.SubMenu;
import HomeWork6_1.base.SubMenuButtons;
import HomeWork6_1.enums.CounterPartiesSubMenuButtons;
import HomeWork6_1.pages.AllCounterPartiesPage;

class CounterPartiesSubMenu extends SubMenu {

    public CounterPartiesSubMenu(WebDriver driver) {
        super( driver );
    }

    @Override
    public BaseView clickSubMenuButton(SubMenuButtons buttons) {
        if (buttons instanceof CounterPartiesSubMenuButtons) {
            switch ((CounterPartiesSubMenuButtons) buttons) {
                case COUNTER_PARTIES_REQUEST:
                    driver.findElement( ( (CounterPartiesSubMenuButtons) buttons ).getBy() ).click();
                    return new AllCounterPartiesPage( driver );
                default:
                    throw new IllegalArgumentException( "Not implemented yet" );
            }
        } else {
            throw new IllegalArgumentException( "Incorrect button type" );
        }
    }
}
