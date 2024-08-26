package iNaturalist.UpperRibbon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CheckNotifications {
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
				ChromeOptions options = new ChromeOptions();
				options.setHeadless(true);
				WebDriver driver = new ChromeDriver();
				
				String MessageCount = driver.findElement(By.className("count")).getText().toString();
				
				if (MessageCount.contentEquals("0")) {
					System.out.println("No new messages");
				}else {
					System.out.println("User has new messages!");
					driver.findElement(By.cssSelector("#header-updates-dropdown-toggle > i")).click();
					String lastcomment = driver.findElement(By.xpath("//*[@id=\"updatessubnav\"]/ul/li[1]/a/span/text()")).getText().toString();
					System.out.println("Last message is " + lastcomment);
					driver.findElement(By.cssSelector("#header-updates-dropdown-toggle > i")).click();
				}
	}
}
