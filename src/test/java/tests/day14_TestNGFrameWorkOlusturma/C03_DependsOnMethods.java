package tests.day14_TestNGFrameWorkOlusturma;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class C03_DependsOnMethods {
    /*
    DependsOnMethods oncelik sirasina karismaz.
    dependsOnMethods bir test methodunun calismasini baska bir test methodunun calisip passed olmasina baglar
    baglanilan method calismaz ya da calisir failed olursa baglanan method hic calismaz.

    @Test notasyonu sayesinde her test bagimsiz calistirilabilir.
     Ancak bir test DependsOn ile baska bir methoda baglanmis ise tek basina calistirlmasi istediginde
     once bagli oldugu test methodunu
     calistirir. o method calisip passed olursa asıl calıstırmak
     istedigimiz methodda calisir

     ** bu baglanti uc veya daha fazla method arasinda olursa
     yani calistirmak istedigimiz method baska methoda o da baska methoda bagli ise ucu birden calismaz.
     No test were found uyarısı verir (-1) hiçbir test methodu calismaz

     */

    @Test(dependsOnMethods = "wiseTesti")
    public void youtubeTesti(){
        System.out.println("Youtube");

    }
    @Test(priority = 3)
    public void wiseTesti(){
        System.out.println("Wisequarter");
    }
    @Test(dependsOnMethods = "youtubeTesti")
    public void amazonTesti(){
        System.out.println("Amazon");
    }












}
