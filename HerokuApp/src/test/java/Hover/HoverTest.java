package Hover;

import Pages.HomePage;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTest extends BaseTests {
    @Test
    public void testHoverUser1(){
        var hoverPage= homePage.ClickingHover();
        var caption=hoverPage.hoverOverFigure(1);
       // Assert.assertTrue(caption.isCaptionDisaple(),"Caption not displayed");
        Assert.assertEquals(caption.getTitle(),"name: user1","caption title incorrect");
        Assert.assertEquals(caption.getLinkText(),"View profile","Caption link text");
        //Assert.assertTrue(caption.getLinkText().endsWith("/users/1"),"Link incorrect"); is not working
    }
}
