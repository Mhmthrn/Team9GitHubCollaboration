package tests.Ferit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Iphone14 {

    @Test
    public void iphone14() throws InterruptedException {


        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        WebElement submitGec = Driver.getDriver().findElement(By.xpath("(//input[@class='a-button-input'])[1]"));
        submitGec.click();
        Thread.sleep(2000);
        WebElement aramaKutusu =Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Iphone 13 pro max");
        aramaKutusu.submit();
      WebElement sonucYazisi= Driver.getDriver().findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));


       String expectedsonucYazisi = "iphone 13 pro max";
       String actualSonucnYazisi = sonucYazisi.getText();

       Assert.assertTrue(sonucYazisi.isDisplayed());

       Driver.closeDriver();
       Driver.quitDriver();

    }
}
