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
import iNaturalist.UpperRibbon.SubmitObservation;
import iNaturalist.UpperRibbon.UploadPhoto;

public class UploadAndSubmitObservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*report = new ExtentReports(System.getProperty("C:\\Users\\Owner\\Documents\\Selenium Reports")+"ExtentReportResults.html");
		test = report.startTest("ExtentDemo");*/	

		INatLogin iNatLogin = new INatLogin();
		INatClose iNatClose = new INatClose();
		UploadPhoto uploadphoto = new UploadPhoto();
		SubmitObservation submitobs = new SubmitObservation();
		
		iNatLogin.INatLogin(driver);
		uploadphoto.UploadPhoto(driver);
		submitobs.SubmitObservation(driver);
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
