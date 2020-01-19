package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.HomePage;
import utils.SeleniumUtils;

public class HomePageTest extends TestBase {
    HomePage home;
    DashboardPage dash;

    @BeforeMethod
    public void setUp () {
        initializer();
        home = new HomePage();
        dash = new DashboardPage();
    }

    @AfterMethod
    public void tearDown () {
        driver.quit();
    }

    @Test
    public void verifyHomeTitle () {
        SeleniumUtils.waitForVisibility(home.logIn_Btn);
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @Test (groups = {"smoke"})
    public void testLoginBtn () {
        SeleniumUtils.clickElement(home.logIn_Btn);
        String expectedTitle = "Dashboard";
        Assert.assertEquals(SeleniumUtils.getText(dash.dashTitle), expectedTitle);
    }
}
