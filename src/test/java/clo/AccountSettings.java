package clo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pageObjects.AccountSettingsPO;
import pageObjects.LogincloPO;
import pageObjects.OverviewpgPO;
import resources.Base;

public class AccountSettings extends Base {
	Logger logger= LogManager.getLogger(getClass());

	public WebDriver driver;
	
	
	
@Test(priority =15)
public void switchYear() throws IOException, InterruptedException
{
	try {
	/*	
	driver = invokeBrowser();
	driver.get("https://qa.crosslinkonline.com/#");
	LogincloPO lp = new LogincloPO(driver);
	OverviewpgPO op = new OverviewpgPO(driver);
	lp.getusername().sendKeys("000334");
	lp.getPassword().sendKeys("P@ssword1");
	Thread.sleep(1000);
	lp.clickLogin().click();
	lp.clicksecLogin().click();
	lp.clickmarkaspublic().click();
	lp.clickthrdcontbtn().click();
   // lp.clickcontbtnIRS().click();
   // lp.clickcanceltour().click();
	Thread.sleep(2000);
    op.clickoverview().click();
    */
    Thread.sleep(1000);
	AccountSettingsPO ap = new AccountSettingsPO(driver);
	//Thread.sleep(2000);
	Wait = new WebDriverWait(driver,20);
	Wait.until(ExpectedConditions.elementToBeClickable(ap.clickaccountsdropdown()));
	ap.clickaccountsdropdown().click();
	//Thread.sleep(1000);
	Wait.until(ExpectedConditions.elementToBeClickable(ap.clickswitchlink()));
	ap.clickswitchlink().click();
	//Thread.sleep(1000);
	//Wait = new WebDriverWait(driver,05);
	Wait.until(ExpectedConditions.elementToBeClickable(ap.clickswitchselectyeardropdown()));
	ap.clickswitchselectyeardropdown().click();
	//Thread.sleep(1000);
	ap.clickswitchoptionyear2017().click();
	//Thread.sleep(1000);
	ap.clickswitchbtn().click();
	//System.out.println("switched to the year 2018");
	logger.info("switched to the year 2017");
	test.log(LogStatus.INFO,"switched to the year 2017");
	Thread.sleep(5000);
	
	Wait.until(ExpectedConditions.elementToBeClickable(ap.clickaccountsdropdown()));
	ap.clickaccountsdropdown().click();
	//Thread.sleep(1000);
	Wait.until(ExpectedConditions.elementToBeClickable(ap.clickswitchlink()));
	ap.clickswitchlink().click();
	//Thread.sleep(1000);
	Wait.until(ExpectedConditions.elementToBeClickable(ap.clickswitchselectyeardropdown()));
	ap.clickswitchselectyeardropdown().click();
	ap.clickswitchoptionyear2018().click();
	ap.clickswitchbtn().click();
	//System.out.println("Switched back to the year 2019");
	logger.info("Switched back to the year 2018");
	test.log(LogStatus.INFO,"Switched back to the year 2018");
	}
	catch(Exception e) {
		logger.error("Error in Switch Year" + e);
		test.log(LogStatus.ERROR, "Error in Switch Year");
	}
}

@Test(priority =16)
public void changePassword() throws IOException, InterruptedException
{
	try {
	AccountSettingsPO ap = new AccountSettingsPO(driver);
	Thread.sleep(2000);
	ap.clickaccountsdropdown().click();
	//Thread.sleep(1000);
	Wait.until(ExpectedConditions.elementToBeClickable(ap.clickchangepasswordlink()));
	ap.clickchangepasswordlink().click();
	ap.clickcurrentpassword().sendKeys("P@ssword1");
	ap.clicknewpassword().sendKeys("P@ssword1");
	ap.clickretypepassword().sendKeys("P@ssword1");
	ap.clickchangepasswordbtn().click();
	//System.out.println("Password has been changed successfully");
	logger.info("Password has been changed successfully");
	test.log(LogStatus.INFO,"Password has been changed successfully");
	}
	catch(Exception e) {
		logger.error("Error in Change Password" + e);
		test.log(LogStatus.ERROR, "Error in Change Password");
	}
	
	}

@Test(priority = 17)
public void changePasswordCancel() throws IOException, InterruptedException
{
	try {
	AccountSettingsPO ap = new AccountSettingsPO(driver);
	Thread.sleep(2000);
	ap.clickaccountsdropdown().click();
	//Thread.sleep(1000);
	Wait.until(ExpectedConditions.elementToBeClickable(ap.clickchangepasswordlink()));
	ap.clickchangepasswordlink().click();
	ap.clickcurrentpassword().sendKeys("P@ssword1");
	ap.clicknewpassword().sendKeys("P@ssword4");
	ap.clickretypepassword().sendKeys("P@ssword4");
	ap.clickcancelbtn().click();
	//System.out.println("Change password cancelled successfully");
	logger.info("Change password cancelled successfully");
	test.log(LogStatus.INFO,"Change password cancelled successfully");
	}
	catch(Exception e) {
		logger.error("Error in Change Password Cancel" + e);
		test.log(LogStatus.ERROR, "Error in Change Password Cancel");
	}
	
}
@Test(priority = 18)
public void toggleTrainingMode() throws IOException, InterruptedException
{
	try {
	AccountSettingsPO ap = new AccountSettingsPO(driver);
	Thread.sleep(2000);
	Wait.until(ExpectedConditions.elementToBeClickable(ap.clickaccountsdropdown()));
	ap.clickaccountsdropdown().click();
	//Thread.sleep(1000);
	Wait.until(ExpectedConditions.elementToBeClickable(ap.clicktoggletrainingmodelink()));
	ap.clicktoggletrainingmodelink().click();
	//System.out.println("Switched to training mode");
	logger.info("Switched to training mode");
	test.log(LogStatus.INFO,"Switched to training mode");
	}
	catch(Exception e) {
		logger.error("Error in Toggle Training Mode" + e);
		test.log(LogStatus.ERROR, "Error in Toggle Training Mode");
	}

}
@Test(priority = 19)
public void toggleTrainingModeOff() throws IOException, InterruptedException
{
	try {
	AccountSettingsPO ap = new AccountSettingsPO(driver);
	Thread.sleep(2000);
	Wait.until(ExpectedConditions.elementToBeClickable(ap.clickaccountsdropdown()));
	ap.clickaccountsdropdown().click();
	//Thread.sleep(1000);
	Wait.until(ExpectedConditions.elementToBeClickable(ap.clicktoggletrainingmodelink()));
	ap.clicktoggletrainingmodelink().click();
	//System.out.println("Training Mode off");
	logger.info("Traning Mode off");
	test.log(LogStatus.INFO,"Training Mode off");
	}
	catch(Exception e) {
		logger.error("Error in Training Mode off" + e);
		test.log(LogStatus.ERROR, "Error in Traning Mode off");
	}
		
	
	
}
@Test(priority = 20)
public void captureSignature() throws IOException, InterruptedException
{
	try {
	AccountSettingsPO ap = new AccountSettingsPO(driver);
	Thread.sleep(2000);
	Wait.until(ExpectedConditions.elementToBeClickable(ap.clickaccountsdropdown()));
	ap.clickaccountsdropdown().click();
	//Thread.sleep(1000);
	Wait.until(ExpectedConditions.elementToBeClickable(ap.clickcapturesignaturelink()));
	ap.clickcapturesignaturelink().click();
	//Thread.sleep(1000);
	Wait.until(ExpectedConditions.elementToBeClickable(ap.clickcapsigbox()));
	//Thread.sleep(1000);
	Actions builder = new Actions(driver);
	 builder.moveToElement(ap.clickcapsigbox()).perform();
	builder.clickAndHold(ap.clickcapsigbox()).perform();
	builder.moveByOffset(250, 50).perform();
	builder.moveToElement(ap.clickcapsigbox()).perform();
	builder.clickAndHold(ap.clickcapsigbox()).perform();
	builder.moveByOffset(90, 15).perform();
	builder.moveToElement(ap.clickcapsigbox()).perform();
	//Thread.sleep(1000);
	Wait.until(ExpectedConditions.elementToBeClickable(ap.clickcapsigpreviewbtn()));
	ap.clickcapsigpreviewbtn().click();
	ap.clickcapsigcancelbtn().click();
	//System.out.println("Captured signature successfully");
	logger.info("Captured signature successfully");
	test.log(LogStatus.INFO,"Captured signature successfully");
	}
	catch(Exception e) {
		logger.error("Error in Capture Signature" + e);
		test.log(LogStatus.ERROR, "Capture Signature");
	}
		
			
}
@Test(priority = 21)
public void loginSettings() throws IOException, InterruptedException
{
	try {
	AccountSettingsPO ap = new AccountSettingsPO(driver);
	Thread.sleep(2000);
	Wait.until(ExpectedConditions.elementToBeClickable(ap.clickaccountsdropdown()));
	ap.clickaccountsdropdown().click();
	ap.clickloginsettingslink().click();
	//System.out.println(ap.clickloginsettingsgstitle().getText());
	logger.info(ap.clickloginsettingsgstitle().getText());
	assertTrue(ap.clickloginsettingsgstitle().getText().contains("Login Preferences"));
	ap.clickloginsetgscancelbtn().click();
	logger.info("Login settings passed");
	test.log(LogStatus.INFO,"Login settings Passed");
}
catch(Exception e) {
	logger.error("Error in Login Settings" + e);
	test.log(LogStatus.ERROR, "Login Settings");
}
	//driver.quit();
}

@BeforeClass
public void login() throws IOException, InterruptedException
{
	driver= invokeBrowser();
	driver.get(prop.getProperty("url"));
	logger.info("URL open-Success");
	LogincloPO lp = new LogincloPO(driver);
	lp.getusername().sendKeys(prop.getProperty("preparerlogin1"));
	lp.getPassword().sendKeys(prop.getProperty("preparerpswd1"));
	Thread.sleep(1000);
	lp.clickLogin().click();
	logger.info("Username and Password success");
	OverviewpgPO op = new OverviewpgPO(driver);
	//Thread.sleep(1000);-----------------1st change
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//WebDriverWait wait = new WebDriverWait(driver,10);
	//wait.until(ExpectedConditions.elementToBeClickable(lp.clicksecLogin()));
	Thread.sleep(2000);
	lp.clicksecLogin().click();
	logger.info("clicked secLogin");
	lp.clickmarkaspublic().click();
	logger.info("Clicked markaspublic");
	lp.clickthrdcontbtn().click();
	logger.info("clicked thirdcontbtn");
	Thread.sleep(2000);
	//Wait.until(ExpectedConditions.elementToBeClickable(op.clickoverview()));
   
	op.clickoverview().click();
	AccountSettingsPO ap = new AccountSettingsPO(driver);
	//Thread.sleep(2000);
	Wait = new WebDriverWait(driver,20);
	Wait.until(ExpectedConditions.elementToBeClickable(ap.clickaccountsdropdown()));
	ap.clickaccountsdropdown().click();
	//Thread.sleep(1000);
	Wait.until(ExpectedConditions.elementToBeClickable(ap.clickswitchlink()));
	ap.clickswitchlink().click();
	//Thread.sleep(1000);
	//Wait = new WebDriverWait(driver,05);
	Wait.until(ExpectedConditions.elementToBeClickable(ap.clickswitchselectyeardropdown()));
	ap.clickswitchselectyeardropdown().click();
	//Thread.sleep(1000);
	ap.clickswitchoptionyear2018().click();
	//Thread.sleep(1000);
	ap.clickswitchbtn().click();
	Thread.sleep(3000);
    
	
}
	//lp.clickcontbtnIRS().click();
@AfterClass
public void teardown()
{
 logger.info("in tear down");
	driver.close();
	report.endTest(test);
	report.flush();
}

}