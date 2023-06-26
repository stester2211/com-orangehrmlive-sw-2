package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest
{
    @Before
    public void openBrowser()
    {
        setUpBrowser();
    }

    // 1. userShouldLoginSuccessfullyWithValidCredentials
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException
    {
        //1.1 Enter “Admin” username
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

        //1.2 Enter “admin123 password
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

        //1.3 Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();

        //1.4 Verify the ‘Dashboard’ text is display
        String expectedText="Dashboard";
        String actualText= driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
        Assert.assertEquals("Dashboard Text not found",expectedText,actualText);

        //Holding the screen
        Thread.sleep(2000);
    }



    @After
    public void quitBrowser()
    {
        closeBrowser();
    }
}
