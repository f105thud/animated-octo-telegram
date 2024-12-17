package iNaturalist.Lists;
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

public class Export {
	public static void Export(WebDriver driver) {
		
		//Click the Export button
		driver.findElement(By.cssSelector("#Lifelist > div.lifelist-title > h1 > button")).click();
		
		//Select Restrict to Taxa checkbox
		driver.findElement(By.cssSelector("#export-taxon-filter"));
		
		//Click the second Export button
		driver.findElement(By.cssSelector("body > div:nth-child(27) > div.fade.ExportModal.in.modal > div > div > div.modal-footer > button.btn.btn-primary")).click();
		
		//Click the Close button
		driver.findElement(By.cssSelector("body > div:nth-child(27) > div.fade.ExportModal.in.modal > div > div > div.modal-footer > button.btn.btn-default")).click();
		}
	}
