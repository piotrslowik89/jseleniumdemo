package pl.nahtingale.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.nahtingale.pages.HomePage;

public class RegisterTest extends BaseTest {

    @Test
    public void registerUserTest() {
        WebElement dashboardLink = new HomePage(driver).openMyAccountPage()
                .registerUser("test4@test.pl", "test@test.pl").getDashboardLink();


        Assert.assertEquals(dashboardLink.getText(), "Dashboard");

    }
}
