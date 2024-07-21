package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesPage {
    private WebDriver driver;
    private String frameID="mce_0_ifr";
    private By content=By.id("tinymce");
    //private WebElement contentElement= driver.findElement(content);

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }
    private void moveToFrame(){
        driver.switchTo().frame(frameID);
    }
    public void clearText(){
        moveToFrame();
        driver.findElement(content).clear();
        mainFrame();
    }
    public void writeText(String text){
        moveToFrame();
        driver.findElement(content).sendKeys(text);
        mainFrame();
    }
    private void mainFrame(){
        driver.switchTo().parentFrame();
    }
}
