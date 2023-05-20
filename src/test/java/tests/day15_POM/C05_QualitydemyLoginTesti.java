package tests.day15_POM;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.qualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_QualitydemyLoginTesti {

    @Test
    public void test01(){
        // QUALITYDEMY ANA SAYFAYA GIDIN
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        // login linkine tiklayin
        Driver.getDriver().findElement(By.xpath("//a[@onclick='cookieAccept();']")).click();
        qualitydemyPage qualitydemyPage=new qualitydemyPage();
        qualitydemyPage.logInKutusu.click();
        // gecerli username ve sifre yi ilgili kutulara yazin
        qualitydemyPage.eMailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        // login butonuna basin
        qualitydemyPage.ikinciLoginButtonu.click();

        // basarili olarak giris yapildigini test edin
        Assert.assertTrue(qualitydemyPage.basariliGirisKontrolElementi.isDisplayed());
        // sayfayi kapatin

        Driver.closeDriver();


    }
}
