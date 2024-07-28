package demotests.JIRA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.time.*;

public class JIRALogin {
	
	public static void main(String[] args) throws IOException {
		
		// Specify the file location I used . operation here because
		//we have object repository inside project directory only
		File src=new File(".Object_Repo.properties");

		// Create FileInputStream object
		FileInputStream objfile=new FileInputStream(src);

		// Create Properties class object to read properties file
		Properties obj=new Properties();

		// Load file so we can use in our script
		obj.load(objfile);

		System.out.println("Property class loaded");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\OneDrive - Computer Aid, Inc\\Documents\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		String baseUrl = "http://jira.com";
        String expectedTitle = "https://mattroe96.atlassian.net/jira/software/projects/SCRUM/boards/1";
        String actualTitle = "";
        String email = "matt.roe.96@hotmail.com";
        
        // Launch browser
        driver.get(baseUrl);
        driver.manage().window().maximize();
        actualTitle = driver.getCurrentUrl();
        
        //Verify that the user is logged in to JIRA, and if not, perform login action
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Logged in!");
        } else {
            System.out.println("Need to log in");
            driver.findElement(By.xpath(obj.getProperty("jira.login.SignIn.xpath"))).click();
            driver.findElement(By.xpath(obj.getProperty("jira.login.Email.xpath"))).sendKeys(email);
            driver.findElement(By.xpath(obj.getProperty("jira.login.Continue.xpath"))).click();
            driver.findElement((By.cssSelector("button#social-login-submit.css-1crekw4"))).click();
            driver.findElement(By.xpath(obj.getProperty("jira.login.UsernameTile.xpath"))).click();
            driver.findElement(By.xpath(obj.getProperty("jira.maincreen.Atlassian.xpath"))).isDisplayed();
            System.out.println("Logged in!");
        }
	}
}
