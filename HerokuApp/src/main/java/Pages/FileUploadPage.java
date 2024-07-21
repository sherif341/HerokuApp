package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By inputFile=By.id("file-upload");
    private By uploadButton=By.id("file-submit");
    private By uploadFiles=By.id("uploaded-files");
    public FileUploadPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickingSubmit(){
        driver.findElement(uploadButton).click();
    }
    public void uploadingFile(String absolutePath){
        driver.findElement(inputFile).sendKeys(absolutePath);
        clickingSubmit();
    }
    public String getUploadedFilesName(){
        return driver.findElement(uploadFiles).getText();
    }
}
