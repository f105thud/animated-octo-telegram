package iNaturalist.Lists;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SearchForTaxon {

	public static void SearchForTaxon(WebDriver driver) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\OneDrive - Computer Aid, Inc\\Documents\\ChromeDriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);

		
		String taxon = "Turkey Vulture";
		driver.findElement(By.cssSelector("#Lifelist > div.FlexGrid > div.FlexCol.tree-col > div.form-group.TaxonAutocomplete > div > span")).sendKeys(taxon);
		driver.findElement(By.cssSelector("#ui-id-69 > div > div.ac-label > div > span.title")).click();
		
		String commonname = driver.findElement(By.className("comname display-names")).getText().toString();
		String scientificname = driver.findElement(By.className("sciname.species.secondary-name")).getText().toString();
		
		if (taxon.contentEquals(commonname)){
			System.out.println("Common name matches!");
		}else if (taxon.contentEquals(scientificname)) {
			System.out.println("Scientific name matches!");
		}	
		
		String numberofobservations = driver.findElement(By.cssSelector("#TaxaList > ul > li > ul > li > div > span")).getText().toString();
		
		System.out.print("User has observed " + numberofobservations + "instances of taxon " + taxon);
	}
}
