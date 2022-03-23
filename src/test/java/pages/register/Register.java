package pages.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class Register extends BasePage {

    private static final Logger LOG = LoggerFactory.getLogger(Register.class);
    private static Register instance;

    //FORM
    private By title = By.xpath("//div[h1='Automation Demo Site ']");

    //Full name
    private By firstName = By.xpath("//input[@ng-model='FirstName']");
    private By lastName = By.xpath("//input[@ng-model='LastName']");

    //Adress
    private By address = By.xpath("//textarea[@ng-model='Adress']");

    //Emailaddress
    private By emailAddress = By.xpath("//input[@ng-model='EmailAdress']");

    //Phone
    private By phone = By.xpath("//input[@ng-model='Phone']");

    //Gender
    private By genderm = By.xpath("//input[@value='Male']");
    private By genderf = By.xpath("//input[@value='FeMale']");

    //Hobbies
    private By cricket = By.id("checkbox1");
    private By movies = By.id("checkbox2");
    private By hockey = By.id("checkbox1");

    //Dropdown Languages
    private By languages = By.id("msdd");
    String selectLanguage = "//a[contains(text(), '%s')]";

    //Dropdown Skills
    String selectSkills = "Skills";

    //Countries
    private By country = By.id("countries");

    //Select Country
    private By selectCountry = By.xpath("//span[@role='combobox']");
    private By enterCountry = By.xpath("//input[@role='textbox']");

    //Date of birth
    String selectYear = "yearbox";
    String selectMonth = "//select[@ng-model='monthbox']";
    String selectDay = "daybox";

    //Password
    private By passwordField = By.id("firstpassword");

    //Confirm Password
    private By confirmPassField = By.id("secondpassword");

    //Choose a file
    private By chooseFileBtn = By.id("imagesrc");


    //Submit button
    private By submitButton = By.id("submitbtn");

    //Refresh button
    private By refreshButton = By.id("Button1");







    private Register(){
    }

    public static Register getInstance(){
        if (instance == null){
            instance = new Register();
        }
        return instance;
    }

    public boolean checkTitle(){
        return driver.findElement(title).isDisplayed();
    }

    public void setFullName(String fname, String lname){
        LOG.info("Set full name in form");
        driver.findElement(firstName).sendKeys(fname);
        driver.findElement(lastName).sendKeys(lname);
    }

    public void setAddress(String enterAdress){
        LOG.info("Set adress in form");
        driver.findElement(address).sendKeys(enterAdress);
    }

    public void setEmailAddress(String email){
        LOG.info("Set email address in form");
        driver.findElement(emailAddress).sendKeys(email);
    }

    public void setPhone(String number){
        LOG.info("Set phone number in form");
        driver.findElement(phone).sendKeys(number);
    }

    public void setGenderMale(){
        LOG.info("Set gender in form");
        driver.findElement(genderm).click();
    }

    public void setGenderFeMale(){
        LOG.info("Set gender in form");
        driver.findElement(genderf).click();
    }

    public void setHobbiesCricket(){
        LOG.info("Set hobbies in form");
        driver.findElement(cricket).click();
    }

    public void setHobbiesMovies(){
        LOG.info("Set hobbies in form");
        driver.findElement(movies).click();
    }

    public void setHobbiesHockey(){
        LOG.info("Set hobbies in form");
        driver.findElement(hockey).click();
    }

    public void setLanguages (String language){
        LOG.info("Set language in form");
        driver.findElement(languages).click();
        driver.findElement(By.xpath(String.format(selectLanguage, language))).click();
    }

    public void setSkills (String skill){
        LOG.info("Set Skill");
        Select newSkill = new Select (driver.findElement(By.id(selectSkills)));
        newSkill.selectByValue(skill);
    }

    public void setCountry(){
        LOG.info("Set country");
        driver.findElement(country).click();
    }

    public void selectCountry (String country){
        LOG.info("Select country");
        driver.findElement(selectCountry).click();
        driver.findElement(enterCountry).sendKeys(country);
    }

    public void setDateOfBirth (String year, String month, String day){
        LOG.info("Set date of birth in form");
        Select newYear = new Select(driver.findElement(By.id(selectYear)));
        newYear.selectByValue(year);
        Select newMonth = new Select(driver.findElement(By.xpath(selectMonth)));
        newMonth.selectByValue(month);
        Select newDay = new Select(driver.findElement(By.id(selectDay)));
        newDay.selectByValue(day);
    }


    public void setPassword (String password, String confirmpassword) {
        LOG.info("Set password in form");
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(confirmPassField).sendKeys(confirmpassword);
    }

    public void scrollToElement(){
        WebElement element = driver.findElement(submitButton);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }

    public void setChooseFile(){
        LOG.info("Upload a File");
        WebElement fileChoose = driver.findElement(chooseFileBtn);
        fileChoose.sendKeys("C://Users//Paul//Desktop//AZIMUT CURS//xxx.jpg");
    }

    public void  clickSubmit() {
        LOG.info("Click submit button");
        driver.findElement(submitButton).click();
    }

    public void clickRefreshButton() {
        LOG.info("Click refresh button");
        driver.findElement(refreshButton).click();
    }




















}
