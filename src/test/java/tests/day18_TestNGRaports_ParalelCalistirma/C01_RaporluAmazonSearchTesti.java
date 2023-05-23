package tests.day18_TestNGRaports_ParalelCalistirma;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluAmazonSearchTesti extends TestBaseRapor {
    @Test
    public void test01(){
        extentTest=extentReports.createTest("Amazon arama testi",
                                            "Kullanici istedigi kelimeyi aratabilmeli");


        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        extentTest.info("Kullanici amazon anasayfaya gider");

        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+ Keys.ENTER);
        extentTest.info("Arama kutusuna belirlenen aranacak kelimeyi yazar ve aratir");

       String actualSonucYazisi=amazonPage.aramaSonucuElementi.getText();
        String expectedSonucYazisi=ConfigReader.getProperty("amazonExpectedIcerik");
        Assert.assertTrue(actualSonucYazisi.contains(expectedSonucYazisi));
        extentTest.pass("Belirlenen aranacak kelime aratildiginda,arama sonucunda expected icerik oldugu test edildi");

        Driver.closeDriver();







    }


}
