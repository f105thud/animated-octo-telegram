package iNaturalist.Lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FilterByPlace {
	public static void FilterByPlace(WebDriver driver) {
		
		String Place = "";
	
		driver.findElement(By.xpath("//*[@id=\"Lifelist\"]/div[2]/div[2]/div[2]/div[2]/div/span/div/div/input")).sendKeys(Place);
		driver.findElement(By.xpath("//*[@id=\"ui-id-54\"]")).click();
		
		String ObservationsAtPlace = driver.findElement(By.xpath("//*[@id=\"Lifelist\"]/div[2]/div[2]/div[2]/div[1]/span/span[2]")).getText().toString();
		System.out.println(ObservationsAtPlace + " observations at " + Place);
	}
}
