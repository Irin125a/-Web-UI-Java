package HomeWork6_1.enums;

import HomeWork6_1.base.SubMenuButtons;
import org.openqa.selenium.By;

public enum CounterPartiesSubMenuButtons implements SubMenuButtons {

    COUNTER_PARTIES_REQUEST( ".//span[@class='title' and text()='Контактные лица']" );

    private final By by;

    CounterPartiesSubMenuButtons(String xpath) {
        this.by = By.xpath( xpath );
    }

    public By getBy() {
        return by;
    }
}
