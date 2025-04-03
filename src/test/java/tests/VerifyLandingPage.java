package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class VerifyLandingPage
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        String URL = "https://monetis-delta.vercel.app/";
        String expectedTitle = "MONETIS";
        String actualTitle = null;

        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        driver.quit();

    }
}
