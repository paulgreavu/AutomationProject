package test.homepageTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;
import static pages.BasePage.sleep;

public class homepageTest extends BaseTest {

    @Test
    public void testLogoIsDisplayed() {
        Assert.assertTrue(homePage.checkLogo(), "Logo is not displayed");
        homePage.clickSignInButton();
        sleep(2000);
        homePage.clickBack();
        homePage.clickSkipSignInButton();
        homePage.clickBack();
        sleep(2000);
        homePage.checkEmailField("adresa@email.com");
        homePage.clickNextButton();
        homePage.clickBack();
        homePage.clickSignInButton();
        homePage.checkEmailField2("adresa2@email.com");
        homePage.checkPassField("parola");
        sleep(2000);
        homePage.clickEnterButton();
        sleep(2000);


    }
}
