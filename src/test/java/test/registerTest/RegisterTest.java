package test.registerTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.*;
import static pages.BasePage.driver;

public class RegisterTest extends BaseTest {
    private String newUrl = getBaseUrl()+ "Register.html";

    @Test
    public void testRegister(){

        driver.get(newUrl);
        sleep(5000);
        Assert.assertTrue(register.checkTitle(), "The title is not displayed.");
        register.setFullName("Ion", "Ionescu");
        register.setAddress("str. Crizantemelor, nr. 666");
        register.setEmailAddress("ion@ionescu.ro");
        register.setPhone("0770666666");
        register.setGenderMale();
        register.setHobbiesMovies();
        register.setLanguages("Romanian");
        register.scrollToElement();
        register.setSkills("Java");
        register.setCountry();
        register.selectCountry("India");
        register.setDateOfBirth("1986","August","15");
        register.setPassword("aaa123", "aaa123");
        register.setChooseFile();
        sleep(5000);
        register.clickSubmit();
//        register.clickRefreshButton();







    }
}
