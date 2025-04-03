package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MonetisLandingPage
{
    WebDriver driver;

    public MonetisLandingPage (WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(how= How.XPATH, using="///div[text()='Start your journey']")
    WebElement loggedInUserNameText;
}
