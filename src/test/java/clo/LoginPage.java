/**
 * 
 */
package clo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.LogincloPO;
import pageObjects.OverviewpgPO;
import resources.Base;

/**
 * @author ssreenivasan
 *
 */
public class LoginPage extends Base{
	
	public WebDriver driver;

	@Test
	public void loginPositive() throws IOException, InterruptedException
	{
		driver = invokeBrowser();
		driver.get("https://qa.crosslinkonline.com/#");
		//driver.get(prop.getProperty("url"));
		//create a obj for logincloPO 
		LogincloPO lp = new LogincloPO(driver);
		OverviewpgPO op = new OverviewpgPO(driver);
		lp.getusername().sendKeys(prop.getProperty("username"));
		lp.getPassword().sendKeys(prop.getProperty("password"));
		lp.clickLogin().click();
		lp.clicksecLogin().click();
		lp.clickmarkaspublic().click();
		lp.clickthrdcontbtn().click();
        lp.clickcontbtnIRS().click();
        lp.clickcanceltour().click();
		Thread.sleep(2000);
	    op.clickoverview().click();
	    System.out.println(op.clickoverview().getText());
       assertTrue(op.clickoverview().getText().contains("Overview"));
       System.out.println("Login Positive testcase passed" );
       driver.quit();
       
		
	}

	/*

	@Test
	public void loginNegative() throws IOException
	{
		driver = invokeBrowser();
		driver.get("https://qa.crosslinkonline.com/#");
		LogincloPO lp = new LogincloPO(driver);
		lp.getusername().sendKeys(prop.getProperty("username"));
		lp.getPassword().sendKeys("password");
		lp.clickLogin().click();
		WebElement invalidPassword = driver.findElement(By.xpath(xpathExpression));
		
		*/
		
	

/*

@Test
public void forgotPassword() throws IOException, InterruptedException
{
	driver = invokeBrowser();
	driver.get("https://qa.crosslinkonline.com/#");
	LogincloPO lp = new LogincloPO(driver);
	//lp.getusername().sendKeys(prop.getProperty("username"));
	lp.clickforgotpassword().click();
	Thread.sleep(1000);
	lp.getfpusername().sendKeys("nidhi");
	lp.clicksendcodebtn();
	WebElement emailsentdialog = driver.findElement(By.id("confirm-delete-title"));
	System.out.println(emailsentdialog.getText());
	assertTrue(emailsentdialog.getText().contains("EMAIL SENT"));
	System.out.println("forgot password passed");
	driver.quit();
	}
	*/
	
}
	

