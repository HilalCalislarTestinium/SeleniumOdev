package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import java.util.Random;
import static com.kitapyurdu.driver.BaseTest.driver;

public class AllPages {
    Methods methods;
    Logger logger = LogManager.getLogger(AllPages.class);
    public AllPages(){
        methods = new Methods();
    }

    public void login () {

        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".popupCloseIcon"));
        methods.sendKeys(By.id("login-email"),"hilal.calislar@testinium.com");
        methods.waitBySeconds(3);
        methods.sendKeys(By.xpath("//input[@id='login-password']"),"1q2w3e4r5t");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(10);
        Assert.assertTrue("Element yok",
                methods.isElementVisible(By.xpath("//a[@class='common-sprite']")));
        methods.waitBySeconds(3);
    }

    public void scrollAndSelect(){
        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(3);
        for(int x=7;x<11;x++) {
            methods.scrollWithAction(By.xpath("//div[@class='product-list']/div["+x+"]"));
            methods.waitBySeconds(3);
            methods.click(By.xpath("//div[@id='product-table']/div["+x+"]/div[2]/div[3]/a[4]"));
            methods.waitBySeconds(3);
        }
        methods.click(By.xpath("//div[@class='logo-text']/a"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//div[@class='lvl1catalog']/a"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(3);
        methods.selectByText(By.cssSelector(".sort>select"),
                "Yüksek Oylama");
        methods.waitBySeconds(3);
    }

    public void hobiPage(){
        methods.click(By.xpath("//div[@class='lvl2 js-bookCr']/ul/li[3]/span[@class='mn-strong common-sprite']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[@href='kategori/kitap-hobi/1_212.html']"));
        methods.waitBySeconds(3);
    }

    public void randomSelectHobi(){
        Random random =new Random();
        int ran=random.nextInt(5);
        methods.click(By.xpath("//ul[@class='product-grid jcarousel-skin-opencart']/li["+ran+"]"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.cssSelector("#button-cart"));
        methods.click(By.cssSelector("#button-cart"));
        methods.waitBySeconds(3);
    }

    public void listelerimFavoriPage(){
        methods.click(By.cssSelector(".menu.top.my-list"));
        methods.waitBySeconds(3);
        methods.click(By.xpath(
                "//a[@href='https://www.kitapyurdu.com/index.php?route=account/favorite&selected_tags=0']"));
        methods.waitBySeconds(3);
    }

    public void sepetimPage(){
        methods.click(By.xpath("//div[@class='fl']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//div[@class='mg-b-5']/a[@id='js-cart']\n"));
        methods.waitBySeconds(3);
    }

    public void artir(){
        driver.findElement(By.xpath("//input[@name='quantity']")).clear();
        methods.waitBySeconds(3);
        methods.sendKeys(By.xpath("//input[@name='quantity']"),"2");
        methods.waitBySeconds(3);
        methods.click(By.xpath("//td[@class='quantity']/form/i[@class='fa fa-refresh green-icon']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//div[@class='buttons']/div/a[@class='button red']"));
        methods.waitBySeconds(3);
    }

    public void adresBilgisi(){
        methods.click(By.id("address-firstname-companyname"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("address-firstname-companyname"),"Hilal");
        methods.waitBySeconds(3);

        methods.click(By.id("address-lastname-title"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("address-lastname-title"),"Çalışlar");
        methods.waitBySeconds(3);

        methods.click(By.id("address-zone-id"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//option[@value='3355']"));
        methods.waitBySeconds(3);

        methods.click(By.id("address-county-id"));
        methods.waitBySeconds(3);
        methods.click(By.id("//option[@value='484']"));
        methods.waitBySeconds(3);

        methods.click(By.xpath("//input[@id='district']"));
        methods.waitBySeconds(3);


        methods.click(By.id("address-address-text"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("address-address-text"),"Adatepe mah. Buca/İzmir");
        methods.waitBySeconds(3);

        methods.click(By.id("address-mobile-telephone"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("address-mobile-telephone"),"5555556666");
        methods.waitBySeconds(3);

        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(3);

        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(3);


        methods.click(By.id("credit-card-owner"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("credit-card-owner"),"Hilal Çalışlar");
        methods.waitBySeconds(3);

        methods.click(By.id("credit_card_number_1"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("credit_card_number_1"),"5454");
        methods.waitBySeconds(3);

        methods.click(By.id("credit_card_number_2"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("credit_card_number_2"),"6363");
        methods.waitBySeconds(3);

        methods.click(By.id("credit_card_number_3"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("credit_card_number_3"),"2727");
        methods.waitBySeconds(3);

        methods.click(By.id("credit_card_number_4"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("credit_card_number_4"),"1818");
        methods.waitBySeconds(3);

        methods.click(By.xpath("//select[@id='credit-card-expire-date-month']/option[@value='03']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//select[@id='credit-card-expire-date-year']/option[@value='2023']"));
        methods.waitBySeconds(3);

        methods.click(By.id("credit-card-security-code"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("credit-card-security-code"),"123");
        methods.waitBySeconds(3);

        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(3);

        methods.click(By.xpath("//a[@href='https://www.kitapyurdu.com/index.php?route=account/logout']"));
        methods.waitBySeconds(3);



    }

}
