package iNaturalist.UpperRibbon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.time.*;

public class UploadPhoto {
	
	public static void UploadPhoto(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\OneDrive - Computer Aid, Inc\\Documents\\ChromeDriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
        driver.findElement(By.cssSelector("#header > div.navtabs.add-obs > a > i")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#app > div > div > div:nth-child(3) > div > div > div > div > div.start > div.drag_or_choose > button")).click();       
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("'Open' window is displayed");
        
        String filepath="C:\\Users\\Owner\\iCloudPhotos\\Photos\\Wildlife photos\\";
        
        WebElement fileInput = driver.findElement(By.name("uploadfile"));
        fileInput.sendKeys(filepath);
        WebElement Open = driver.findElement(By.name("Open"));
        Open.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Photos are selected");
	}

}
