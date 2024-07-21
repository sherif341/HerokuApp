package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage (WebDriver driver){
        this.driver=driver;
    }
    public LoginPage ClickingFormAuthenticationLink(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public FileUploadPage ClickingFileUploadLink(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public DynamicLoadingPage ClickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public ContextMenuPage ClickingContextMenuPageLink(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }
    public FramesPage ClickingFramesPageLink(){
        clickLink("WYSIWYG Editor");
        return new FramesPage(driver);
    }
    public LargeAndDeepDomPage clickLargeAndDeepDom(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }
    public DropDownPage ClickingDropDownLink(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
    public KeyPressesPage ClickingKeyPressesLink(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public JavaScriptAlertsPage ClickingJavaScriptAlertsLink(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }
    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

    public HoversPage ClickingHover(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
