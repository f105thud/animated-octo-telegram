package iNaturalist;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class ReturntoMainScreen {

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
		
		//click iNaturalist logo and return to the iNaturalist main screen
		driver.findElement(By.cssSelector("#logonav > a > img")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        String expectedURL = "https://www.inaturalist.org/home";
        String actualURL = driver.getTitle();
        
        if (actualURL.contentEquals(expectedURL)) {
        	System.out.println("Back to main screen!");
        }else {
        	System.out.println("Not on main screen");
        }
	}

}
