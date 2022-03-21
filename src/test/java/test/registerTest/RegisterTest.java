package test.registerTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

public class RegisterTest extends BaseTest {

    @Test
    public void testRegister(){

        homePage.clickSkipSignInButton();
        Assert.assertTrue(register.checkTitle(), "The title is not displayed.");
        register.setFullName("Ion", "Ionescu");
        register.setAddress("str. Crizantemelor, nr. 666");
        register.setEmailAddress("ion@ionescu.ro");
        register.setPhone("0770666666");
        register.setGenderMale();
        register.setHobbiesMovies();
        register.setLanguages("Romanian");
        register.setSkills("Java");


    }
}
