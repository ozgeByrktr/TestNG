package tests.day14_TestNGFrameWorkOlusturma;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class C02_Ignore {
    /*
    @Ignore notasyonu
    basina yazildigi testin ignore edilmesini saglar.
     */
    @Test
    public void youtubeTesti(){
        System.out.println("Youtube");
    }
    @Test(priority = 3) @Ignore
    public void wiseTesti(){
        System.out.println("Wisequarter");
    }
    @Test
    public void amazonTesti(){
        System.out.println("Amazon");
    }







}
