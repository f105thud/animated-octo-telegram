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

public class CreateNewList {
	public static void CreateNewList (WebDriver driver) {
		
		//Click New List button
		driver.findElement(By.cssSelector("#newlistbutton")).click();
		
		//Enter List and Description parameters
		WebElement Title = driver.findElement(By.cssSelector("#list_title"));
		String NewList = "New List";
		
		Title.click();
		Title.sendKeys(NewList);
		
		WebElement Description = driver.findElement(By.cssSelector("#list_description"));
		String ListDescription = "This is a sample list description";
		
		Description.click();
		Description.sendKeys(ListDescription);
		
		//Click Save button
		driver.findElement(By.cssSelector("#new_list > div.column.span-24 > div > input")).click();
		
		//Verify that list creation message is displayed
		if (driver.findElement(By.cssSelector("#flash")).isDisplayed()){
			System.out.println("List created successfully!");
		} else {
			System.out.println("List not created");
		}
		
		//Verify that name of the newly created list matches
		String FullName = driver.findElement(By.cssSelector("#pageheader > h2")).toString();
		
		if (FullName.contains(NewList)) {
			System.out.println("Name matches");
		}else {
			System.out.println("Name does not match");
		}
		
		//Verify that description of the newly created list matches
		String FullDescription = driver.findElement(By.cssSelector("#description")).toString();
		
		if (FullDescription.contentEquals(ListDescription)) {
			System.out.println("Description matches");
		}else System.out.println("Description does not match");
	}
}
