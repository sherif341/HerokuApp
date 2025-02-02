package Pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;
    private By figureBox=By.cssSelector("#content > div > div:nth-child(3)");
    private By boxCaption=By.cssSelector("#content > div > div:nth-child(3) > div");
    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }


    public FigureCaption hoverOverFigure(int index){
        WebElement figure=driver.findElement(figureBox);
        Actions actions=new Actions(driver);
        actions.moveToElement(figure).perform();
        return new  FigureCaption(figure.findElement(boxCaption));
    }
    public class FigureCaption{
        private WebElement caption;
        private By header=By.tagName("h5");
        private By link=By.tagName("a");
        public FigureCaption(WebElement caption) {
            this.caption = caption;
        }
        public boolean isCaptionDisaple(){
            return caption.isDisplayed(); //is not working
        }
        public String getTitle(){
            return caption.findElement(header).getText();
        }
        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }
        public String getLinkText(){
            return caption.findElement(link).getText();
        }

    }
}
