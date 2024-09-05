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
import iNaturalist.Lists.ViewLifelist;
import iNaturalist.MainScreen.GoToLists;


public class LifeList {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\OneDrive - Computer Aid, Inc\\Documents\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		INatLogin iNatLogin = new INatLogin();
		INatClose iNatClose = new INatClose();
		ViewLifelist viewlifelist = new ViewLifelist();
		GoToLists gotolists = new GoToLists();
		
		iNatLogin.INatLogin(driver);
		Thread.sleep(10000);
		gotolists.GoToLists(driver);
		Thread.sleep(3000);
		viewlifelist.ViewLifeList(driver);
		Thread.sleep(3000);
		iNatClose.INatClose(driver);
		System.out.println("Browser closed.  Test complete!");
	}
}
