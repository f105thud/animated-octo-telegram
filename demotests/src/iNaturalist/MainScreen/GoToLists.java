package iNaturalist.MainScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GoToLists {
	public static void GoToLists(WebDriver driver) {

		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[3]/div/ul/li[7]/a/span")).click();
		
		String expectedtitle = "https://www.inaturalist.org/lists/matt-roe";
		String actualtitle = "";
		
		actualtitle = driver.getCurrentUrl();
		
		if (actualtitle.contentEquals(expectedtitle)) {
            System.out.println("Lists tab displayed!");
		}

	}
}
