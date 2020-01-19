package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.HomePage;
import utils.SeleniumUtils;

public class DashboardPageTest extends TestBase {
    DashboardPage dash;
    HomePage home;

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

    @Test (groups = {"smoke"})
    public void verifyNewsPage () {
        home.navToDash();
        dash.navToNewsPage();
        Assert.assertEquals(SeleniumUtils.getText(dash.dashTitle),"News List");
    }
}
