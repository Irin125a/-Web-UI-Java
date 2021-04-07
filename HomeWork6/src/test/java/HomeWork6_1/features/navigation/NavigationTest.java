package HomeWork6_1.features.navigation;

import HomeWork6_1.enums.NavigationBarTabs;
import HomeWork6_1.pages.LoginPage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import HomeWork6_1.base.BaseUITest;
import HomeWork6_1.common.Configuration;

public class NavigationTest extends BaseUITest {

    @ParameterizedTest
    @MethodSource("navigationTabProvider")
    public void checkMainNavigationTabsTest(NavigationBarTabs barTab) {
        new LoginPage( driver )
                .authoriseScenario( Configuration.STUDENT_LOGIN, Configuration.STUDENT_PASSWORD )
                .getPageNavigation()
                .checkTabVisibility( barTab );

    }

    static NavigationBarTabs[] navigationTabProvider() {
        return NavigationBarTabs.values();
    }

}
