/**
 * 
 */
package clo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.CompletesetupPO;
import pageObjects.LogincloPO;
import pageObjects.OverviewpgPO;
import pageObjects.PreparerinCompleteSetupPO;
import resources.Base;

/**
 * @author ssreenivasan
 *
 */
public class LoginPage extends Base{
	
	public WebDriver driver;

/*	
@Test(priority = 1)
public void loginNegative() throws IOException, InterruptedException
	{
		driver = invokeBrowser();
		driver.get("https://qa.crosslinkonline.com/#");
		LogincloPO lp = new LogincloPO(driver);
		lp.getusername().sendKeys(prop.getProperty("username"));
		lp.getPassword().sendKeys("password");
		Thread.sleep(1000);
		lp.clickLogin().click();
		WebElement invalidPassword = driver.findElement(By.xpath("//div[text() = 'Incorrect password']"));
		System.out.println(invalidPassword.getText());
		if(invalidPassword.getText().contains("Incorrect password"))
		{
		System.out.println("Login Negative testcase passed" );
		}
		else
		{
			System.out.println("Login Negative testcase failed" );
			
		}
	       driver.quit();
		
	}
	

@Test(priority = 2)
public void forgotPassword() throws IOException, InterruptedException
{
	driver = invokeBrowser();
	driver.get("https://qa.crosslinkonline.com/#");
	LogincloPO lp = new LogincloPO(driver);
	//lp.getusername().sendKeys(prop.getProperty("username"));
	lp.clickforgotpassword().click();
	Thread.sleep(1000);
	lp.clickfpusername().click();
	lp.clickfpusername().sendKeys("nidhi");
	lp.clicksendcodebtn().click();
	Thread.sleep(1000);
	WebElement emailsentdialog = driver.findElement(By.id("confirm-delete-title"));
	System.out.println(emailsentdialog.getText());
	assertTrue(emailsentdialog.getText().contains("EMAIL SENT"));
	System.out.println("forgot password passed");
	WebElement donebtn = driver.findElement(By.id("btnHideEmailSentModal"));
	donebtn.click();
	driver.quit();
}
*/
@Test(priority = 3)
public void loginPositive() throws IOException, InterruptedException
{
	driver = invokeBrowser();
	driver.get("https://qa.crosslinkonline.com/#");
	//driver.get(prop.getProperty("url"));
	//create a obj for logincloPO 
	LogincloPO lp = new LogincloPO(driver);
	OverviewpgPO op = new OverviewpgPO(driver);
	lp.getusername().sendKeys("000334");
	lp.getPassword().sendKeys("P@ssword1");
	Thread.sleep(1000);
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
   Thread.sleep(1000);
   
	
}

/*

@Test
public void addPreparerPositive() throws IOException
{
	driver = invokeBrowser();
	driver.get("https://qa.crosslinkonline.com/#");
	LogincloPO lp = new LogincloPO(driver);
	lp.getusername().sendKeys("000334");
	lp.getPassword().sendKeys("P@ssword1");
	lp.clickLogin().click();
	lp.clicksecLogin().click();
	lp.clickmarkaspublic().click();
	lp.clickthrdcontbtn().click();
    lp.clickcontbtnIRS().click();
    lp.clickcanceltour().click();
    try {
		
		OverviewpgPO op = new OverviewpgPO(driver);
		op.clickNewpreparerbtn().click();
		//logger.info("Clicked New preparer button");
		Thread.sleep(1000);
		PreparerinCompleteSetupPO pc= new PreparerinCompleteSetupPO(driver);
		pc.clkAddNewbtn().click();
		//logger.info("Entering New Preparers Info");
		pc.getPrepID().sendKeys("505");
		//pc.getThirdPartyPIN().sendKeys("12345");
		pc.getPrepName().sendKeys("505Test Preparer");
		pc.getPrepSSN().sendKeys("123456789");
		pc.getPrepPTIN().sendKeys("P01111111");
		pc.getPrepType().click();
		pc.getPrepTypeOption().click();
		pc.getPrepEmail().sendKeys("qa13@petzent.com");
		pc.getPrepcellph().sendKeys("6103088236");
		pc.getPrepcellCarrier().click();
		pc.getprepcellCarrierOption().click();
		pc.getFirmName().sendKeys("The Firm");
		//pc.getEIN().sendKeys("123456789");
		pc.getFirmAddress().sendKeys("12 main st");
		pc.getCity().sendKeys("tracy");
		pc.getState().sendKeys("CA");
		pc.getZip().sendKeys("95337");
		pc.getOfficeph().sendKeys("2094568252");
		pc.getEFINID().sendKeys("0000333");
		pc.clickAddNewPrep().click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		if(pc.getErrortoNewPrep().isDisplayed())
		{
			logger.error("Alert shows: " + pc.getErrortoNewPrep().getText());
			logger.fatal("Error Desc : " + pc.getErrorDesc().getText());
			pc.clickDonebtninError().click();
		}
		else 
		{
			logger.info("New Preparer Created");
			pc.clickDonebtninError().click();
		}
		
		CompletesetupPO cs = new CompletesetupPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(cs.clkCloseSetupBtn()));
		//logger.info("explicit wait success");
		cs.clkCloseSetupBtn().click();
		logger.info("Closing the setup.Going to Overview page");
		//Thread.sleep(1000);--------------1st change
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	} catch (Exception e) {
		logger.error("Error " + e);
	}
}
}
}

*/

