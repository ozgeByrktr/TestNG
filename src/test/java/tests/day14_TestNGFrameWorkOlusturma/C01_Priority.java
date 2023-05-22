package tests.day14_TestNGFrameWorkOlusturma;

import org.testng.annotations.Test;

public class C01_Priority {
    /*
  JUnit framework'de testlerin calisma sirasi
  ONGORULEMEZ ve DUZENLENEMEZ
  TestNG testleri harf sirasina gore calistirir (ONGORULEBILIR)
  Ayrica priority degeri girerek testleri istedigimiz sira ile de calistirabiliriz
  (KONTROL EDILEBILIR SIRALAMA)
  priority sayisal olarak kucukten buyuge dogru testleri calistirir
  eger priority degeri ayni olan birden fazla test varsa, yine harf sirasina bakar
    */
    @Test(groups = "minireg1")
    public void youtubeTesti(){
        System.out.println("Youtube");
    }
    @Test(priority = -3)
    public void wiseTesti(){
        System.out.println("Wisequarter");
    }
    @Test (groups = {"smoke","minireg1"})       //default priority =0 degeri alir.
    public void amazonTesti(){
        System.out.println("Amazon");
    }
}
