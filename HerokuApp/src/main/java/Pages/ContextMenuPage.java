package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By area= By.id("hot-spot");



    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void rightClick(){
        Actions actions=new Actions(driver);
        actions.contextClick(driver.findElement(area)).perform();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
}
