/**
 * 
 */
package clo;


import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import pageObjects.AddaReturnpgCDSPO;
import pageObjects.FRM8879PO;
import pageObjects.FRMW2PO;
import pageObjects.LogincloPO;
import pageObjects.OverviewpgPO;
import pageObjects.TaxreturnBarPO;
import pageObjects.addaforminaReturnPO;
import resources.Base;

/**
 * @author ssreenivasan
 *
 */
public class AddaNewReturn extends Base {
	
	public WebDriver driver;
	Logger logger= LogManager.getLogger(getClass());
	
	
	@Test(priority=1)
	
	public void addareturn() throws IOException, InterruptedException	
	{
	OverviewpgPO op=new OverviewpgPO(driver);
	op.clickoffices().click();
	logger.info("Clicked Offices");
	test.log(LogStatus.INFO,"Clicked Offices");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	op.clickviewbtn().click();
 	logger.info("Opening a Office");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	op.clickpreparersbtn().click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	op.clickviewprepbtn().click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	op.clickTaxreturns().click();
	//---------------------------delete later
	/*op.clickonetaxretrn().click();
	op.clickcontinueinataxrtn().click();
	Thread.sleep(1000);*/
	//---------------------------------
	/*##############op.clickNewTaxreturnsbtn().click();
	AddaReturnpgCDSPO ap = new AddaReturnpgCDSPO(driver);
	sheet = getCellData();
	String ssn = String.valueOf(sheet.getRow(0).getCell(1).getNumericCellValue());
	ap.getssn().sendKeys(ssn);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ap.getconfirmssn().sendKeys(ssn);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ap.clkaddbtn().click();
	test.log(LogStatus.INFO,"Entered SSN");
	logger.info("SSN taken");
	logger.info("New Taxreturn Opened");
	AltplusCEFIN(ap.getEfin());
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ap.getdob().sendKeys(new DataFormatter().formatCellValue(sheet.getRow(3).getCell(1)));
	//WebDriverWait wait = new WebDriverWait(driver,10);
	//String text =  ap.getdob().getText();
	//wait.until(ExpectedConditions.
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	test.log(LogStatus.INFO,"Entering CDS info");
	ap.getfirstname().sendKeys(new DataFormatter().formatCellValue(sheet.getRow(4).getCell(1)));
	Thread.sleep(1000);
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ap.getlastname().sendKeys(new DataFormatter().formatCellValue(sheet.getRow(5).getCell(1)));
	Thread.sleep(1000);
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ap.getoccup().sendKeys(String.valueOf(new DataFormatter().formatCellValue(sheet.getRow(6).getCell(1))));
	Thread.sleep(1000);
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ap.getcellph().sendKeys(String.valueOf(new DataFormatter().formatCellValue(sheet.getRow(7).getCell(1))));
	Thread.sleep(1000);
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ap.getfilingstatus().sendKeys(new DataFormatter().formatCellValue(sheet.getRow(8).getCell(1)));
	ap.getusaddress().sendKeys(new DataFormatter().formatCellValue(sheet.getRow(9).getCell(1)));
	AltplusCzipcode(ap.getzip());
	ap.gethealthinsA().sendKeys("x");
	ap.clickaddaform().click();
	addaforminaReturnPO fm = new addaforminaReturnPO(driver);
	fm.clkfrmw2().click();
	fm.clkAddbtnAddanewform().click();
	logger.info("Added w2 form");
	test.log(LogStatus.INFO,"w2 form added");
	FRMW2PO w2=new FRMW2PO(driver);
	w2.getwages().sendKeys(new DataFormatter().formatCellValue(sheet.getRow(13).getCell(1)));
	w2.getFedtax().sendKeys(new DataFormatter().formatCellValue(sheet.getRow(14).getCell(1)));
	w2.getein().sendKeys(String.valueOf(new DataFormatter().formatCellValue(sheet.getRow(15).getCell(1))));
	w2.getEmployername().clear();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	AltplusCEmpName(w2.getEmployername());
	ap.clickaddaform().click();
	fm.clkfrm8879().click();
	fm.clkAddbtnAddanewform().click();
	logger.info("8879 form added");
	test.log(LogStatus.INFO,"8879 form added");
	FRM8879PO f879 = new FRM8879PO(driver);
	f879.getRefndtype().sendKeys(new DataFormatter().formatCellValue(sheet.getRow(21).getCell(1)));
	f879.getEROpin().sendKeys(new DataFormatter().formatCellValue(sheet.getRow(22).getCell(1)));
	f879.getPTIN().sendKeys(new DataFormatter().formatCellValue(sheet.getRow(23).getCell(1)));
	f879.getprepname().sendKeys(new DataFormatter().formatCellValue(sheet.getRow(24).getCell(1)));
	f879.getprepaddress().sendKeys(new DataFormatter().formatCellValue(sheet.getRow(25).getCell(1)));
	f879.getprepcity().sendKeys(new DataFormatter().formatCellValue(sheet.getRow(26).getCell(1)));
	f879.getprepstate().sendKeys(new DataFormatter().formatCellValue(sheet.getRow(27).getCell(1)));
	f879.getprepzip().sendKeys(new DataFormatter().formatCellValue(sheet.getRow(28).getCell(1)));
	f879.getpreptype().sendKeys(new DataFormatter().formatCellValue(sheet.getRow(29).getCell(1)));
	f879.gettaxpin().sendKeys(new DataFormatter().formatCellValue(sheet.getRow(30).getCell(1)));
	TaxreturnBarPO tb = new TaxreturnBarPO(driver);
	tb.clkverifyReturnbtn().click();
	Thread.sleep(1000);
	String path = TakeScreenshot();
	String imagePath = test.addScreenCapture(path);
	test.log(LogStatus.PASS,"Took screen shot",imagePath);
	logger.info("screen shot taken");
	tb.clkcloseinverify().click();
	//Thread.sleep(1000);
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//tb.clkprintbtn().click();
	//TaxreturnBarPO tb = new TaxreturnBarPO(driver);//-------change later
	tb.clkprintbtn().click();
	logger.info("1");
	Thread.sleep(1000);
	tb.clkfinalTaxReturnbtn().click();
	logger.info("2");
	Thread.sleep(1000);
	tb.clkprintInVerifybtn().click();
	logger.info("3");
	Thread.sleep(1000);
	tb.clkprintFinalReturnbtn().click();
	logger.info("4");
	Thread.sleep(1000);
	logger.info("clicked print final return btn");
	ChromeOptions options = new ChromeOptions();
	
	options.addArguments("--kiosk-printing");
	logger.info("kiosk printing");
	//Thread.sleep(1000);
	tb.clkbtnSaveAndClose().click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Thread.sleep(1000);//dont remove this------------------1st change
	logger.info("Created a New tax return");#############*/
	test.log(LogStatus.INFO,"New Tax Return created");
	}
	
