package test.switchToTest;

import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.getBaseUrl;
import static pages.BasePage.driver;


public class AlertTest extends BaseTest {

    private String newurl = getBaseUrl()+ "Alerts.html";



    @Test

    public void CheckAlerts(){
        driver.get(newurl);

        //Alert with OK
        alert.clickAlertTabWithOk();
        alert.clickCancelButtonOnAlert();

        //Alert with cancel
        alert.clickAlertTabWithCancel();
        alert.clickCancelButtonOnAlert();

        //Alert with Textbox
        alert.clickAlertTabWithText();
        alert.sendDataToAlert("Vine primavara");
        alert.clickOkButtonOnAlert();

    }
}
