package pages.switchTo;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class Alert extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(Alert.class);
    private static Alert instance;

    private By alertTabWithOk = By.xpath("//a[@href='#OKTab']");
    private By alertTabWithCancel = By.xpath("//a[@href='#CancelTab']");
    private By alertTabWithText = By.xpath("//a[@href='#Textbox']");

    private By triggerOkAlert = By.xpath("//button[@onclick='alertbox()']");
    private By triggerCancelAlert = By.xpath("//button[@onclick='confirmbox()']");
    private By triggerTextBoxAlert = By.xpath("//button[@onclick='promptbox()']");


    private Alert() {

    }

    public static Alert getInstance() {
        if (instance == null) {
            instance = new Alert();
        }
        return instance;
    }

    public void clickAlertTabWithOk(){
        driver.findElement(alertTabWithOk).click();
        driver.findElement(triggerOkAlert).click();
    }

    public void clickAlertTabWithCancel(){
        driver.findElement(alertTabWithCancel).click();
        driver.findElement(triggerCancelAlert).click();
    }

    public void clickAlertTabWithText(){
        driver.findElement(alertTabWithText).click();
        driver.findElement(triggerTextBoxAlert).click();
    }

    public void clickOkButtonOnAlert(){
        driver.switchTo().alert().accept();
    }

    public void clickCancelButtonOnAlert(){
        driver.switchTo().alert().dismiss();
    }

    public void sendDataToAlert(String data){
        driver.switchTo().alert().sendKeys(data);
    }


}




