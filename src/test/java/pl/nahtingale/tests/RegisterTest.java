package pl.nahtingale.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.nahtingale.pages.HomePage;

public class RegisterTest extends BaseTest {

    @Test
    public void registerUserTest() {
        int random = (int) (Math.random() * 1000);

        WebElement dashboardLink = new HomePage(driver).openMyAccountPage()
                .registerUser("test" + random + "@test.pl", "test@test.pl").getDashboardLink();


        Assert.assertEquals(dashboardLink.getText(), "Dashboard");

    }

    @Test
    public void registerUserWithSameEmailTest() {
        WebElement error = new HomePage(driver).openMyAccountPage()
                .registerUser("test1@test.pl", "test@test.pl").getError();


        Assert.assertTrue(error.getText().contains("An account is already registered with your email address"));
    }

}
