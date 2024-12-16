package iNaturalist.Lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Keys;

public class FilterAndSortSpecies {

	public static void FilterAndSortSpecies(WebDriver driver) {
		
		String Place = "";
		String SortBy = "";
		String Show = "";
		
		//Click the Species button
		driver.findElement(By.cssSelector("#Lifelist > div.FlexGrid > div.FlexCol.details-col > div.view-selectors > button:nth-child(1)")).click();

		//Enter Place value
		driver.findElement(By.xpath("//*[@id=\"Lifelist\"]/div[2]/div[2]/div[2]/div[2]/div/span/div/div/input")).sendKeys(Place);
		driver.findElement(By.xpath("//*[@id=\"Lifelist\"]/div[2]/div[2]/div[2]/div[2]/div/span/div/div/input")).sendKeys(Keys.ENTER);

		//Select SortBy value
		driver.findElement(By.cssSelector("#speciesSortDropdown")).click();
		
		switch(SortBy) {
		case "Most Observed" :
		driver.findElement(By.xpath("//*[@id=\"Lifelist\"]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/ul/li[1]/a"));
		break;
		
		case "Least Observed" :
		driver.findElement(By.xpath("//*[@id=\"Lifelist\"]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/ul/li[2]/a"));
		break;
		
		case "Name" :
		driver.findElement(By.xpath("//*[@id=\"Lifelist\"]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/ul/li[3]/a"));
		break;
		
		case "Taxonomic" :
		driver.findElement(By.xpath("//*[@id=\"Lifelist\"]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/ul/li[4]/a"));
		break;
		}
		
		//Select Show value
		driver.findElement(By.cssSelector("#rankDropdown")).click();
		
		switch(Show) {
		
		case "Children" :
		driver.findElement(By.xpath("//*[@id=\"Lifelist\"]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/ul/li[1]/a"));
		break;
		
		case "Kingdoms" :
		driver.findElement(By.xpath("//*[@id=\"Lifelist\"]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/ul/li[2]/a"));
		break;
		
		case "Phyla" :
		driver.findElement(By.xpath("//*[@id=\"Lifelist\"]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/ul/li[3]/a"));
		break;
		
		case "Classes" :
		driver.findElement(By.xpath("//*[@id=\"Lifelist\"]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/ul/li[4]/a"));
		break;
		
		case "Orders" :
		driver.findElement(By.xpath("//*[@id=\"Lifelist\"]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/ul/li[5]/a"));
		break;
		
		case "Families" :
		driver.findElement(By.xpath("//*[@id=\"Lifelist\"]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/ul/li[6]/a"));
		break;
		
		case "Genera" :
		driver.findElement(By.xpath("//*[@id=\"Lifelist\"]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/ul/li[7]/a"));
		break;
		
		case "Species" :
		driver.findElement(By.xpath("//*[@id=\"Lifelist\"]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/ul/li[8]/a"));
		break;
		
		case "Leaves" :
		driver.findElement(By.xpath("//*[@id=\"Lifelist\"]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/ul/li[9]/a"));
		break;
		}
		String ObservationsAtPlace = driver.findElement(By.cssSelector("#Lifelist > div.FlexGrid > div.FlexCol.details-col > div.Details > div.stats > span > span.value")).getText().toString();
		System.out.println(ObservationsAtPlace + " observations at " + Place);
		
	}

}
