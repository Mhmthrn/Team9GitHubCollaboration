package tests.giitHub;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class GitHub {
    @Test
    public void gitHubDosya(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
}