	@Test(priority = 4)
	public void createNewAppointment() throws IOException, InterruptedException
	{
	
		LogincloPO lp = new LogincloPO(driver);
		OverviewpgPO op = new OverviewpgPO(driver);
		Thread.sleep(2000);
		op.clickappointmenticonbtn().click();
		op.clicknewappointmentbtn().click();
		op.clickapptfirstname().sendKeys("First");
		op.clickapptlastname().sendKeys("Appontment");
		op.clickapptsubject().sendKeys("Appointment schedule");
		op.clickapptpreparesname().sendKeys("Testpreparer");
		op.clickapptphonenumber().sendKeys("2098352720");
		op.clickapptcomments().sendKeys("Test comments!");
		Thread.sleep(1000);
		op.clickapptsendbtn().click();
		Thread.sleep(2000);
		System.out.println(op.clickapptcreateddialog().getText());
		assertTrue(op.clickapptcreateddialog().getText().contains("The appointment was created successfully."));
		System.out.println("Create new appointment passed");
		op.clickapptcreatedclsoebtn().click();
		Thread.sleep(1000);
	
	}
	
	@Test(priority = 5)
	public void createApptSameTime() throws IOException, InterruptedException
	{
	
		LogincloPO lp = new LogincloPO(driver);
		OverviewpgPO op = new OverviewpgPO(driver);
		Thread.sleep(2000);
		op.clickappointmenticonbtn().click();
		op.clicknewappointmentbtn().click();
		op.clickapptfirstname().sendKeys("Second");
		op.clickapptlastname().sendKeys("Appointment");
		op.clickapptsubject().sendKeys("Another appointment at same time");
		op.clickapptpreparesname().sendKeys("Testpreparer");
		op.clickapptphonenumber().sendKeys("2098352720");
		op.clickapptcomments().sendKeys("Test comments!");
		Thread.sleep(1000);
		op.clickapptsendbtn().click();
		Thread.sleep(2000);
		op.clickapptschconflictconfirmbtn().click();
		System.out.println(op.clickapptcreateddialog().getText());
		assertTrue(op.clickapptcreateddialog().getText().contains("The appointment was created successfully."));
		System.out.println("Create new appointment passed");
		op.clickapptcreatedclsoebtn().click();
		Thread.sleep(1000);
		
	}
	@Test(priority = 6)
	public void updateAppointment() throws IOException, InterruptedException
	{
		Thread.sleep(1000);
		OverviewpgPO op = new OverviewpgPO(driver);
		op.clickapptupdatebtn().click();
		Thread.sleep(1000);
		op.clickapptsubjectupdatemodal().clear();
		op.clickapptsubjectupdatemodal().sendKeys("Updated Subject");
		System.out.println("Updated Subject");
		op.clickapptphonenumberupdatemodal().clear();
		op.clickapptphonenumberupdatemodal().sendKeys("2098352777");
		System.out.println("Updated phonenumber");
		op.clickapptscommentupdatemodal().clear();
		op.clickapptscommentupdatemodal().sendKeys("comments updated");
		System.out.println("updated comments");
		op.clickapptupdatemodalbtn().click();
		Thread.sleep(2000);
		System.out.println(op.clickapptcreateddialog().getText());
		assertTrue(op.clickapptcreateddialog().getText().contains("The appointment was updated successfully."));
		System.out.println("Update appointment passed");
		op.clickapptcloseupdatemodalbtn().click();
		Thread.sleep(1000);
		
	}
	
