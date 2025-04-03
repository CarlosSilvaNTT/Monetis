package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ValidRegister
{
    public static <except> void main(String[] args)
    {
        {
            WebDriver driver = new ChromeDriver();
            String URL = "https://monetis-delta.vercel.app/";

            driver.get(URL);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            WebElement getStarted = driver.findElement(By.cssSelector("div[class='get-started'] span"));
            getStarted.click();
            WebElement register = driver.findElement(By.cssSelector(".signUp"));
            register.click();

            //Signup with all the fields empty
        /*WebElement signUp = driver.findElement(By.xpath("//button[@type='submit']"));
        signUp.click(); */

            // To zoom screen so first name and surname appears visible (not necessary)
        /* String zoomJS;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        zoomJS = "document.body.style.zoom='1.7'";
        js.executeScript(zoomJS); */

            // Preencher todo o registo
            WebElement name = driver.findElement(By.cssSelector("input[placeholder='John']"));
            name.sendKeys("Carlos");
            WebElement surname = driver.findElement(By.cssSelector("input[placeholder='Doe']"));
            surname.sendKeys("Silva");
            WebElement mail = driver.findElement(By.cssSelector("input[placeholder='johndoe@me.com']"));
            mail.sendKeys("cduarsil@emeal.nttdata.com");
            WebElement phone = driver.findElement(By.cssSelector("input[placeholder='123456789']"));
            phone.sendKeys("563639848");
            WebElement address = driver.findElement(By.cssSelector("input[placeholder='Sttr. Example, 123']"));
            address.sendKeys("Rua L. 22");
            WebElement postalCode = driver.findElement(By.cssSelector("input[placeholder='12345-678']"));
            postalCode.sendKeys("7633-902");
            WebElement city = driver.findElement(By.cssSelector("input[placeholder='London']"));
            city.sendKeys("Porto");
            WebElement dropdownElement = driver.findElement(By.cssSelector("#react-select-2-input"));
            dropdownElement.click();
            dropdownElement.sendKeys("Portugal");
            dropdownElement.sendKeys(Keys.RETURN);


            WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
            password.sendKeys("@Monetis0");
            WebElement confPassword = driver.findElement(By.cssSelector("input[placeholder='Confirm password']"));
            confPassword.sendKeys("@Monetis0");


            // driver.quit();

        }
    }
}
