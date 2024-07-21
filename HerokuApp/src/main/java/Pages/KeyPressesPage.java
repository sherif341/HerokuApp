package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By textFiled=By.id("target");
    private By resultText=By.id("result");
    public KeyPressesPage(WebDriver driver){
        this.driver=driver;
    }
    public void enterText(String text){
        driver.findElement(textFiled).sendKeys(text);
    }
    public void enterPi(){
        enterText(Keys.chord(Keys.ALT,"p")+"= 3.14");
    }
    public String getResultText(){
        return driver.findElement(resultText).getText();
    }


}
