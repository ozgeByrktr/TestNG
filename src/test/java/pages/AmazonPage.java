package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    // Page class'lari sürekli kullandigimiz locate islemleri
    // ve varsa login gibi kucuk islevleri iceren method'lar barindirir
    // selenium ile locate islemi veya herhangi bir islev gerceklestirmek istedigimizde
    // WebDriver objesine ihtiyac vardir

    // POM'da Driver class'inda olusturdugumuz
    // Webdriver driver objesini page class'larina tanimlamak icin
    // PageFactory class'indan initElements() kullanilir
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
        //bu ayarı constructor icine koyma sebebimiz :
        //page sayfalarina obje olusturularak ulasilabildigi icin
        //kim page sayfasini kullanmak isterse
        //page sayfasindan obje olusturmak icin, constructor calisacak
        //ve bu constructor'in icinde bulunan initElements() gerekli ayari yapmis olacak

    }
    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;
    @FindBy(xpath = "(//div[@class='sg-col-inner'])[1]")
    public WebElement aramaSonucuElementi;
}
/*
https://github.com/ozgeByrktr/TestNG.git
 */