package baseclass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Userhomepage {
	WebDriver driver;
	public Userhomepage(WebDriver driver)
	{
		this.driver=driver;
	}
	// Deposit Locators
	By Deposit = By.xpath("//button[@ng-click=\"deposit()\"]");
	By amount_input=By.xpath("//input[@ng-model=\"amount\"]");
	By Deposit_button=By.xpath("//button[text()='Deposit']");
	By depositmassage = By.xpath("//span[text()='Deposit Successful']");
	
	//Transactions Locators
	By Withdrawl=By.xpath("//button[@ng-click=\"withdrawl()\"]");
	By Amount=By.xpath("//input[@ng-model=\"amount\"]");
	By Withdrawl_button = By.xpath("//button[text()='Withdraw']");
	By Success_replay =By.xpath("//span[text()='Transaction successful']");

	
	
	public void userpagefunct() throws InterruptedException 
	{
		driver.findElement(Deposit).click();
		  Thread.sleep(2000);
		driver.findElement(amount_input).sendKeys("200");
	  
		driver.findElement(Deposit_button).click();
		WebElement massage=driver.findElement(depositmassage);
		massage.getText();
		Assert.assertEquals(massage.getText(), "Deposit Successful");
		System.out.println("Deposite Success");
		
	}
	public void UserWithdrawl() throws InterruptedException 
	{ driver.findElement(Withdrawl).click();
	Thread.sleep(3000);
	driver.findElement(Amount).sendKeys("100");
	driver.findElement(Withdrawl_button).click();
   WebElement massage=driver.findElement(Success_replay);
   massage.getText();
   Assert.assertEquals(massage.getText(), "Transaction successful");
   System.out.println("Withdrawl Successful");
	}
	}

