package baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class XYZhomepage {
	WebDriver driver;
	public XYZhomepage(WebDriver driver)
	{
		this.driver=driver;
	}
By Customer_Login=By.xpath("//button[text()='Customer Login']");
By Select_user=By.xpath("//select[@name='userSelect']");
By Login_button =By.xpath("//button[text()='Login']");

	public String verifyTitleOfPage() 
	{
		String title=driver.getTitle();
		return title;
	}
    public void CustomerLogin() throws InterruptedException 
    {
    	driver.findElement(Customer_Login).click();
    	Thread.sleep(2000);
    	WebElement user=driver.findElement(Select_user);
    	Select sc=new Select(user);
    	sc.selectByVisibleText("Harry Potter");
    	driver.findElement(Login_button).click();
    	Thread.sleep(2000);
    }
}
