package stepdefinitions.mobileStep;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AutodocPage;
import utils.Driver;
import utils.ReusableMethods;

public class AutodocStep {
    AndroidDriver<AndroidElement> driver = Driver.getAndroidDriver();
    AutodocPage autodocPage = new AutodocPage();

    @Given("Sayfa giris ayarlari yapilir")
    public void sayfa_giris_ayarlari_yapilir() {
        ReusableMethods.wait(8);
        autodocPage.checkinCloseX.click();
        //ReusableMethods.koordinatTiklamaMethodu(892,368);
    }

    @Given("{string} linkine tiklanir")
    public void linkine_tiklanir(String tiklama) throws InterruptedException {
        ReusableMethods.scrollWithUiScrollableAndClick(tiklama);
        ReusableMethods.wait(2);
    }

    @Given("Season kismindan {string} secilir")
    public void season_kismindan_secilir(String tiklama) {
        autodocPage.season.click();
        ReusableMethods.scrollWithUiScrollableAndClick(tiklama);
        ReusableMethods.wait(1);
    }

    @Given("Width olcusu {string} secilir")
    public void width_olcusu_secilir(String width) {
        autodocPage.width.click();
        ReusableMethods.scrollWithUiScrollableAndClick(width);
        ReusableMethods.wait(1);
    }

    @Given("Height olcusu {string} secilir")
    public void height_olcusu_secilir(String height) {
        autodocPage.height.click();
        ReusableMethods.scrollWithUiScrollableAndClick(height);
        ReusableMethods.wait(1);
    }

    @Given("Diameter olcusu {string} secilir")
    public void diameter_olcusu_secilir(String diameter) {
        autodocPage.diameter.click();
        ReusableMethods.scrollWithUiScrollableAndClick(diameter);
        ReusableMethods.wait(1);
    }

    @Given("{string} butonuna basilir")
    public void search_tyres_butununa_basilir(String buton) {
        ReusableMethods.scrollWithUiScrollableAndClick(buton);
    }


    @Given("Brand bolumunden ilk marka secilir")
    public void brand_bolumunden_ilk_marka_secilir() {
        autodocPage.firstBrandButton.click();
    }


    @Given("Listeden ilk urun secilir")
    public void listeden_ilk_urun_secilir() {
        ReusableMethods.wait(2);
        autodocPage.tyreListFirstItem.click();
    }

    @Given("Lastik detay sayfasindan ADD butonuna basilarak urunler sepete eklenir")
    public void lastik_detay_sayfasindan_add_butonuna_basilarak_urunler_eklenir() {
        ReusableMethods.wait(2);
        autodocPage.addButton.click();
    }

    @Given("Urunun sepete eklendigi dogrulanir")
    public void urunun_sepete_eklendigi_dogrulanir() {
        Assert.assertTrue(autodocPage.addedToBasketText.isDisplayed());
    }


    //TC_02
    @Given("Kaydirarak {string} linkine tiklanir")
    public void kaydirarak_linkine_tiklanir(String menuItem) {
        ReusableMethods.wait(8);
        ReusableMethods.ekranKaydirmaMethodu(500,1550,150,500,350);
        ReusableMethods.scrollWithUiScrollableAndClick(menuItem);
    }
    @Given("Car maker linkine tiklanir")
    public void car_maker_linkine_tiklanir() {
        autodocPage.carMakeText.click();
    }
    @Given("{string} secilir")
    public void secilir(String secim) {
        ReusableMethods.wait(2);
        ReusableMethods.scrollWithUiScrollableAndClick(secim);
    }


}
