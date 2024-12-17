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

public class ViewLifelist {
	public static void ViewLifeList(WebDriver driver){
		
		//Click the Life List Button
		driver.findElement(By.cssSelector("#life-list > a")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if (driver.findElement(By.cssSelector("#Lifelist > div.lifelist-title")).isDisplayed()){
        	System.out.println("Life List displayed!");
        }else {
        	System.out.println("Life List not displayed");
        }
	}
}
