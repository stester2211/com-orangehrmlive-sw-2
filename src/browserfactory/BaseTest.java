package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseTest
{
    public static WebDriver driver;

    public static String baseUrl="https://opensource-demo.orangehrmlive.com/";

    public static String browser="Edge";

    public void setUpBrowser()
    {
        //Launch the Browser
        if(browser.equalsIgnoreCase("Chrome"))
        {
            driver=new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("Edge"))
        {
            driver=new EdgeDriver();
        }
        else if (browser.equalsIgnoreCase("Firefox"))
        {
            driver=new FirefoxDriver();
        }
        else
        {
            System.out.println("Enter only Firefox, Edge or Chrome Browser for Testing");
        }

        // Setup Url
        driver.get(baseUrl);

        // Maximize the browser screen
        driver.manage().window().maximize();

        // Implicit wait Time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    // close all browser open by selenium
    public void closeBrowser()
    {
        driver.quit();
    }
}
