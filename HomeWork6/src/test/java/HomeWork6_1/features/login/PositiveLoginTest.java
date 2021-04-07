package HomeWork6_1.features.login;

import HomeWork6_1.pages.LoginPage;
import org.junit.jupiter.api.Test;
import HomeWork6_1.base.BaseUITest;

import static HomeWork6_1.common.Configuration.BASE_URL;
import static HomeWork6_1.common.Configuration.STUDENT_LOGIN;
import static HomeWork6_1.common.Configuration.STUDENT_PASSWORD;

public class PositiveLoginTest extends BaseUITest {

    @Test
    public void loginWithBaseUserTest() {
        new LoginPage( driver )
                .enterLogin( STUDENT_LOGIN )
                .enterPassword( STUDENT_PASSWORD )
                .clickLoginButton()
                .checkUrl( BASE_URL );
    }
}
