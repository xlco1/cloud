package clo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pageObjects.AccountSettingsPO;
import pageObjects.DatabaseSettingsPO;
import pageObjects.LogincloPO;
import pageObjects.OverviewpgPO;
import resources.Base;

public class DatabaseSettings extends Base {
	Logger logger= LogManager.getLogger(getClass());
	public WebDriver driver;
	
	@Test(priority =22)
	public void dbAddCity() throws IOException, InterruptedException
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
	    //lp.clickcontbtnIRS().click();
	    //lp.clickcanceltour().click();
		Thread.sleep(2000);
	    op.clickoverview().click();*/
	    Thread.sleep(1000);
		AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);
		Thread.sleep(2000);
		ap.clickaccountsdropdown().click();
		//Thread.sleep(1000);
		Wait = new WebDriverWait(driver,20);
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickdatabaselink()));
		dp.clickdatabaselink().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickcitieszipcodeslink()));
		dp.clickcitieszipcodeslink().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickaddnewbtn()));
		dp.clickaddnewbtn().click();
		dp.clickcitieszipcodetxtbox().sendKeys("12345");
		dp.clickcitiescitytxtbox().sendKeys("Test City");
		dp.clickcitiesstatecodetxtbox().sendKeys("CA");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickcitiesaddbtn()));
		dp.clickcitiesaddbtn().click();
		//Thread.sleep(1000);
		//dp.clicksearchfield().sendKeys("12345");
		//WebElement testzip = driver.findElement(By.xpath("//tr/td[text() = '12345']"));
		//assertTrue(testzip.contains("12345"));
		//System.out.println("New city added");
		logger.info("New city added");
		test.log(LogStatus.INFO,"New city added");
		}
		catch(Exception e) {
			logger.error("Error in Add DB city" + e);
			test.log(LogStatus.ERROR, "Error in Add DB City");
		}
		}
	
	@Test(priority = 23)
	public void dbEditCity() throws IOException, InterruptedException
	{
		try {
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickeditbtn()));
		dp.clickeditbtn().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickcitieszipcodetxtbox()));
		dp.clickcitieszipcodetxtbox().clear();
		dp.clickcitieszipcodetxtbox().sendKeys("12346");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickcitiescitytxtbox()));
		dp.clickcitiescitytxtbox().clear();
		dp.clickcitiescitytxtbox().sendKeys("Test City Edited");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickcitiesaddbtn()));
		dp.clickcitiesaddbtn().click();
		//System.out.println(" City Edited Sucessfully");
		logger.info("City Edited Sucessfully");
		test.log(LogStatus.INFO,"City Edited Sucessfully");
		}
		catch(Exception e) {
			logger.error("Error in Edit DB city" + e);
			test.log(LogStatus.ERROR, "Error in Edit DB City");
		}
		
		}
	
	@Test(priority = 24)
	public void dbDeleteCity() throws IOException, InterruptedException
	{
		try {
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Actions act = new Actions(driver);
		act.moveToElement(dp.clickeditbtn()).moveToElement(dp.clickthreedots()).click().build().perform();
		Thread.sleep(1000);
		act.moveToElement(driver.findElement(By.cssSelector("#anchorDeleteButton"))).click().perform();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickcitiesdeletemodaldelbtn()));
		dp.clickcitiesdeletemodaldelbtn().click();
		logger.info("City Deleted Successfully");
		test.log(LogStatus.INFO,"City Deleted Successfully");
		}
		catch(Exception e) {
			logger.error("Error in Delete DB city" + e);
			test.log(LogStatus.ERROR, "Error in Delete DB City");
		}
	
	}
	
	@Test(priority = 25)
	public void dbaddEmployer() throws IOException, InterruptedException
	{
		try {
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		//Wait.until(ExpectedConditions.elementToBeClickable(dp.clickemployerspayerslink()));
		Thread.sleep(1000);
		dp.clickemployerspayerslink().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickaddnewbtn()));
		dp.clickaddnewbtn().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickempfederaleintxtbx()));
		dp.clickempfederaleintxtbx().sendKeys("111111111");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickempnamecontroltxtbx()));
		dp.clickempnamecontroltxtbx().sendKeys("Test");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickempcompanyname()));
		dp.clickempcompanyname().sendKeys("Automation company");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickempcompanyaddress()));
		dp.clickempcompanyaddress().sendKeys("7575 Linne Rd");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickempcitytxtbx()));
		dp.clickempcitytxtbx().sendKeys("Tracy");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickempstatetxtbx()));
		dp.clickempstatetxtbx().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickempCAstatetxtbx()));
		dp.clickempCAstatetxtbx().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickempzipcodetxtbx()));
		dp.clickempzipcodetxtbx().sendKeys("95304");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickempstate1identftxtbx()));
		dp.clickempstate1identftxtbx().sendKeys("123456789");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickempsavebtn()));
		dp.clickempsavebtn().click();
		//System.out.println(" New Employer added Successfully");
		logger.info("New Employer added Successfully");
		test.log(LogStatus.INFO,"New Employer added Successfully");
		}
		catch(Exception e) {
			logger.error("Error in Add DB Employer" + e);
			test.log(LogStatus.ERROR, "Error in Add DB Employer");
		}
	}
	
	@Test(priority = 26)
	public void dbeditEmployer() throws IOException, InterruptedException
	{
		try {
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickeditbtn()));
		dp.clickeditbtn().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickempfederaleintxtbx()));
		dp.clickempfederaleintxtbx().clear();
		dp.clickempfederaleintxtbx().sendKeys("111111112");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickempnamecontroltxtbx()));
		dp.clickempnamecontroltxtbx().clear();
		dp.clickempnamecontroltxtbx().sendKeys("TestUpdated");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickempcompanyname()));
		dp.clickempcompanyname().clear();
		dp.clickempcompanyname().sendKeys("Automation company Update");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickempcompanyaddress()));
		dp.clickempcompanyaddress().clear();
		dp.clickempcompanyaddress().sendKeys("7576 Linne Rd");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickempsavebtn()));
		dp.clickempsavebtn().click();
		//System.out.println(" New Employer Editted Successfully");
		logger.info("New Employer Editted Successfully");
		test.log(LogStatus.INFO,"New Employer Editted Successfully");
		}
		catch(Exception e) {
			logger.error("Error in Edit DB Employer" + e);
			test.log(LogStatus.ERROR, "Error in Edit DB Employer");
		}
	}
	
	@Test(priority = 27)
	public void dbDeleteEmployer() throws IOException, InterruptedException
	{
		try {
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		//WebElement frstRow = driver.findElement(By.xpath("//tr/td[text() = 'Test City Edited,CA']"));
		Actions act = new Actions(driver);
		act.moveToElement(dp.clickeditbtn()).moveToElement(dp.clickthreedots()).click().build().perform();
		//dp.clickthreedots().click();
		//dp.clickcitiesdeletebtn().click();
		act.moveToElement(driver.findElement(By.cssSelector("#anchorDeleteButton"))).click().perform();
		//assertTrue(dp.clickcitiesdeltitle().getText().contains("Test City Edited,CA"));
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickcitiesdeletemodaldelbtn()));
		dp.clickcitiesdeletemodaldelbtn().click();
		logger.info("Employer Deleted Successfully");
		test.log(LogStatus.INFO,"Employer Deleted Successfully");
		}
		catch(Exception e) {
			logger.error("Error in Delete DB Employer" + e);
			test.log(LogStatus.ERROR, "Error in Delete DB Employer");
		}
}
	
	@Test(priority = 28)
	public void dbaddCareProvider() throws IOException, InterruptedException
	{
		try {
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		dp.clickcareproviderslink().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickaddnewbtn()));
		dp.clickaddnewbtn().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickprovidercode()));
		dp.clickprovidercode().sendKeys("11111111");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickprovidertype()));
		dp.clickprovidertype().sendKeys("Test type");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickprovidernamecontrol()));
		dp.clickprovidernamecontrol().sendKeys("Proctrl");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickcareprovidername()));
		dp.clickcareprovidername().sendKeys("Test Careprovider");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickprovideradd()));
		dp.clickprovideradd().sendKeys("128 Indigo dr");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickprovidercity()));
		dp.clickprovidercity().sendKeys("Mountain House");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickproviderstate()));
		dp.clickproviderstate().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickproviderCAstate()));
		dp.clickproviderCAstate().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickproviderzipcode()));
		dp.clickproviderzipcode().sendKeys("95391");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickprovidersavebtn()));
		dp.clickprovidersavebtn().click();
		logger.info("New Care provider added successfully");
		test.log(LogStatus.INFO,"New Care provider added successfully");
		}
		catch(Exception e) {
			logger.error("Error in  Add DB Care Provider" + e);
			test.log(LogStatus.ERROR, "Error in Add DB Care Provider");
		}
		}
	
	@Test(priority = 29)
	public void dbeditCareProvider() throws IOException, InterruptedException
	{
		try {
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickeditbtn()));
		dp.clickeditbtn().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickprovidercode()));
		dp.clickprovidercode().clear();
		dp.clickprovidercode().sendKeys("11111112");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickcareprovidername()));
		dp.clickcareprovidername().clear();
		dp.clickcareprovidername().sendKeys("NameUpdated Careprovider");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickprovideradd()));
		dp.clickprovideradd().sendKeys("128 ritta dr");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickprovidersavebtn()));
		dp.clickprovidersavebtn().click();
		logger.info("Care provider editted successfully");
		test.log(LogStatus.INFO,"Care provider editted successfully");
		}
		catch(Exception e) {
			logger.error("Error in  Edit DB Care Provider" + e);
			test.log(LogStatus.ERROR, "Error in Edit DB Care Provider");
		}
		}
	
	
	@Test(priority = 30)
	public void dbDeleteCareProvider() throws IOException, InterruptedException
	{
		try {
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.moveToElement(dp.clickeditbtn()).moveToElement(dp.clickthreedots()).click().build().perform();
		//dp.clickthreedots().click();
		act.moveToElement(driver.findElement(By.cssSelector("#anchorDeleteButton"))).click().perform();
		//dp.clickcitiesdeletebtn().click();
		//assertTrue(dp.clickcitiesdeltitle().getText().contains("Test City Edited,CA"));
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickcitiesdeletemodaldelbtn()));
		dp.clickcitiesdeletemodaldelbtn().click();
		logger.info("Care Provider Deleted Successfully");
		test.log(LogStatus.INFO,"Care Provider Deleted Successfully");
		}
		catch(Exception e) {
			logger.error("Error in  Delete DB Care Provider" + e);
			test.log(LogStatus.ERROR, "Error in Delete DB Care Provider");
		}
	}
		
	@Test(priority = 31)
	public void dbaddReferrals() throws IOException, InterruptedException
	{
		try {
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		dp.clickreferralslink().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickaddnewbtn()));
		dp.clickaddnewbtn().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickreferralsname()));
		dp.clickreferralsname().sendKeys("12345");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickreferralsaddbtn()));
		dp.clickreferralsaddbtn().click();
		logger.info("Refferrals added successfully");
		test.log(LogStatus.INFO,"Refferrals added successfully");
		}
		catch(Exception e) {
			logger.error("Error in  Add DB Referrals" + e);
			test.log(LogStatus.ERROR, "Error in Add DB Referrals");
		}
	}
	
	@Test(priority = 32)
	public void dbeditReferrals() throws IOException, InterruptedException
	{
		try {
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickeditbtn()));
		dp.clickeditbtn().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickreferralsname()));
		dp.clickreferralsname().clear();
		dp.clickreferralsname().sendKeys("12354");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickreferralsaddbtn()));
		dp.clickreferralsaddbtn().click();
		logger.info(" Refferrals editted successfully");
		test.log(LogStatus.INFO,"Refferrals editted successfully");
		}
		catch(Exception e) {
			logger.error("Error in  Edit DB Referrals" + e);
			test.log(LogStatus.ERROR, "Error in Edit DB Referrals");
		}
	}
	
	@Test(priority = 33)
	public void dbDeleteReferrals() throws IOException, InterruptedException
	{
		try {
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		//WebElement frstRow = driver.findElement(By.xpath("//tr/td[text() = 'Test City Edited,CA']"));
		Actions act = new Actions(driver);
		act.moveToElement(dp.clickeditbtn()).moveToElement(dp.clickthreedots()).click().build().perform();
		//dp.clickthreedots().click();
		act.moveToElement(driver.findElement(By.cssSelector("#anchorDeleteButton"))).click().perform();
		//dp.clickcitiesdeletebtn().click();
		//assertTrue(dp.clickcitiesdeltitle().getText().contains("Test City Edited,CA"));
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickcitiesdeletemodaldelbtn()));
		dp.clickcitiesdeletemodaldelbtn().click();
		//WebElement donebtn = driver.findElement(By.id("btnHideSettingsError"));
		/*
		if(donebtn.isDisplayed())
		{
			donebtn.click();
		}*/
		logger.info(" Referrals Deleted Successfully");
		test.log(LogStatus.INFO,"Referrals Deleted Successfully");
		}
		catch(Exception e) {
			logger.error("Error in  Delete DB Referrals" + e);
			test.log(LogStatus.ERROR, "Error in Delete DB Referrals");
		}
	}
		
	
	@Test(priority = 34)
	public void dbaddDonee() throws IOException, InterruptedException
	{
		
		try{
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		dp.clickdoneelink().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickaddnewbtn()));
		dp.clickaddnewbtn().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickdoneeein()));
		dp.clickdoneeein().sendKeys("11111111");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickdoneename()));
		dp.clickdoneename().sendKeys("Automation Donee");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickdoneeadd()));
		dp.clickdoneeadd().sendKeys("1111 Test Street");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickdoneecity()));
		dp.clickdoneecity().sendKeys("Test City");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickdoneestate()));
		dp.clickdoneestate().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickdoneeCAstate()));
		dp.clickdoneeCAstate().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickdoneezipcode()));
		dp.clickdoneezipcode().sendKeys("91119");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickdoneesavebtn()));
		dp.clickdoneesavebtn().click();
		logger.info(" Donee added successfully");
		test.log(LogStatus.INFO,"Donee added successfully");
		}
		catch(Exception e) {
			logger.error("Error in  Add DB Donee" + e);
			test.log(LogStatus.ERROR, "Error in Add DB Donee");
		}
	}
	
	@Test(priority = 35)
	public void dbeditDonee() throws IOException, InterruptedException
	{
		try {
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickeditbtn()));
		dp.clickeditbtn().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickdoneeein()));
		dp.clickdoneeein().clear();
		dp.clickdoneeein().sendKeys("111111112");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickdoneename()));
		dp.clickdoneename().clear();
		dp.clickdoneename().sendKeys("Updated Automation Donee");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickdoneeadd()));
		dp.clickdoneeadd().clear();
		dp.clickdoneeadd().sendKeys("1111 Updated Street");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickdoneecity()));
		dp.clickdoneecity().clear();
		dp.clickdoneecity().sendKeys("Updated City");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickdoneesavebtn()));
		dp.clickdoneesavebtn().click();
		logger.info(" Donee editted successfully");
		test.log(LogStatus.INFO,"Donee editted successfully");
		}
		catch(Exception e) {
			logger.error("Error in  Edit DB Donee" + e);
			test.log(LogStatus.ERROR, "Error in Edit DB Donee");
		}
		
	}
	
	@Test(priority = 36)
	public void dbDeleteDonee() throws IOException, InterruptedException
	{
		try {
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		//WebElement frstRow = driver.findElement(By.xpath("//tr/td[text() = 'Test City Edited,CA']"));
		Actions act = new Actions(driver);
		act.moveToElement(dp.clickeditbtn()).moveToElement(dp.clickthreedots()).click().build().perform();
		//dp.clickthreedots().click();
		act.moveToElement(driver.findElement(By.cssSelector("#anchorDeleteButton"))).click().perform();
		//WebElement delbtn = driver.findElement(By.xpath("//*[@id='action-menu']/div[2]/ul/li/text())"));
		//dp.clickcitiesdeletebtn().click();
		//assertTrue(dp.clickcitiesdeltitle().getText().contains("Test City Edited,CA"));
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickcitiesdeletemodaldelbtn()));
		dp.clickcitiesdeletemodaldelbtn().click();
		logger.info(" Donee Deleted Successfully");
		test.log(LogStatus.INFO,"Donee Deleted Successfully");
		}
		catch(Exception e) {
			logger.error("Error in  Delete DB Donee" + e);
			test.log(LogStatus.ERROR, "Error in Delete DB Donee");
		}
	}
		
	
	@Test(priority = 37)
	public void dbaddBankRTN() throws IOException, InterruptedException
	{
		try {
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		dp.clickbankrtnslink().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickaddnewbtn()));
		dp.clickaddnewbtn().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickbankrtn()));
		dp.clickbankrtn().sendKeys("111111111");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickbankname()));
		dp.clickbankname().sendKeys("Automation Bank");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickbanksavebtn()));
		dp.clickbanksavebtn().click();
		logger.info(" Bank RTN added successfully");
		test.log(LogStatus.INFO,"Bank RTN added successfully");
	}
	catch(Exception e) {
		logger.error("Error in  Add DB Bank RTN" + e);
		test.log(LogStatus.ERROR, "Error in Add DB Bank RTN");
	}
	}
	
	@Test(priority = 38)
	public void dbeditBankRTN() throws IOException, InterruptedException
	{
		try {
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickeditbtn()));
		dp.clickeditbtn().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickbankrtn()));
		dp.clickbankrtn().clear();
		dp.clickbankrtn().sendKeys("111111112");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickbankname()));
		dp.clickbankname().clear();
		dp.clickbankname().sendKeys("Updated Bank");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickbanksavebtn()));
		dp.clickbanksavebtn().click();
		logger.info(" Bank RTN editted successfully");
		test.log(LogStatus.INFO,"Bank RTN editted successfully");
		}
		catch(Exception e) {
			logger.error("Error in  Edit DB Bank RTN" + e);
			test.log(LogStatus.ERROR, "Error in Edit DB Bank RTN");
		}
			
	}
	
	@Test(priority = 39)
	public void dbDeleteBankRTN() throws IOException, InterruptedException
	{
		try {
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		//WebElement frstRow = driver.findElement(By.xpath("//tr/td[text() = 'Test City Edited,CA']"));
		Actions act = new Actions(driver);
		act.moveToElement(dp.clickeditbtn()).moveToElement(dp.clickthreedots()).click().build().perform();
		//dp.clickthreedots().click();
		act.moveToElement(driver.findElement(By.cssSelector("#anchorDeleteButton"))).click().perform();
		//WebElement delbtn = driver.findElement(By.xpath("//*[@id='action-menu']/div[2]/ul/li/text())"));
		//dp.clickcitiesdeletebtn().click();
		//assertTrue(dp.clickcitiesdeltitle().getText().contains("Test City Edited,CA"));
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickcitiesdeletemodaldelbtn()));
		dp.clickcitiesdeletemodaldelbtn().click();
		logger.info("Bank RTN Deleted Successfully");
		test.log(LogStatus.INFO,"Bank RTN Deleted Successfully");
		}
		catch(Exception e) {
			logger.error("Error in  Delete DB Bank RTN" + e);
			test.log(LogStatus.ERROR, "Error in Delete DB Bank RTN");
		}
	}
		
	@Test(priority = 40)
	public void dbaddOccupations() throws IOException, InterruptedException
	{
		try {
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		dp.clickoccupationslink().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickaddnewbtn()));
		dp.clickaddnewbtn().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickoccupationname()));
		dp.clickoccupationname().sendKeys("Automation Occupation");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickoccupationaddbtn()));
		dp.clickoccupationaddbtn().click();
		logger.info("New Occupation added successfully");
		test.log(LogStatus.INFO,"New Occupation added successfully");
		}
		catch(Exception e) {
			logger.error("Error in  Add DB Occupations" + e);
			test.log(LogStatus.ERROR, "Error in Add DB Occupations");
		}
	 
	}
	
	@Test(priority = 41)
	public void dbeditOccupations() throws IOException, InterruptedException
	{
		try {
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickeditbtn()));
		dp.clickeditbtn().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickoccupationname()));
		dp.clickoccupationname().clear();
		dp.clickoccupationname().sendKeys("Automation Occupation");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickoccupationaddbtn()));
		dp.clickoccupationaddbtn().click();
		logger.info("Occupation  editted successfully");
		test.log(LogStatus.INFO,"Occupation  editted successfully");
		}
		catch(Exception e) {
			logger.error("Error in  Edit DB Occupations" + e);
			test.log(LogStatus.ERROR, "Error in Edit DB Occupations");
		}
	}	
	
	
	@Test(priority = 42)
	public void dbDeleteOccupations() throws IOException, InterruptedException
	{
		try {
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		//WebElement frstRow = driver.findElement(By.xpath("//tr/td[text() = 'Test City Edited,CA']"));
		Actions act = new Actions(driver);
		act.moveToElement(dp.clickeditbtn()).moveToElement(dp.clickthreedots()).click().build().perform();
		//dp.clickthreedots().click();
		act.moveToElement(driver.findElement(By.cssSelector("#anchorDeleteButton"))).click().perform();
		//WebElement delbtn = driver.findElement(By.xpath("//*[@id='action-menu']/div[2]/ul/li/text())"));
		//dp.clickcitiesdeletebtn().click();
		//assertTrue(dp.clickcitiesdeltitle().getText().contains("Test City Edited,CA"));
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickcitiesdeletemodaldelbtn()));
		dp.clickcitiesdeletemodaldelbtn().click();
		logger.info("Occupations Deleted Successfully");
		test.log(LogStatus.INFO,"Occupations Deleted Successfully");
	}
	catch(Exception e) {
		logger.error("Error in  Delete DB Occupations" + e);
		test.log(LogStatus.ERROR, "Error in Delete DB Occupations");
	}
	}
		
	@Test(priority = 43)
	public void dbaddEducationalInstitute() throws IOException, InterruptedException
	{
		try {
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		dp.clickeducationalinstitutionslink().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickaddnewbtn()));
		dp.clickaddnewbtn().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickedufederalein()));
		dp.clickedufederalein().sendKeys("111111111");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickeduinstitutionname()));
		dp.clickeduinstitutionname().sendKeys("Automation Institute");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickeduinstitutionadd()));
		dp.clickeduinstitutionadd().sendKeys("7577 automation rd");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickeducity()));
		dp.clickeducity().sendKeys("Tracy");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickeduCAstate()));
		dp.clickeduCAstate().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickeduzipcode()));
		dp.clickeduzipcode().sendKeys("95441");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickeduaddbtn()));
		dp.clickeduaddbtn().click();
		logger.info("New Educational Institution  added  successfully");
		test.log(LogStatus.INFO,"New Educational Institution  added  successfully");
		}
		catch(Exception e) {
			logger.error("Error in  Add DB Eduational Institute" + e);
			test.log(LogStatus.ERROR, "Error in Add DB Eduational Institute");
		}
	}
	
	@Test(priority = 44)
	public void dbeditEducationalInstitute() throws IOException, InterruptedException
	{
		try {
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickeditbtn()));
		dp.clickeditbtn().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickedufederalein()));
		dp.clickedufederalein().clear();
		dp.clickedufederalein().sendKeys("111111112");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickeduinstitutionname()));
		dp.clickeduinstitutionname().clear();
		dp.clickeduinstitutionname().sendKeys("Updated Institute");
		//dp.clickeduinstitutionadd().clear();
		//dp.clickeduinstitutionadd().sendKeys("7577 Updated rd");
		//dp.clickeducity().clear();
		//dp.clickeducity().sendKeys("Uptated Tracy");	
		//Wait.until(ExpectedConditions.elementToBeClickable(dp.clickeduaddbtn()));
		dp.clickeduaddbtn().click();
		logger.info("Educational Institution editted  successfully");
		test.log(LogStatus.INFO,"Educational Institution editted  successfully");
		}
		catch(Exception e) {
			logger.error("Error in  Edit DB Eduational Institute" + e);
			test.log(LogStatus.ERROR, "Error in Edit DB Eduational Institute");
		}
	}

	@Test(priority = 45)
	public void dbDeleteEducationalInstitute() throws IOException, InterruptedException
	{
		try {
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		//WebElement frstRow = driver.findElement(By.xpath("//tr/td[text() = 'Test City Edited,CA']"));
		Actions act = new Actions(driver);
		act.moveToElement(dp.clickeditbtn()).moveToElement(dp.clickthreedots()).click().build().perform();
		//dp.clickthreedots().click();
		act.moveToElement(driver.findElement(By.cssSelector("#anchorDeleteButton"))).click().perform();
		//WebElement delbtn = driver.findElement(By.xpath("//*[@id='action-menu']/div[2]/ul/li/text())"));
		//dp.clickcitiesdeletebtn().click();
		//assertTrue(dp.clickcitiesdeltitle().getText().contains("Test City Edited,CA"));
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickcitiesdeletemodaldelbtn()));
		dp.clickcitiesdeletemodaldelbtn().click();
		logger.info("Educational Institute Deleted Successfully");
		test.log(LogStatus.INFO,"Educational Institute Deleted Successfully");
		//Wait.until(ExpectedConditions.elementToBeClickable(dp.clickdatabaseclosebtn()));
		//dp.clickdatabaseclosebtn().click();
	}
	catch(Exception e) {
		logger.error("Error in  Delete DB Eduational Institute" + e);
		test.log(LogStatus.ERROR, "Error in Delete DB Eduational Institute");
	}
	}	
	@Test(priority = 46)
	public void dbadduserstatuscodes() throws IOException, InterruptedException
	{
		try {
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		dp.clickuserstatuscodeslink().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickaddnewbtn()));
		dp.clickaddnewbtn().click();
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickuserstatuscodestxtbx()));
		dp.clickuserstatuscodestxtbx().click();
		dp.clickuserstatuscodestxtbx().sendKeys("1111");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickuserstatusdesc()));
		dp.clickuserstatusdesc().click();
		dp.clickuserstatusdesc().sendKeys("Automation status desc");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickuserstatusaddbtn()));
		dp.clickuserstatusaddbtn().click();
		logger.info("User Status Codes added  successfully");
		test.log(LogStatus.INFO,"User Status Codes added  successfully");
		}
		catch(Exception e) {
			logger.error("Error in  Add DB User Status Codes" + e);
			test.log(LogStatus.ERROR, "Error in  Add DB User Status Codes");
		}
	}
	@Test(priority = 47)
	public void dbEdituserstatuscodes() throws IOException, InterruptedException
	{
		try {
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		//Wait.until(ExpectedConditions.elementToBeClickable(dp.clickeditbtn()));
		
		Thread.sleep(1000);
		dp.clickuserstatuseditlbtn().click();
		//Wait.until(ExpectedConditions.elementToBeClickable(dp.clickuserstatuscodestxtbx()));
		//Thread.sleep(1000);
		dp.clickuserstatuscodestxtbx().clear();
		dp.clickuserstatuscodestxtbx().sendKeys("11112");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickuserstatusdesc()));
		dp.clickuserstatusdesc().clear();
		dp.clickuserstatusdesc().sendKeys("Automation status desc Editted");
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickuserstatusaddbtn()));
		dp.clickuserstatusaddbtn().click();
		logger.info("User Status Codes editted  successfully");
		test.log(LogStatus.INFO,"User Status Codes editted  successfully");
		}
		catch(Exception e) {
			logger.error("Error in  Edit DB User Status Codes" + e);
			test.log(LogStatus.ERROR, "Error in  Edit DB User Status Codes");
		}
	}
	@Test(priority = 48)
	public void dbDeleteUserStatusCodes() throws IOException, InterruptedException
	{
		try {
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		//WebElement frstRow = driver.findElement(By.xpath("//tr/td[text() = 'Test City Edited,CA']"));
		Actions act = new Actions(driver);
		act.moveToElement(dp.clickeditbtn()).moveToElement(dp.clickthreedots()).click().build().perform();
		//dp.clickthreedots().click();
		act.moveToElement(driver.findElement(By.cssSelector("#anchorDeleteButton"))).click().perform();
		//WebElement delbtn = driver.findElement(By.xpath("//*[@id='action-menu']/div[2]/ul/li/text())"));
		//dp.clickcitiesdeletebtn().click();
		//assertTrue(dp.clickcitiesdeltitle().getText().contains("Test City Edited,CA"));
		Wait.until(ExpectedConditions.elementToBeClickable(dp.clickcitiesdeletemodaldelbtn()));
		dp.clickcitiesdeletemodaldelbtn().click();
		logger.info("User Status Code Deleted Successfully");
		test.log(LogStatus.INFO,"User Status Code Deleted Successfully");
		//Wait.until(ExpectedConditions.elementToBeClickable(dp.clickdatabaseclosebtn()));
		//dp.clickdatabaseclosebtn().click();
	}
	catch(Exception e) {
		logger.error("Error in  Delete DB User Status Code" + e);
		test.log(LogStatus.ERROR, "Error in Delete DB User Status Code");
	}
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
		//Wait.until(ExpectedConditions.elementToBeClickable(lp.clickLogin()));
		lp.clickLogin().click();
		logger.info("Username and Password success");
		OverviewpgPO op = new OverviewpgPO(driver);
		//Thread.sleep(1000);-----------------1st change
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.elementToBeClickable(lp.clicksecLogin()));
		Thread.sleep(2000);
		//Wait.until(ExpectedConditions.elementToBeClickable(lp.clicksecLogin()));
		lp.clicksecLogin().click();
		logger.info("clicked secLogin");
		//Wait.until(ExpectedConditions.elementToBeClickable(lp.clickmarkaspublic()));
		lp.clickmarkaspublic().click();
		logger.info("Clicked markaspublic");
		//Wait.until(ExpectedConditions.elementToBeClickable(lp.clickthrdcontbtn()));
		lp.clickthrdcontbtn().click();
		logger.info("clicked thirdcontbtn");
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
	
	@AfterClass
	public void teardown()
	{
	 logger.info("in tear down");
		driver.close();
		report.endTest(test);
		report.flush();
	} 
}

	