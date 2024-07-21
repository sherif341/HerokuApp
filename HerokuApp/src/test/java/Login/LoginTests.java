package Login;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {
    @Test
    public void testValidLogin(){
       LoginPage loginPage =homePage.ClickingFormAuthenticationLink();
       loginPage.setUserNameField("tomsmith");
       loginPage.setPasswordField("SuperSecretPassword!");
       SecureAreaPage secureAreaPage= loginPage.clickLoginButton();
       Assert.assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"));;
       //Assert.assertEquals(secureAreaPage.getAlertText(),"You logged into a secure area!","Alert Text is incorrect");

    }

}
