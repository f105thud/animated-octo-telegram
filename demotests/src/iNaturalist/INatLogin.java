package iNaturalist;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class INatLogin {
	public static void INatLogin (WebDriver driver){
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\OneDrive - Computer Aid, Inc\\Documents\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		
		String baseUrl = "https://inaturalist.org";
        String expectedTitle = "https://mattroe96.atlassian.net/jira/software/projects/SCRUM/boards/1";
        String actualTitle = "";
        String email = "matt.roe.96@hotmail.com";
        String password = "343GuiltySpark";
        
        // Launch browser
        driver.get(baseUrl);
        driver.manage().window().maximize();
        actualTitle = driver.getCurrentUrl();
        
        //Verify that the user is logged in to JIRA, and if not, perform login action
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Logged in!");
        } else {
            System.out.println("Need to log in");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.cssSelector("a.signin_link")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.cssSelector("input#user_email.form-control")).sendKeys(email);
            driver.findElement(By.cssSelector("input#user_password.text.form-control")).sendKeys(password);
            driver.findElement(By.cssSelector("#new_user > div:nth-child(7) > input")).click();
            System.out.println("Logged in!");
        }
        
	}
}
