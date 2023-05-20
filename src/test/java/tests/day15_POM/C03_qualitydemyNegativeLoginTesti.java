package tests.day15_POM;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.qualitydemyPage;
import utilities.Driver;

public class C03_qualitydemyNegativeLoginTesti {
    @Test
    public void test01() {
        // qualitydemy anasayfaya gidin

        Driver.getDriver().get("https://www.qualitydemy.com/");
        // ilk login linkine tiklayin
        Driver.getDriver().findElement(By.xpath("//a[@onclick='cookieAccept();']")).click();
        qualitydemyPage qualitydemyPage = new qualitydemyPage();
        Driver.getDriver().findElement(By.xpath("//a[@onclick='cookieAccept();']")).click();
        qualitydemyPage.logInKutusu.click();
        // kullanici adi olarak selenium
        // password olarak heyecandir yazin

        qualitydemyPage.eMailKutusu.sendKeys("selenium");
        qualitydemyPage.passwordKutusu.sendKeys("heyecandir");
        // login butonuna tiklayin

        qualitydemyPage.ikinciLoginButtonu.click();
        // giris yapilamadigini test edin

        Assert.assertTrue(qualitydemyPage.eMailKutusu.isEnabled());

        Driver.closeDriver();


    }


}
