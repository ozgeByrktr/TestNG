package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.qualitydemyPage;
import utilities.Driver;

public class C02_QualitydemyLoginTesti {
    // https://www.qualitydemy.com/
    //qdGecerliUsername = anevzatcelik@gmail.com
    //qdGecerliPassword = Nevzat152032

    @Test
    public void test01(){

        Driver.getDriver().get("https://www.qualitydemy.com/");

        qualitydemyPage qualitydemyPage=new qualitydemyPage();

        qualitydemyPage.logInKutusu.click();
        qualitydemyPage.eMailKutusu.sendKeys("anevzatcelik@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032");

        // login butonuna basin
        qualitydemyPage.ikinciLoginButtonu.click();
        // basarili olarak giris yapildigini test edin
        Assert.assertTrue(qualitydemyPage.basariliGirisKontrolElementi.isDisplayed());
        // sayfayi kapatin
        Driver.closeDriver();


    }
}
