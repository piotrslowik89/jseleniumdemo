package pl.nahtingale.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.nahtingale.pages.HomePage;

public class LogInTest extends BaseTest {

    @Test
    public void LogInTest() {
        WebElement dashboardLink = new HomePage(driver)
                .openMyAccountPage()
                .logInValidData("test1@test.pl", "test@test.pl")
                .getDashboardLink();


        Assert.assertEquals(dashboardLink.getText(), "Dashboard");

    }

    @Test
    public void logInWithInvalidPasswordTest() {
        WebElement error = new HomePage(driver)
                .openMyAccountPage()
                .logInInvalidData("test1@test.pl", "te@test.pl")
                .getError();


        Assert.assertTrue(error.getText().contains("Incorrect username or password."), "Expected error doesn't match");
    }

}