	@Test(priority = 7)
	public void deleteAppointment() throws IOException, InterruptedException
	{
		OverviewpgPO op = new OverviewpgPO(driver);
		op.clickapptdeletebtn().click();
		Thread.sleep(1000);
		op.clickapptdelconfirmbtn().click();
		//System.out.println(op.clickapptcreateddialog().getText());
		//assertTrue(op.clickapptcreateddialog().getText().contains("The appointment was deleted successfully."));
		System.out.println("Delete appointment passed");
		//op.clickapptclosedeletemodalbtn().click();
	}

	
	@Test(priority = 8)
	public void newMessageSent() throws IOException, InterruptedException
	{
		Thread.sleep(1000);
		OverviewpgPO op = new OverviewpgPO(driver);
		op.clicknotificonbtn().click();
		op.clicknotifnewmesgbtn().click();
		Thread.sleep(1000);
		op.clicknotifpreparerdropdown().click();
		op.clicknotifpreparerdpfirstlist().click();
		Thread.sleep(1000);
		op.clicknotifsubject().sendKeys("Automation Test Message");
		op.clicknotifbody().sendKeys("Automation test message body");
		op.clicknotifsendbtn().click();
		System.out.println(op.clicknotifmesgsentdialog().getText());
		assertTrue(op.clicknotifmesgsentdialog().getText().contains("The message was sent successfully"));
		System.out.println("New Message Sent passed");
		op.clicknotifdonebtn().click();
		
	}
	
	
	@Test(priority = 9)
	public void newMessageReply() throws IOException, InterruptedException
	{
		Thread.sleep(2000);
		OverviewpgPO op = new OverviewpgPO(driver);
		op.clicknotifreceivedbtn().click();
		Thread.sleep(1000);
		op.clicknotifreplybtn().click();
		op.clicknotifbody().sendKeys("Reply through Automation");
		op.clicknotifsendbtn().click();
		System.out.println(op.clicknotifmesgsentdialog().getText());
		assertTrue(op.clicknotifmesgsentdialog().getText().contains("The message was sent successfully"));
		System.out.println("New Message Reply passed");
		op.clicknotifdonebtn().click();
		
	}	
	
	@Test(priority = 10)
	public void deleteMessage() throws IOException, InterruptedException
	{
		Thread.sleep(2000);
		OverviewpgPO op = new OverviewpgPO(driver);
		op.clicknotifdeletebtn().click();
		op.clicknotifdelmesgdialog().click();
		op.clicknotifdelmesgdialogyesbtn().click();
		System.out.println("Delete Message Passed");
	}
	
	
	/*
	@Test(priority = 11)
	public void checksReadyToPrint() throws IOException, InterruptedException
	{
		Thread.sleep(1000);
		OverviewpgPO op = new OverviewpgPO(driver);
		op.clickchksiconbtn().click();
		op.clickchksfilterdropdown().click();
		op.clickchksfiltertpgbank().click();
		Thread.sleep(1000);
		op.clickchksselectallchkbox().click();
		op.clickchksprintbtn().click();
		Thread.sleep(1000);
		System.out.println(op.clickchksprintchecksdialog().getText());
		assertTrue(op.clickchksprintchecksdialog().getText().contains("Print Checks"));
		Thread.sleep(1000);
		op.clickchksprintcheckscancelbtn().click();
	}
				
	@Test(priority = 12)
	public void checksRegister() throws IOException, InterruptedException
	{
		OverviewpgPO op = new OverviewpgPO(driver); 
		Thread.sleep(1000);
		op.clickchkscheckregistertab().click();
		Thread.sleep(1000);
		op.clickchksselectallchkbox().click();
		op.clickchksreprintbtn().click();
		Thread.sleep(1000);
		System.out.println(op.clickchksprintchecksdialog().getText());
		assertTrue(op.clickchksprintchecksdialog().getText().contains("Check Reprint"));
		Thread.sleep(1000);
		op.clickchksprintcheckscancelbtn().click();
	}
	*/
}




