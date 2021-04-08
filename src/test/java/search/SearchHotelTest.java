package search;

import base.BaseTest;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import page.SearchResultPage;

import java.io.IOException;

public class SearchHotelTest extends BaseTest {

    @Test
    public void testSearchHotel() throws InterruptedException, IOException {
        homePage.setHotelName("Semarang");
        homePage.setCheckInDate("08-04-2021");
        homePage.setCheckOutDate("12-04-2021");
        homePage.setPeopleCount(3);
        homePage.setRoomCount(2);
        takeScreenshot("testSearchHotel");
        SearchResultPage resultPage = homePage.clickFormButton();
        String title = resultPage.getTitlePage();
        Assert.assertTrue(title.contains("Semarang"),"Search failed!");
    }

}
