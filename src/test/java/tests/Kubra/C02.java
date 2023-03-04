package tests.Kubra;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Zeropage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02 {
    @Test
    public void test01() {

        // 1.“http://zero.webappsecurity.com/” Adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("zeroUrl"));
        // 2. Sign in butonunun gorunur oldugunu test edin
        Zeropage zeropage= new Zeropage();
        Assert.assertTrue(zeropage.signInButonu.isDisplayed());
    }
}


