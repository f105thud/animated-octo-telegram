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

public class SubmitObservation {
	public static void SubmitObservation(WebDriver driver) {
		
		String Species = "";
		String Location = "";
		String Notes = "";
		
		driver.findElement(By.cssSelector("#select-all")).click();
		WebElement Combine = driver.findElement(By.cssSelector("#app > div > div > nav.nav_add_obs.navbar.navbar-default > div > ul > button:nth-child(3)"));
		String CombinePath = Combine.getClass().toString();
		if (CombinePath.contains("disabled")) {
			System.out.println("Uploading one photo");
		} else {
			Combine.click();
		}
		WebElement SpeciesField = driver.findElement(By.cssSelector("#imageGridObs > div > div.ObsCardComponent > div > div.caption > div.form-group.TaxonAutocomplete > div > input"));
		SpeciesField.click();
		SpeciesField.sendKeys(Species);
		
		WebElement LocationField = driver.findElement(By.cssSelector("#imageGridObs > div > div.ObsCardComponent > div > div.caption > div:nth-child(5) > input"));
		LocationField.click();
		
		driver.findElement(By.id("Search for a location")).sendKeys(Location);
		driver.findElement(By.cssSelector("<button type=\"button\" class=\"btn btn-primary\">Update Observations</button>")).click();
		
		WebElement NotesField = driver.findElement(By.cssSelector("#imageGridObs > div > div.ObsCardComponent > div > div.caption > div:nth-child(6) > textarea"));
		NotesField.click();
		NotesField.sendKeys(Notes);
		
		driver.findElement(By.cssSelector("#app > div > div > nav.nav_add_obs.navbar.navbar-default > div > button")).click();
	}
	
}
