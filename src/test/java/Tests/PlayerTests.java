package Tests;

import PageObjects.LoginPageObject;
import PageObjects.PlayerPageObject;
import PageObjects.SeriesAndPricingPageObject;
import framework.BaseWebAutomationTest;
import org.junit.Before;
import org.junit.Test;

public class PlayerTests extends BaseWebAutomationTest {

    private SeriesAndPricingPageObject seriesAndPricingPage;
    private PlayerPageObject playerPage;
    private LoginPageObject loginPage;

    @Before
    public void setUp() throws InterruptedException {
        seriesAndPricingPage = new SeriesAndPricingPageObject();
        playerPage = new PlayerPageObject();
        loginPage = new LoginPageObject();
        loginPage.navigateTo();
        loginPage.login("test@alnoortv.com","!1234?");
    }

    @Test
    public void playSeriesTest() throws InterruptedException {
        seriesAndPricingPage.pricingButton();
        seriesAndPricingPage.seriesButton();
        seriesAndPricingPage.seriesDetailButton();
        playerPage.PlayerInteract();
    }

}



