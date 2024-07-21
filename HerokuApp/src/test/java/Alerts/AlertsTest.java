package Alerts;

import Pages.HomePage;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTest extends BaseTests {
    @Test
    public void testAlert(){
        var alertPage=homePage.ClickingJavaScriptAlertsLink();
        alertPage.triggerAlert();
        alertPage.acceptAlert();
        Assert.assertTrue(alertPage.getResultText().contains("You successfully clicked an alert"));
    }
    @Test
    public void testConfirmAlert(){
        var alertPage=homePage.ClickingJavaScriptAlertsLink();
        alertPage.triggerConfrimAlert();
        String text= alertPage.getAlertText();
        alertPage.cancelAlert();
        Assert.assertTrue(text.contains("I am a JS Confirm"));
    }
    @Test
    public void testPrompt(){
        var alertPage=homePage.ClickingJavaScriptAlertsLink();
        alertPage.ClickingPromptAlert();
        String text="Sherif";
        alertPage.enterTextInAlert(text);
        alertPage.acceptAlert();
        Assert.assertTrue(alertPage.getResultText().contains(text));
    }


}
