package Esra;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Zeropage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_ {

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("zeroUrl"));

        Zeropage zeropage=new Zeropage();

        zeropage.signInButonu.click();

        zeropage.usernameKutusu.sendKeys("username");

        zeropage.passwordKutusu.sendKeys("password");


      Assert.assertTrue(zeropage.signInSubmitButonu.isDisplayed());
    }
}
