package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtils;

public class HomePage extends TestBase {
    public HomePage () {
        PageFactory.initElements(driver, this); // or HomePage.class
    }
    @FindBy (id = "btnLogin")
    public WebElement logIn_Btn;

    public void navToDash () {
        SeleniumUtils.clickElement(logIn_Btn);
    }
}
