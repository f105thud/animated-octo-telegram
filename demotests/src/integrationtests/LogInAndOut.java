package integrationtests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import iNaturalist.INatLogin;
import iNaturalist.INatClose;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)   
public class LogInAndOut {
	/*static ExtentTest test;
	static ExtentReports report;*/

public static void main (String args[]) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\OneDrive - Computer Aid, Inc\\Documents\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	/*report = new ExtentReports(System.getProperty("C:\\Users\\Owner\\Documents\\Selenium Reports")+"ExtentReportResults.html");
	test = report.startTest("ExtentDemo");*/	

	INatLogin iNatLogin = new INatLogin();
	INatClose iNatClose = new INatClose();
	iNatLogin.INatLogin(driver);
	iNatClose.INatClose(driver);
	/*test.log(LogStatus.PASS, "Login complete");
	test.addScreenCapture("C:\\Users\\Owner\\Documents\\Selenium Reports");*/

	driver.close();
	System.out.println("Browser closed.  Test complete!");
	/*test.log(LogStatus.PASS, "Browser closed.  Test complete!");
	report.endTest(test);
	report.flush();*/
	}

}


