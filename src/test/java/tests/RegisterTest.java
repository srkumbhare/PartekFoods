package tests;

import org.testng.annotations.*;

import pages.RegisterPage;

public class RegisterTest extends BaseTest {
	
	public RegisterPage rp;
	public void initObjects() {
		rp = new RegisterPage(driver);
	}
	
	@BeforeClass
	public void init() throws InterruptedException {
		launchBrowser();
		initObjects();
	}	
	
  @Test (priority=1)
  public void FirstLastName() throws InterruptedException {
	  rp.enterName();
  }
  
  @Test (priority=2)
  public void EmailPassword() throws InterruptedException {
	  rp.enterCred();
  }
  
  @Test (priority=3)
  public void createAcc() throws InterruptedException {
	  rp.clickcreate();
  }
  
  @AfterClass
  public void closeBrowser() throws InterruptedException {
	  tearDown();
  }
}
