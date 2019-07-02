package clo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
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
	    lp.clickcontbtnIRS().click();
	    lp.clickcanceltour().click();
		Thread.sleep(2000);
	    op.clickoverview().click();
	    Thread.sleep(1000);
		AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);
		Thread.sleep(2000);
		ap.clickaccountsdropdown().click();
		Thread.sleep(1000);
		dp.clickdatabaselink().click();
		dp.clickcitieszipcodeslink().click();
		dp.clickaddnewbtn().click();
		dp.clickcitieszipcodetxtbox().sendKeys("12345");
		dp.clickcitiescitytxtbox().sendKeys("Test City");
		dp.clickcitiesstatecodetxtbox().sendKeys("CA");
		dp.clickcitiesaddbtn().click();
		//Thread.sleep(1000);
		//dp.clicksearchfield().sendKeys("12345");
		//WebElement testzip = driver.findElement(By.xpath("//tr/td[text() = '12345']"));
		//assertTrue(testzip.contains("12345"));
		System.out.println("New city added");
		logger.info("New city added");
		test.log(LogStatus.INFO,"New city added");
		}
	@Test(priority = 23)
	public void dbEditCity() throws IOException, InterruptedException
	{
		AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		dp.clickeditbtn().click();
		dp.clickcitieszipcodetxtbox().clear();
		dp.clickcitieszipcodetxtbox().sendKeys("12346");
		dp.clickcitiescitytxtbox().clear();
		dp.clickcitiescitytxtbox().sendKeys("Test City Edited");
		dp.clickcitiesaddbtn().click();
		System.out.println(" City Edited Sucessfully");
		logger.info("City Edited Sucessfully");
		test.log(LogStatus.INFO,"City Edited Sucessfully");
		
		}
	
	//@Test(priority = 24)
	public void dbDeleteCity() throws IOException, InterruptedException
	{
		AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		WebElement frstRow = driver.findElement(By.xpath("//tr/td[text() = '12346']"));
		Actions act = new Actions(driver);
		act.moveToElement(dp.clickeditbtn()).moveToElement(dp.clickthreedots()).click().build().perform();
		dp.clickthreedots().click();
		Thread.sleep(3000);
		WebElement delbtn = driver.findElement(By.xpath("//[@id='action-menu']/div[2]/ul/li"));
		delbtn.click();
		//dp.clickcitiesdeletebtn().click();
		//assertTrue(dp.clickcitiesdeltitle().getText().contains("Test City Edited,CA"));
		Thread.sleep(1000);
		dp.clickcitiesdeletemodaldelbtn().click();
		System.out.println("City Deleted Successfully");
		logger.info("City Deleted Successfully");
		test.log(LogStatus.INFO,"City Deleted Successfully");
	
	}
	
	@Test(priority = 25)
	public void dbaddEmployer() throws IOException, InterruptedException
	{
		AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		dp.clickemployerspayerslink().click();
		dp.clickaddnewbtn().click();
		dp.clickempfederaleintxtbx().sendKeys("111111111");
		dp.clickempnamecontroltxtbx().sendKeys("Test");
		dp.clickempcompanyname().sendKeys("Automation company");
		dp.clickempcompanyaddress().sendKeys("7575 Linne Rd");
		dp.clickempcitytxtbx().sendKeys("Tracy");
		dp.clickempstatetxtbx().click();
		dp.clickempCAstatetxtbx().click();
		dp.clickempzipcodetxtbx().sendKeys("95304");
		dp.clickempstate1identftxtbx().sendKeys("123456789");
		dp.clickempsavebtn().click();
		System.out.println(" New Employer added Successfully");
		logger.info("New Employer added Successfully");
		test.log(LogStatus.INFO,"New Employer added Successfully");
	}
	
	@Test(priority = 26)
	public void dbeditEmployer() throws IOException, InterruptedException
	{
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		dp.clickeditbtn().click();
		dp.clickempfederaleintxtbx().clear();
		dp.clickempfederaleintxtbx().sendKeys("111111112");
		dp.clickempnamecontroltxtbx().clear();
		dp.clickempnamecontroltxtbx().sendKeys("TestUpdated");
		dp.clickempcompanyname().clear();
		dp.clickempcompanyname().sendKeys("Automation company Update");
		dp.clickempcompanyaddress().clear();
		dp.clickempcompanyaddress().sendKeys("7576 Linne Rd");
		dp.clickempsavebtn().click();
		System.out.println(" New Employer Editted Successfully");
		logger.info("New Employer Editted Successfully");
		test.log(LogStatus.INFO,"New Employer Editted Successfully");
	}
	
	//@Test(priority = 27)
	public void dbDeleteEmployer() throws IOException, InterruptedException
	{
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		//WebElement frstRow = driver.findElement(By.xpath("//tr/td[text() = 'Test City Edited,CA']"));
		Actions act = new Actions(driver);
		act.moveToElement(dp.clickeditbtn()).moveToElement(dp.clickthreedots()).click().build().perform();
		//dp.clickthreedots().click();
		WebElement delbtn = driver.findElement(By.xpath("//*[@id='action-menu']/div[2]/ul/li/text())"));
		//dp.clickcitiesdeletebtn().click();
		assertTrue(dp.clickcitiesdeltitle().getText().contains("Test City Edited,CA"));
		Thread.sleep(1000);
		dp.clickcitiesdeletemodaldelbtn().click();
		System.out.println("Employer Deleted Successfully");
		logger.info("Employer Deleted Successfully");
		test.log(LogStatus.INFO,"Employer Deleted Successfully");
}
	
	@Test(priority = 28)
	public void dbaddCareProvider() throws IOException, InterruptedException
	{
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		dp.clickcareproviderslink().click();
		dp.clickaddnewbtn().click();
		dp.clickprovidercode().sendKeys("11111111");
		dp.clickprovidertype().sendKeys("Test type");
		dp.clickprovidernamecontrol().sendKeys("Proctrl");
		dp.clickcareprovidername().sendKeys("Test Careprovider");
		dp.clickprovideradd().sendKeys("128 Indigo dr");
		dp.clickprovidercity().sendKeys("Mountain House");
		dp.clickproviderstate().click();
		dp.clickproviderCAstate().click();
		dp.clickproviderzipcode().sendKeys("95391");
		dp.clickprovidersavebtn().click();
		System.out.println("New Care provider added successfully");
		logger.info("New Care provider added successfully");
		test.log(LogStatus.INFO,"New Care provider added successfully");
		}
	
	@Test(priority = 29)
	public void dbeditCareProvider() throws IOException, InterruptedException
	{
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		dp.clickeditbtn().click();
		dp.clickprovidercode().clear();
		dp.clickprovidercode().sendKeys("11111112");
		dp.clickcareprovidername().clear();
		dp.clickcareprovidername().sendKeys("NameUpdated Careprovider");
		dp.clickprovideradd().sendKeys("128 ritta dr");
		dp.clickprovidersavebtn().click();
		System.out.println("Care provider editted successfully");
		logger.info("Care provider editted successfully");
		test.log(LogStatus.INFO,"Care provider editted successfully");
	}
	
	//Test(priority = 30)
	public void dbDeleteCareProvider() throws IOException, InterruptedException
	{
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		//WebElement frstRow = driver.findElement(By.xpath("//tr/td[text() = 'Test City Edited,CA']"));
		Actions act = new Actions(driver);
		act.moveToElement(dp.clickeditbtn()).moveToElement(dp.clickthreedots()).click().build().perform();
		//dp.clickthreedots().click();
		WebElement delbtn = driver.findElement(By.xpath("//*[@id='action-menu']/div[2]/ul/li/text())"));
		//dp.clickcitiesdeletebtn().click();
		assertTrue(dp.clickcitiesdeltitle().getText().contains("Test City Edited,CA"));
		Thread.sleep(1000);
		dp.clickcitiesdeletemodaldelbtn().click();
		System.out.println("Care Provider Deleted Successfully");
		logger.info("Care Provider Deleted Successfully");
		test.log(LogStatus.INFO,"Care Provider Deleted Successfully");
	}
		
	@Test(priority = 31)
	public void dbaddReferrals() throws IOException, InterruptedException
	{
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		dp.clickreferralslink().click();
		dp.clickaddnewbtn().click();
		dp.clickreferralsname().sendKeys("12345");
		dp.clickreferralsaddbtn().click();
		System.out.println(" Refferrals added successfully");
		logger.info("Refferrals added successfully");
		test.log(LogStatus.INFO,"Refferrals added successfully");
	}
	
	@Test(priority = 32)
	public void dbeditReferrals() throws IOException, InterruptedException
	{
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		dp.clickeditbtn().click();
		dp.clickreferralsname().clear();
		dp.clickreferralsname().sendKeys("Refferals Updated");
		dp.clickreferralsaddbtn().click();
		System.out.println(" Refferrals editted successfully");
		logger.info(" Refferrals editted successfully");
		test.log(LogStatus.INFO,"Refferrals editted successfully");
	}
	
	//Test(priority = 33)
	public void dbDeleteReferrals() throws IOException, InterruptedException
	{
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		//WebElement frstRow = driver.findElement(By.xpath("//tr/td[text() = 'Test City Edited,CA']"));
		Actions act = new Actions(driver);
		act.moveToElement(dp.clickeditbtn()).moveToElement(dp.clickthreedots()).click().build().perform();
		//dp.clickthreedots().click();
		WebElement delbtn = driver.findElement(By.xpath("//*[@id='action-menu']/div[2]/ul/li/text())"));
		//dp.clickcitiesdeletebtn().click();
		assertTrue(dp.clickcitiesdeltitle().getText().contains("Test City Edited,CA"));
		Thread.sleep(1000);
		dp.clickcitiesdeletemodaldelbtn().click();
		System.out.println("Referrals Deleted Successfully");
		logger.info(" Referrals Deleted Successfully");
		test.log(LogStatus.INFO,"Referrals Deleted Successfully");
	}
		
	
	@Test(priority = 34)
	public void dbaddDonee() throws IOException, InterruptedException
	{
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		dp.clickdoneelink().click();
		dp.clickaddnewbtn().click();
		dp.clickdoneeein().sendKeys("11111111");
		dp.clickdoneename().sendKeys("Automation Donee");
		dp.clickdoneeadd().sendKeys("1111 Test Street");
		dp.clickdoneecity().sendKeys("Test City");
		dp.clickdoneestate().click();
		dp.clickdoneeCAstate().click();
		dp.clickdoneezipcode().sendKeys("91119");
		dp.clickdoneesavebtn().click();
		System.out.println(" Donee added successfully");
		logger.info(" Donee added successfully");
		test.log(LogStatus.INFO,"Donee added successfully");
	}
	
	@Test(priority = 35)
	public void dbeditDonee() throws IOException, InterruptedException
	{
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		dp.clickeditbtn().click();
		dp.clickdoneeein().clear();
		dp.clickdoneeein().sendKeys("111111112");
		dp.clickdoneename().clear();
		dp.clickdoneename().sendKeys("Updated Automation Donee");
		dp.clickdoneeadd().clear();
		dp.clickdoneeadd().sendKeys("1111 Updated Street");
		dp.clickdoneecity().clear();
		dp.clickdoneecity().sendKeys("Updated City");
		dp.clickdoneesavebtn().click();
		System.out.println(" Donee editted successfully");
		logger.info(" Donee editted successfully");
		test.log(LogStatus.INFO,"Donee editted successfully");
		
	}
	
	//Test(priority = 36)
	public void dbDeleteDonee() throws IOException, InterruptedException
	{
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		//WebElement frstRow = driver.findElement(By.xpath("//tr/td[text() = 'Test City Edited,CA']"));
		Actions act = new Actions(driver);
		act.moveToElement(dp.clickeditbtn()).moveToElement(dp.clickthreedots()).click().build().perform();
		//dp.clickthreedots().click();
		WebElement delbtn = driver.findElement(By.xpath("//*[@id='action-menu']/div[2]/ul/li/text())"));
		//dp.clickcitiesdeletebtn().click();
		assertTrue(dp.clickcitiesdeltitle().getText().contains("Test City Edited,CA"));
		Thread.sleep(1000);
		dp.clickcitiesdeletemodaldelbtn().click();
		System.out.println("Donee Deleted Successfully");
		logger.info(" Donee Deleted Successfully");
		test.log(LogStatus.INFO,"Donee Deleted Successfully");
	}
		
	
	@Test(priority = 37)
	public void dbaddBankRTN() throws IOException, InterruptedException
	{
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		dp.clickbankrtnslink().click();
		dp.clickaddnewbtn().click();
		dp.clickbankrtn().sendKeys("111111111");
		dp.clickbankname().sendKeys("Automation Bank");
		dp.clickbanksavebtn().click();
		System.out.println("Bank RTN added successfully");
		logger.info(" Bank RTN added successfully");
		test.log(LogStatus.INFO,"Bank RTN added successfully");
	}
	
	@Test(priority = 38)
	public void dbeditBankRTN() throws IOException, InterruptedException
	{
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		dp.clickeditbtn().click();
		dp.clickbankrtn().clear();
		dp.clickbankrtn().sendKeys("111111112");
		dp.clickbankname().clear();
		dp.clickbankname().sendKeys("Updated Bank");
		dp.clickbanksavebtn().click();
		System.out.println("Bank RTN editted successfully");
		logger.info(" Bank RTN editted successfully");
		test.log(LogStatus.INFO,"Bank RTN editted successfully");
			
	}
	
	//Test(priority = 39)
	public void dbDeleteBankRTN() throws IOException, InterruptedException
	{
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		//WebElement frstRow = driver.findElement(By.xpath("//tr/td[text() = 'Test City Edited,CA']"));
		Actions act = new Actions(driver);
		act.moveToElement(dp.clickeditbtn()).moveToElement(dp.clickthreedots()).click().build().perform();
		//dp.clickthreedots().click();
		WebElement delbtn = driver.findElement(By.xpath("//*[@id='action-menu']/div[2]/ul/li/text())"));
		//dp.clickcitiesdeletebtn().click();
		assertTrue(dp.clickcitiesdeltitle().getText().contains("Test City Edited,CA"));
		Thread.sleep(1000);
		dp.clickcitiesdeletemodaldelbtn().click();
		System.out.println("Bank RTN Deleted Successfully");
		logger.info("Bank RTN Deleted Successfully");
		test.log(LogStatus.INFO,"Bank RTN Deleted Successfully");
	}
		
	@Test(priority = 40)
	public void dbaddOccupations() throws IOException, InterruptedException
	{
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		dp.clickoccupationslink().click();
		dp.clickaddnewbtn().click();
		dp.clickoccupationname().sendKeys("Automation Occupation");
		dp.clickoccupationaddbtn().click();
		System.out.println("New Occupation added successfully");
		logger.info("New Occupation added successfully");
		test.log(LogStatus.INFO,"New Occupation added successfully");
	 
	}
	
	@Test(priority = 41)
	public void dbeditOccupations() throws IOException, InterruptedException
	{
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		dp.clickeditbtn().click();
		dp.clickoccupationname().clear();
		dp.clickoccupationname().sendKeys("Automation Occupation");
		dp.clickoccupationaddbtn().click();
		System.out.println("Occupation  editted successfully");
		logger.info("Occupation  editted successfully");
		test.log(LogStatus.INFO,"Occupation  editted successfully");
	}	
	
	
	//Test(priority = 42)
	public void dbDeleteOccupations() throws IOException, InterruptedException
	{
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		//WebElement frstRow = driver.findElement(By.xpath("//tr/td[text() = 'Test City Edited,CA']"));
		Actions act = new Actions(driver);
		act.moveToElement(dp.clickeditbtn()).moveToElement(dp.clickthreedots()).click().build().perform();
		//dp.clickthreedots().click();
		WebElement delbtn = driver.findElement(By.xpath("//*[@id='action-menu']/div[2]/ul/li/text())"));
		//dp.clickcitiesdeletebtn().click();
		assertTrue(dp.clickcitiesdeltitle().getText().contains("Test City Edited,CA"));
		Thread.sleep(1000);
		dp.clickcitiesdeletemodaldelbtn().click();
		System.out.println("Occupations Deleted Successfully");
		logger.info("Occupations Deleted Successfully");
		test.log(LogStatus.INFO,"Occupations Deleted Successfully");
	}
		
	@Test(priority = 43)
	public void dbaddEducationalInstitute() throws IOException, InterruptedException
	{
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		dp.clickeducationalinstitutionslink().click();
		dp.clickaddnewbtn().click();
		dp.clickedufederalein().sendKeys("111111111");
		dp.clickeduinstitutionname().sendKeys("Automation Institute");
		dp.clickeduinstitutionadd().sendKeys("7577 atutomation rd");
		dp.clickeducity().sendKeys("Tracy");
		dp.clickeduCAstate().click();
		dp.clickeduzipcode().sendKeys("95441");
		dp.clickeduaddbtn().click();
		System.out.println("New Educational Institution  added  successfully");
		logger.info("New Educational Institution  added  successfully");
		test.log(LogStatus.INFO,"New Educational Institution  added  successfully");
	}
	
	@Test(priority = 44)
	public void dbeditEducationalInstitute() throws IOException, InterruptedException
	{
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		dp.clickeditbtn().click();
		dp.clickedufederalein().clear();
		dp.clickedufederalein().sendKeys("111111112");
		dp.clickeduinstitutionname().clear();
		dp.clickeduinstitutionname().sendKeys("Updated Institute");
		//dp.clickeduinstitutionadd().clear();
		//dp.clickeduinstitutionadd().sendKeys("7577 Updated rd");
		//dp.clickeducity().clear();
		//dp.clickeducity().sendKeys("Uptated Tracy");	
		dp.clickeduaddbtn().click();
		System.out.println(" Educational Institution editted  successfully");
		logger.info("Educational Institution editted  successfully");
		test.log(LogStatus.INFO,"Educational Institution editted  successfully");
	}

	//Test(priority = 45)
	public void dbDeleteEducationalInstitute() throws IOException, InterruptedException
	{
		//AccountSettingsPO ap = new AccountSettingsPO(driver);
		DatabaseSettingsPO dp = new DatabaseSettingsPO(driver);	
		Thread.sleep(1000);
		//WebElement frstRow = driver.findElement(By.xpath("//tr/td[text() = 'Test City Edited,CA']"));
		Actions act = new Actions(driver);
		act.moveToElement(dp.clickeditbtn()).moveToElement(dp.clickthreedots()).click().build().perform();
		//dp.clickthreedots().click();
		WebElement delbtn = driver.findElement(By.xpath("//*[@id='action-menu']/div[2]/ul/li/text())"));
		//dp.clickcitiesdeletebtn().click();
		assertTrue(dp.clickcitiesdeltitle().getText().contains("Test City Edited,CA"));
		Thread.sleep(1000);
		dp.clickcitiesdeletemodaldelbtn().click();
		System.out.println("Educational Institute Deleted Successfully");
		logger.info("Educational Institute Deleted Successfully");
		test.log(LogStatus.INFO,"Educational Institute Deleted Successfully");
		dp.clickdatabaseclosebtn().click();
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
	