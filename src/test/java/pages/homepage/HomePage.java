package pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class HomePage extends BasePage{
    private static final Logger LOG = LoggerFactory.getLogger(HomePage.class);
    public static HomePage instance;

    private By logo = By.id("logo");
    private By signInButton = By.id("btn1");
    private By skipSignInButton = By.id("btn2");
    private By emailField = By.id("email");
    private By nextButton = By.id("enterimg");
    private By emailField2 = By.xpath("//input[@type='text']");
    private By passField = By.xpath("//input[@type='password']");
    private By enterButton = By.id("enterbtn");






    private HomePage(){

    }

    public static HomePage getInstance(){
        if (instance == null){
            instance = new HomePage();
        }
        return instance;
    }

    public boolean checkLogo() {
        LOG.info("Check if Logo is displayed");
        return driver.findElement(logo).isDisplayed();
    }

    public void clickSignInButton(){
        LOG.info("Click sign in button");
        driver.findElement(signInButton).click();
    }

    public void clickSkipSignInButton(){
        LOG.info("Click skip sign in button");
        driver.findElement(skipSignInButton).click();
    }

    public void clickBack(){
        LOG.info("Click the browser back button");
        driver.navigate().back();
    }

    public void checkEmailField(String email){
        LOG.info("Check email field");
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickNextButton() {
        LOG.info("Click next button");
        driver.findElement(nextButton).click();
    }

    public void checkEmailField2(String email2){
        LOG.info("Check email field 2");
        driver.findElement(emailField2).sendKeys(email2);
    }

    public void checkPassField(String pass){
        LOG.info("Check password field");
        driver.findElement(passField).sendKeys(pass);
    }

    public void clickEnterButton(){
        LOG.info("Click enter button");
        driver.findElement(enterButton).click();
    }









}
