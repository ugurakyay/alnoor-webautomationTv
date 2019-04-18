package Tests;

import PageObjects.LoginPageObject;
import framework.BaseWebAutomationTest;
import org.junit.Before;
import org.junit.Test;

public class LoginTests extends BaseWebAutomationTest {

    private LoginPageObject loginPage;

    @Before
    public void setUp(){
        loginPage = new LoginPageObject();
        loginPage.navigateTo();
    }

    @Test
    public  void  successfullyTest() throws InterruptedException {
        loginPage.login("test@alnoortv.com","!1234?");
        loginPage.logout();
    }
}
