/**
 * 
 */
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author ssreenivasan
 *
 */
//all the page objects in Login page
public class LogincloPO {
	
	public WebDriver driver;//driver has no life
	//to give life to driver,create a constructor
		public LogincloPO(WebDriver driver) {
			this.driver=driver;
		}
	//By is a locator
	//objects at the top
	By username = By.id("txtUsernameLogin");
	By password = By.id("txtPasswordLogin");
	By loginbtn = By.id("btnLoginButtonLogin");
	By seccontbtn = By.id("btnContinueMFAMethod");
	By markaspublic = By.id("markAsPublic");
	By thrdcontbtn = By.id("btnContinueMFACODE");
	By contbtnIRS = By.id("btnContinueIRSMessage");
	By canceltour = By.id("btnStartTour");
	By forgotpasswordbtn = By.id("divForgotPassLogin");//Forgot password link
	By sendcodebtn = By.id("btnSendCodeFP");//Send code in forgot password dialog
	By fpusername = By.id("txtUsernameFP");// username field for forgot password dialog
	
	public WebElement getusername()
	{
		return driver.findElement(username);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement clickLogin()
	{
		return driver.findElement(loginbtn);
	}
	public WebElement clicksecLogin()
	{
		return driver.findElement(seccontbtn);
	}
	public WebElement clickmarkaspublic()
	{
		return driver.findElement(markaspublic);
	}
	public WebElement clickthrdcontbtn()
	{
		return driver.findElement(thrdcontbtn);
	}
	public WebElement clickcontbtnIRS()
	{
		return driver.findElement(contbtnIRS);
	}
	public WebElement clickcanceltour()
	{
		return driver.findElement(canceltour);
	}
	public WebElement clickforgotpassword()
	{
		return driver.findElement(forgotpasswordbtn);
	}
	public WebElement clicksendcodebtn()
	{
		return driver.findElement(sendcodebtn);
	}
	
	public WebElement clickfpusername()
	{
		return driver.findElement(fpusername);
	}
}