	@Parameters("env")
	@BeforeTest
	public void login(String env) throws IOException
	{
		System.out.println(env);
		driver= invokeBrowser();
		LogincloPO lp = new LogincloPO(driver);
		if(env.equalsIgnoreCase("qa"))
		{
		driver.get("https://qa.crosslinkonline.com/#");
		System.out.println("inside if loop qa");
		lp.getusername().sendKeys(prop.getProperty("username"));
		lp.getPassword().sendKeys(prop.getProperty("password"));
		}
		else if(env.equalsIgnoreCase("dev"))
		{
			driver.get("https://dev.crosslinkonline.com/#");
			System.out.println("inside else loop dev");
			lp.getusername().sendKeys(prop.getProperty("devusername"));
			lp.getPassword().sendKeys(prop.getProperty("devpassword"));
		}
		logger.info("URL open-Success");
		
	/*	lp.getusername().sendKeys(prop.getProperty("username"));
		lp.getPassword().sendKeys(prop.getProperty("password"));*/
		lp.clickLogin().click();
		logger.info("Username and Password success");
		lp.clicksecLogin().click();
		lp.clickmarkaspublic().click();
		lp.clickthrdcontbtn().click();
		lp.clickcontbtnIRS().click();
		lp.clickcanceltour().click();
		logger.info("In OverView Page");
		
	}
	/*@DataProvider(name = "URL")
	public static Object[][] urlname()
	{
	return new Object[][] {{"url1"},{"url2"}};
	}*/
	
	@AfterClass
	public void teardown()
	{
	 logger.info("in tear down");
		driver.close();
		report.endTest(test);
		report.flush();
	}
	
	/*@Test(priority=2)
	public void testPrint()
	{
		//tb.clkbtnSaveAndClose().click();
		logger.info("in test priority");
		
	}
	*/
	
}
