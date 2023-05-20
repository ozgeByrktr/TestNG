package tests.day14_TestNGFrameWorkOlusturma;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C04_DriverIlkTest {
        /*
            Page Object Model'de (POM) driver olusturmak için extends (inheritance )ile
            kullandigimiz TestBase classı yerine
            static yollarla ulasabilecegimiz bir method kullanilmasi tercih edilmistir.

           *** Driver bizim icin cok onemli oldugundan driver icin bagımsız bir class olusturulur.
         */
    @Test
    public void test01(){
        //amazon ana sayfaya gidin
        Driver.getDriver().get("https://www.amazon.com");

        // Nutella için arama yapin
        WebElement aramaKutusu=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        // arama sonuclarinin "Nutella" kelimesi içerdigini test edin
        WebElement sonucElementi=Driver.getDriver().findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));

        String actualSonuc=sonucElementi.getText();
        String expectedSonuc="Nutella";
        Assert.assertTrue(actualSonuc.contains(expectedSonuc));

        ReusableMethods.bekle(5);
        Driver.closeDriver();
    }
}
