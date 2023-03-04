package tests.Ali_Branch;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Branch1 {

    AmazonPage amazonPage = new AmazonPage();
    @Test
    public void amazonTesti(){

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        String expectedIcerik="amazon";
        String actualurl=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualurl.contains(expectedIcerik));

        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        expectedIcerik = "Nutella";
        String actualSonucYazisi = amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));



        amazonPage.ilkUrun.click();

        expectedIcerik="Nutella";

        String actualUrunIsmi= amazonPage.ilkUrunIsimElementi.getText();

        Assert.assertTrue(actualUrunIsmi.contains(expectedIcerik));





    }

}


