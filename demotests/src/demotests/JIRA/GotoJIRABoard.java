package demotests.JIRA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.time.*;

public class GotoJIRABoard {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
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
				
				driver.findElement(By.xpath(obj.getProperty("jira.mainscreen.JIRATile.xpath"))).click();
				driver.findElement(By.xpath(obj.getProperty("jira.jiraboard.SCRUMboard.xpath"))).isDisplayed();
	}

}
