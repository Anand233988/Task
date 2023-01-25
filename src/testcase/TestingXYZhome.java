package testcase;


import org.testng.Assert;

import org.testng.annotations.Test;

import baseclass.Userhomepage;
import baseclass.XYZhomepage;

public class TestingXYZhome extends TestBase
{	XYZhomepage ref;
	Userhomepage urepo;

	@Test(priority = 0)
	public void XYZFunctions() throws InterruptedException {
		 ref = new XYZhomepage(driver);
		
		Assert.assertEquals(ref.verifyTitleOfPage(), "Protractor practice website - Banking App");
		ref.CustomerLogin();
	}
	@Test(priority = 1)
	public void userlogin() throws InterruptedException  
	{
		urepo =new Userhomepage(driver);
		urepo.userpagefunct();
		urepo.UserWithdrawl();
	}
	
}

