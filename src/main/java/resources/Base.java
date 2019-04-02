/**
 * 
 */
package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * @author ssreenivasan
 *
 */
public class Base {
	
	public WebDriver driver;
	public Properties prop;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public ExtentReports report;
	public ExtentTest test;
	public String filename;
	
	public WebDriver invokeBrowser() throws IOException
	{
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath +"/driver/chromedriver.exe");
		//to open incognito mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		//options.addArguments("--headless");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver=new ChromeDriver(capabilities);
		prop = new Properties();
		FileInputStream fs=new FileInputStream("C:\\Users\\ssreenivasan\\eclipse-workspace1\\Cloud-testing\\src\\main\\java\\resources\\data.properties");
		prop.load(fs);
		report = new ExtentReports(System.getProperty("user.dir") + "./reports/testExecutionReport.html",true);
				//new ExtentReports("AddareturnReport.html",true);//where to save the report//H:\\CLO\\
		test = report.startTest("Adding a New Tax Return");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO,"Browser Maximized");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public XSSFSheet getCellData()
	{
		try {
			//user.dir will give the current project path
		String projectpath = System.getProperty("user.dir");
		
		//change to / if moving the proj
		workbook = new XSSFWorkbook(projectpath + "\\excel\\addareturndata.xlsx");
		sheet = workbook.getSheet("Sheet1");
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return sheet;
	}
	
	public void AltplusCEFIN(WebElement efin)
	{
		efin.sendKeys(Keys.chord(Keys.ALT,"c"));
		driver.findElement(By.xpath("//td[text()='CLOUD TESTING CORP']")).click();
		driver.findElement(By.id("btnConfirmChoiceList")).click();
	}
	public void AltplusCzipcode(WebElement zip)
	{
		zip.sendKeys(Keys.chord(Keys.ALT,"c"));
		driver.findElement(By.xpath("//td[text()='95304']")).click();
		driver.findElement(By.id("btnConfirmChoiceList")).click();
	}
	public void AltplusCEmpName(WebElement name) throws InterruptedException
	{
		name.sendKeys(Keys.chord(Keys.ALT,"c"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("choiceListRow4")).click();
		//(By.xpath("//td[text()='MOURITECH']")).click();
		driver.findElement(By.id("btnConfirmChoiceList")).click();
		
	}
	public String TakeScreenshot()
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File ScreenShots = ts.getScreenshotAs(OutputType.FILE);
		try {
			filename = "./Screenshots/errorsSnapshot.png";
					//"H:\\CLO\\AddaReturnReport.png";
					//"C:\\CLOAutoSnaps\\verifyerror.png";
		
			FileUtils.copyFile(ScreenShots, new File(filename));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return filename;
		
	}
	
}
