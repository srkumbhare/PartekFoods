package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public WebDriver driver;
	
	@FindBy (xpath = "//input[@id='RegisterForm-FirstName']")
	private WebElement FirstName;
	
	@FindBy (xpath = "//input[@id='RegisterForm-LastName']")
	private WebElement LastName;
	
	@FindBy (xpath = "//input[@id='RegisterForm-email']")
	private WebElement email;
	
	@FindBy (xpath = "//input[@id='RegisterForm-password']")
	private WebElement password;
	
	@FindBy (xpath = "//button[normalize-space()='Create']")
	private WebElement create;
	
	public RegisterPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterName() throws InterruptedException {
		FirstName.sendKeys("Virat");
		Thread.sleep(2000);
		LastName.sendKeys("Kohli");
		Thread.sleep(2000);		
	}
	
	public void enterCred() throws InterruptedException {
		email.sendKeys("prad02@gmail.com");
		Thread.sleep(2000);	
		password.sendKeys("xyz#789");
		Thread.sleep(2000);			
	}
	
	public void clickcreate() throws InterruptedException {
		create.click();
		Thread.sleep(2000);	
	}
}
