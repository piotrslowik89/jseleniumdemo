package pl.nahtingale.tests;

import org.testng.annotations.Test;
import pl.nahtingale.pages.HomePage;

public class RegisterTest extends BaseTest {

    @Test
    public void registerUserTest(){
        new HomePage(driver).openMyAccountPage()
        .registerUser("test@test.pl","test@test.pl");

    }
}
