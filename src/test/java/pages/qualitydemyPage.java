package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

public class qualitydemyPage {

    public qualitydemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Log in']")
   public WebElement logInKutusu;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement eMailKutusu;
    @FindBy(xpath = "//input[@type='password']")
   public WebElement passwordKutusu;
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement ikinciLoginButtonu;
    @FindBy(xpath = "//a[text()='Instructor']")
     public WebElement basariliGirisKontrolElementi;
}
