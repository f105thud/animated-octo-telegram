package iNaturalist.MainScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class GoToProjects {
	public static void main(String[] args) throws IOException {
		// Specify the file location I used . operation here because
		//we have object repository inside project directory only
		File src=new File("jirarepo.properties");

		// Create FileInputStream object
		FileInputStream objfile=new FileInputStream(src);

		// Create Properties class object to read properties file
		Properties obj=new Properties();

		// Load file so we can use in our script
		obj.load(objfile);
		System.out.println("Property class loaded");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\OneDrive - Computer Aid, Inc\\Documents\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.findElement(By.cssSelector("#wrapper > div > div:nth-child(2) > div:nth-child(2) > div > ul > li:nth-child(10) > a"));
		
		String expectedtitle = "https://www.inaturalist.org/projects/user/matt-roe";
		String actualtitle = "";
		
		actualtitle = driver.getCurrentUrl();
		
		if (actualtitle.contentEquals(expectedtitle)) {
            System.out.println("Projects tab displayed!");
		}

	}
}
