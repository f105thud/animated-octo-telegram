package iNaturalist.Lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Keys;

public class FilterByPlace{
	public static void FilterByPlace(WebDriver driver) {
		
		String Place = "";
		String SortBy = "";
	
		//Click Observations button
		driver.findElement(By.cssSelector("#Lifelist > div.FlexGrid > div.FlexCol.details-col > div.view-selectors > button:nth-child(2)"));
		
		//Enter Place
		driver.findElement(By.xpath("//*[@id=\"Lifelist\"]/div[2]/div[2]/div[2]/div[2]/div/span/div/div/input")).sendKeys(Place);
		driver.findElement(By.xpath("//*[@id=\"Lifelist\"]/div[2]/div[2]/div[2]/div[2]/div/span/div/div/input")).sendKeys(Keys.ENTER);

		//Sort observations by "Oldest to Newest" or "Newest to Oldest"
		driver.findElement(By.cssSelector("#obsSortDropdown")).click();
		if (SortBy.equals("Oldest to Newest")){
			driver.findElement(By.cssSelector("#Lifelist > div.FlexGrid > div.FlexCol.details-col > div.Details > div.Details > div.search-options > div > ul > li:nth-child(2) > a")).click();
		}
		else if (SortBy.equals("Newest to Oldest")) {
			driver.findElement(By.cssSelector("#Lifelist > div.FlexGrid > div.FlexCol.details-col > div.Details > div.Details > div.search-options > div > ul > li:nth-child(1) > a")).click();
		}
		
		String ObservationsAtPlace = driver.findElement(By.cssSelector("#Lifelist > div.FlexGrid > div.FlexCol.details-col > div.Details > div.stats > span > span.value")).getText().toString();
		System.out.println(ObservationsAtPlace + " observations at " + Place);
	}
}