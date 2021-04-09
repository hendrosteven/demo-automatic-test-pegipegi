package promo;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.FlashSalePage;
import page.PromoPage;

import java.io.IOException;

public class PromoTest extends BaseTest {

    @Test
    public void testPromoPage() throws IOException {
        PromoPage promoPage = homePage.clickPromoLink();
        promoPage.scrollToHargaSpesialTitle();
        takeScreenshot("testPromoPage");
        promoPage.clickImage();
        getWindowManager().switchToTab("FLASH SALE");
        FlashSalePage flashSalePage = new FlashSalePage(driver);
        Assert.assertEquals(flashSalePage.getLabelText(),
                "Flash Sale Hotel",
                "Label is incorrect");
    }

}
