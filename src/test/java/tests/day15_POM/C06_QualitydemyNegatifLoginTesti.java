package tests.day15_POM;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.qualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C06_QualitydemyNegatifLoginTesti {
    @Test
    public void gecersizIsimSifreTesti(){
        // QUALITYDEMY ANA SAYFAYA GIDIN
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        // login linkine tiklayin
        Driver.getDriver().findElement(By.xpath("//a[@onclick='cookieAccept();']")).click();
        qualitydemyPage qualitydemyPage=new qualitydemyPage();
        qualitydemyPage.logInKutusu.click();
        // gecersiz username ve gecersiz sifre yi ilgili kutulara yazin
        qualitydemyPage.eMailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qualitydemyPage.eMailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));

        // login butonuna basin
        qualitydemyPage.ikinciLoginButtonu.click();

        // basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(qualitydemyPage.eMailKutusu.isEnabled());
        // sayfayi kapatin

        Driver.closeDriver();


    }
    @Test
    public void gecerliIsimGecersizSifreTesti(){
        // QUALITYDEMY ANA SAYFAYA GIDIN
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        // login linkine tiklayin
        Driver.getDriver().findElement(By.xpath("//a[@onclick='cookieAccept();']")).click();
        qualitydemyPage qualitydemyPage=new qualitydemyPage();
        qualitydemyPage.logInKutusu.click();
        // gecerli username ve gecersiz sifre yi ilgili kutulara yazin
        qualitydemyPage.eMailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.eMailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));

        // login butonuna basin
        qualitydemyPage.ikinciLoginButtonu.click();

        // basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(qualitydemyPage.eMailKutusu.isEnabled());
        // sayfayi kapatin

        Driver.closeDriver();


    }
    @Test (groups = "smoke")
    public void gecersizIsimGecerliSifreTesti(){
        // QUALITYDEMY ANA SAYFAYA GIDIN
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        // login linkine tiklayin
        Driver.getDriver().findElement(By.xpath("//a[@onclick='cookieAccept();']")).click();
        qualitydemyPage qualitydemyPage=new qualitydemyPage();
        qualitydemyPage.logInKutusu.click();
        // gecersiz username ve gecersiz sifre yi ilgili kutulara yazin
        qualitydemyPage.eMailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qualitydemyPage.eMailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        // login butonuna basin
        qualitydemyPage.ikinciLoginButtonu.click();

        // basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(qualitydemyPage.eMailKutusu.isEnabled());
        // sayfayi kapatin

        Driver.closeDriver();


    }

}
