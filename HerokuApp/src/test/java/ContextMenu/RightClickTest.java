package ContextMenu;

import base.BaseTests;
import org.testng.annotations.Test;

public class RightClickTest extends BaseTests {
    @Test
    public void testRightClicking(){
        var contextMenuPage=homePage.ClickingContextMenuPageLink();
        contextMenuPage.rightClick();
        contextMenuPage.acceptAlert();
    }
}
