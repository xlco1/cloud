/**
 * 
 */
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author ssreenivasan
 *changed all ids
 */
public class FRM8879PO {
	
	public WebDriver driver;
	public FRM8879PO(WebDriver driver) {
		this.driver=driver;
	}
	
	By Refndtype = By.xpath(" //input[@id='RALF00']");
			//By.id("RALF");
	
	By taxpayerspin = By.id("0035");
	By EROpin = By.id("EROP00");
	By PTIN = By.id("ptin00");
	By prepname = By.id("ORIG00");
	By prepaddress = By.id("OADD00");
	By prepcity = By.id("OCIT00");
	By prepstate = By.id("OSTA00");
	By prepzip = By.id("OZIP00");
	By prepph = By.id("OTEL00");
	By preptype = By.id("SELF00");
	By taxpin = By.id("003500");
	
	public WebElement getRefndtype()
	{
		return driver.findElement(Refndtype);
	}
	public WebElement getEROpin()
	{
		return driver.findElement(EROpin);
	}
	public WebElement getPTIN()
	{
		return driver.findElement(PTIN);
	}
	public WebElement getprepname()
	{
		return driver.findElement(prepname);
	}
	public WebElement getprepaddress()
	{
		return driver.findElement(prepaddress);
	}
	public WebElement getprepcity()
	{
		return driver.findElement(prepcity);
	}
	public WebElement getprepstate()
	{
		return driver.findElement(prepstate);
	}
	public WebElement getprepzip()
	{
		return driver.findElement(prepzip);
	}
	public WebElement getprepph()
	{
		return driver.findElement(prepph);
	}
	public WebElement getpreptype()
	{
		return driver.findElement(preptype);
	}
	public WebElement gettaxpin()
	{
		return driver.findElement(taxpin);
	}
	
	
	
	
	
	
	
	
}
