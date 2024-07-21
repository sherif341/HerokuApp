package Keys;

import Pages.HomePage;
import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeysTest extends BaseTests {
    @Test
    public void testBackspace(){
        var keyPage=homePage.ClickingKeyPressesLink();
        keyPage.enterText(Keys.BACK_SPACE.toString());
        Assert.assertTrue(keyPage.getResultText().contains("BACK_SPACE"));
    }
    @Test
    public void testPi(){
        var keyPage=homePage.ClickingKeyPressesLink();
        keyPage.enterPi();
    }
}
