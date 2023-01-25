package testcase;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	WebDriver driver;
	@BeforeTest
	public void XYZhome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
		driver.manage().timeouts().getPageLoadTimeout();
		driver.manage().window().maximize();
		
	}
@AfterTest
public void closeBrowser() 
{driver.quit();
	}
}
