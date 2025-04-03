package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InvalidLogin
{
    public static <except> void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        String URL = "https://monetis-delta.vercel.app/";

        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


        // LogIn from Get Started
        WebElement login = driver.findElement(By.cssSelector("div[class='get-started'] span"));
        login.click();
        WebElement mail = driver.findElement(By.cssSelector("input[placeholder='Email']"));
        mail.sendKeys("cduarsil@emeal.nttfdata.com");
         WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        pass.sendKeys("Loisyr84d");
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();


        //LogIn from register page


        // driver.quit();
    }
}
