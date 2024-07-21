package DropDown;

import Pages.DropDownPage;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTests {
    @Test
    public void testSelectOption(){
        DropDownPage dropdown=homePage.ClickingDropDownLink();
        String option="Option 1";
        dropdown.selectingFromDropDownList(option);
        var selectedOptions =dropdown.getSelectedOption();
        Assert.assertEquals(selectedOptions.size(),1,"Incorrect number of selections");
        Assert.assertTrue(selectedOptions.contains(option),"Option not selected");

    }
}
