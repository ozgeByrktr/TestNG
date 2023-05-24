package tests.day18_TestNGRaports_ParalelCalistirma;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.qualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_DataProviderNegativeLoginTest {
    @DataProvider
    public static Object[][] YanlisKullaniciAdlariListesi() {

    String[][] kullaniciBilgileriArrayi = {{"Memre","12345"},{"Mustafa","23456"},
                {"Burcu","32456"},{"Cigdem","867453"},
                {"Ahmet","32567"},{"Kemal","87654"},
                {"Melike","65747"},{"Cinar","645353"},
                {"Muleyke","6312"},{"Kadir","19870"}};

        return kullaniciBilgileriArrayi;
    }

    //Verilen 10 kullanici bilgisi ile sisteme giris yapilamadigini test edin

@Test(dataProvider = "YanlisKullaniciAdlariListesi")
    public void gecersizIsimGecersizSifreTesti(String kullaniciAdi,String password){
    
        // QUALITYDEMY ANA SAYFAYA GIDIN
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        // login linkine tiklayin
        Driver.getDriver().findElement(By.xpath("//a[@onclick='cookieAccept();']")).click();
        qualitydemyPage qualitydemyPage=new qualitydemyPage();
        qualitydemyPage.logInKutusu.click();
        // gecersiz username ve gecersiz sifre yi ilgili kutulara yazin
        qualitydemyPage.eMailKutusu.sendKeys(kullaniciAdi);
        qualitydemyPage.eMailKutusu.sendKeys(password);

        // login butonuna basin
        qualitydemyPage.ikinciLoginButtonu.click();

        // basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(qualitydemyPage.eMailKutusu.isEnabled());
        // sayfayi kapatin

         Driver.closeDriver();


    }
    
}
