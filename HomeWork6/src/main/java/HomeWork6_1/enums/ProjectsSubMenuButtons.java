package HomeWork6_1.enums;

import HomeWork6_1.base.SubMenuButtons;
import org.openqa.selenium.By;

public enum ProjectsSubMenuButtons implements SubMenuButtons {

    PROJECTS_REQUEST( ".//span[@class='title' and text()='Мои проекты']" );

    private final By by;

    ProjectsSubMenuButtons(String xpath) {
        this.by = By.xpath( xpath );
    }

    public By getBy() {
        return by;
    }
}
