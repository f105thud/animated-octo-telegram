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
	public static void CheckNotifications(WebDriver driver){

				/*System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\OneDrive - Computer Aid, Inc\\Documents\\ChromeDriver\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.setHeadless(true);*/
			
				String MessageCount = driver.findElement(By.xpath("//*[@id=\"header-updates-dropdown-toggle\"]/span")).getText().toString();
				//System.out.println(MessageCount);
				
				if (MessageCount.contentEquals("0")) {
					System.out.println("No new messages");
				}else {
					System.out.println("User has" +MessageCount+ "new notifications!");
					driver.findElement(By.cssSelector("#header-updates-dropdown-toggle > i")).click();
					String lastcomment = driver.findElement(By.xpath("//*[@id=\"updatessubnav\"]/ul/li[1]/a/span/")).getText().toString();
					System.out.println("Last message is " + lastcomment);
					driver.findElement(By.cssSelector("#header-updates-dropdown-toggle > i")).click();
				}
	}
}
