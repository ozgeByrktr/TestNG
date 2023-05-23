package tests.day18_TestNGRaports_ParalelCalistirma;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProvider {

    @DataProvider
    public static Object[][] aranacaklarListesi() {
        String[][] aranacakKelimelerArrayi={{"Java"},{"Cracker"},{"Apple"},{"Samsung"},{"Faker"}};

        return aranacakKelimelerArrayi;
    }

    @Test(dataProvider ="aranacaklarListesi")
    public void test01(String aranacakKelime){

        //amazon anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //Bize test methodu disinda list olarak verilen urunlerin hepsi icin
        //arama kutusuna yazip arama yapin
        AmazonPage amazonPage= new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(aranacakKelime+ Keys.ENTER);


        //ve sonuc yazısının arattiginiz elementi icerdigini test edin

        String actualAramaSonucYazisi= amazonPage.aramaSonucuElementi.getText();
        String expectedIcerik=aranacakKelime;

        Assert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik));


        Driver.closeDriver();


    }















}
