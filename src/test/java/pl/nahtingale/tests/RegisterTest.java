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
                .registerUser("test" +random+"@test.pl", "test@test.pl").getDashboardLink();


        Assert.assertEquals(dashboardLink.getText(), "Dashboard");

    }
}
