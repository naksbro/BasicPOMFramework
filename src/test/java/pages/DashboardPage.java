package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtils;

public class DashboardPage extends TestBase {
    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (className = "page-title")
    public WebElement dashTitle;

    @FindBy (id = "menu_admin_viewAdminModule")
    public WebElement adminBtn;

    @FindBy (id = "menu_news_Announcements")
    public WebElement announceBtn;

    @FindBy (id = "menu_news_viewNewsList")
    public WebElement newsBtn;

    public void navToNewsPage () {
        SeleniumUtils.clickElement(adminBtn);
        SeleniumUtils.clickElement(announceBtn);
        SeleniumUtils.clickElement(newsBtn);
    }
}
