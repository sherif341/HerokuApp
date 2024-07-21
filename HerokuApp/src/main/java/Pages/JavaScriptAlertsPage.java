package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private WebDriver driver;
    private By triggerAlertButton=By.xpath("//button[@onclick='jsAlert()']");
    private By triggerConfirmtButton=By.xpath("//button[@onclick='jsConfirm()']");
    private By triggerPromptButton=By.xpath("//button[@onclick='jsPrompt()']");
    private By resultText=By.id("result");

    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void triggerConfrimAlert(){
        driver.findElement(triggerConfirmtButton).click();
    }
    public void ClickingPromptAlert(){
        driver.findElement(triggerPromptButton).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void cancelAlert(){
        driver.switchTo().alert().dismiss();
    }
    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }
    public String getResultText(){
        return driver.findElement(resultText).getText();
    }
    public void enterTextInAlert(String text){
        driver.switchTo().alert().sendKeys(text);
    }

}
