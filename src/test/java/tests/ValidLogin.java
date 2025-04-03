package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ValidLogin
{
    public static <except> void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        String URL = "https://monetis-delta.vercel.app/";

        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement login = driver.findElement(By.cssSelector("div[class='get-started'] span"));
        login.click();

        // LogIn from register page

        WebElement loginlink = driver.findElement(By.xpath("//a[@class='signUp']"));
        loginlink.click();


        // driver.quit();
    }
}
