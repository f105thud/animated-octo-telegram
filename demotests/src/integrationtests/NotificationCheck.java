package integrationtests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.runners.MethodSorters;

import java.util.concurrent.TimeUnit;

import org.junit.FixMethodOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import iNaturalist.INatLogin;
import iNaturalist.INatClose;
import iNaturalist.UpperRibbon.CheckNotifications;

public class NotificationCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		INatLogin iNatLogin = new INatLogin();
		INatClose iNatClose = new INatClose();
		CheckNotifications CheckNotifs = new CheckNotifications();
		iNatLogin.INatLogin(driver);
		Thread.sleep(3000);
		CheckNotifs.CheckNotifications(driver);
		iNatClose.INatClose(driver);
		System.out.println("Browser closed.  Test complete!");
	}

}
