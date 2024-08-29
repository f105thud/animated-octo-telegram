package iNaturalist;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class INatClose {

	public static void INatClose(WebDriver driver) {
		
		//System.out.println("Property class loaded");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\OneDrive - Computer Aid, Inc\\Documents\\ChromeDriver\\chromedriver.exe");
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");*/
		//WebDriver driver = new ChromeDriver();
		
		//Hover over User Icon to display Sign Out button
		WebElement UserIcon = driver.findElement(By.cssSelector("#header-user-menu-dropdown-toggle > a > img"));
		new Actions (driver)
		.moveToElement(UserIcon);
		
		driver.findElement(By.cssSelector("#usernav > li.navtab.user.menutab > div > ul > li.signout > a"));
		
        String expectedTitle = "https://www.inaturalist.org/";
        String actualTitle = "";
        actualTitle = driver.getCurrentUrl();
        
        if (actualTitle.contentEquals(expectedTitle)) {
        	System.out.println("Logged out successfully!");
        }else {
        	System.out.println("Still logged in");
        }
        driver.close();
	}
}
