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
public class OverviewpgPO {
	
	public WebDriver driver;
	public OverviewpgPO(WebDriver driver) {
		this.driver=driver;
	}
	By overviewtab = By.id("spnTitleTab0");
	By officestab = By.id("spnTitleTab2");
	By viewbtn = By.xpath("//button[@id='btnViewOfficeList3']");
	By preparersbtn = By.xpath("//div/span[@id='spnTitleTab1']");
	By Viewprepbtn = By.id("btnViewPreparerLoginID422");
			//("//button[@id='btnViewPreparerLoginID5055']");
	By Newprepbtn = By.id("btnAddPreparerPreparers");
	By taxreturnsbtn = By.xpath("//div/span[@id='spnTitleTab1']");
	By Newtaxreturnbtn = By.xpath("//button[@id='addReturnButton']");
	By Profiletitlebar = By.id("spnAccountProfileTitleBar");
	By Setupofficebtn = By.xpath("//div[contains(text(),'Setup (first office)')]");
	By Newpreparerbtn = By.xpath("//button[@id='btnNewPreparerManagerOverview']");
	//-------------------------------
	By onetaxretrn = By.id("btnOpenTaxReturnTRList9");
	By continueinataxrtn = By.id("btnContinueReturnProfile");
	//-------------------------------
	public WebElement clickoverview()
	{
		return driver.findElement(overviewtab);
	}
	public WebElement clickoffices()
	{
		return driver.findElement(officestab);
	}
	public WebElement clickviewbtn()
	{
		return driver.findElement(viewbtn);
	}
	public WebElement clickpreparersbtn()
	{
		return driver.findElement(preparersbtn);
	}
	public WebElement clickviewprepbtn()
	{
		return driver.findElement(Viewprepbtn);
	}
	public WebElement clickNewprepbtn()
	{
		return driver.findElement(Newprepbtn);
	}
	public WebElement clickTaxreturns()
	{
		return driver.findElement(taxreturnsbtn);
	}
	public WebElement clickNewTaxreturnsbtn()
	{
		return driver.findElement(Newtaxreturnbtn);
	}
	public WebElement clickProfiletitlebar()
	{
		return driver.findElement(Profiletitlebar);
	}
	public WebElement clickSetupofficebtn()
	{
		return driver.findElement(Setupofficebtn);
	}
	public WebElement clickNewpreparerbtn()
	{
		return driver.findElement(Newpreparerbtn);
	}
	//-------------------------------
	public WebElement clickonetaxretrn()
	{
		return driver.findElement(onetaxretrn);
	}
	public WebElement clickcontinueinataxrtn()
	{
		return driver.findElement(continueinataxrtn);
	}
	//-----------------------------------

}
