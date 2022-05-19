package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.AllPages;
import org.junit.Test;

public class AllTests extends BaseTest {
    @Test
    public void LoginTest() {
        AllPages allPage = new AllPages();
        allPage.login();
        allPage.scrollAndSelect();
        allPage.hobiPage();
        allPage.randomSelectHobi();
        allPage.listelerimFavoriPage();
        allPage.sepetimPage();
        allPage.artir();
        allPage.adresBilgisi();
    }


}
