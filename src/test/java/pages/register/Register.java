package pages.register;

import org.openqa.selenium.By;
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












}
