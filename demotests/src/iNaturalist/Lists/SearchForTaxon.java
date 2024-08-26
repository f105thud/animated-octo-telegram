package iNaturalist.Lists;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SearchForTaxon {

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
		
		String taxon = "";
		driver.findElement(By.cssSelector("#Lifelist > div.FlexGrid > div.FlexCol.tree-col > div.form-group.TaxonAutocomplete > div > span")).sendKeys(taxon);
		driver.findElement(By.cssSelector("#ui-id-69 > div > div.ac-label > div > span.title")).click();
		
		String commonname = driver.findElement(By.className("comname display-names")).getText().toString();
		String scientificname = driver.findElement(By.className("sciname.species.secondary-name")).getText().toString();
		
		if (taxon.contentEquals(commonname)){
			System.out.println("Common name matches!");
		}else if (taxon.contentEquals(scientificname)) {
			System.out.println("Scientific name matches!");
		}	
		
		String numberofobservations = driver.findElement(By.cssSelector("#TaxaList > ul > li > ul > li > div > span")).toString();
		
		System.out.print("User has observed " + numberofobservations + "instances of taxon " + taxon);
	}
}
