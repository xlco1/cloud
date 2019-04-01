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
public class TaxreturnBarPO {
	
	public WebDriver driver;
	public TaxreturnBarPO(WebDriver driver) {
		this.driver=driver;
	}
	
	By verifyReturnbtn = By.id("verifyReturn");
	By interviewClientbtn = By.id("interviewClient");
	By btnSaveAndClose = By.id("btnSaveAndClose");
	By btnArrowOptions = By.id("btnOptionsHeaderBarForms");
	By btnsaveinarrow= By.xpath("//*[@id='menuItemSave']");
	By closeinverify = By.id("btnCloseErrorRejectModal");
	By printbtn = By.xpath("//img[@id='printClient']");
	By finalTaxReturnbtn = By.xpath("//ul/li[@id='final-return-print']");
	By printInVerifybtn = By.id("btnSubmitErrorRejectModal");
	By printFinalReturnbtn = By.id("btnPrint");
	
	
	public WebElement clkverifyReturnbtn()
	{
		return driver.findElement(verifyReturnbtn);
	}
	public WebElement clkinterviewClientbtn()
	{
		return driver.findElement(interviewClientbtn);
	}
	public WebElement clkbtnSaveAndClose()
	{
		return driver.findElement(btnSaveAndClose);
	}
	public WebElement clkbtnArrowOptions()
	{
		return driver.findElement(btnArrowOptions);
	}
	public WebElement clkbtnsaveinarrow()
	{
		return driver.findElement(btnsaveinarrow);
	}
	public WebElement clkcloseinverify()
	{
		return driver.findElement(closeinverify);
	}
	public WebElement clkprintbtn()
	{
		return driver.findElement(printbtn);
	}
	public WebElement clkfinalTaxReturnbtn()
	{
		return driver.findElement(finalTaxReturnbtn);
	}
	public WebElement clkprintInVerifybtn()
	{
		return driver.findElement(printInVerifybtn);
	}
	public WebElement clkprintFinalReturnbtn()
	{
		return driver.findElement(printFinalReturnbtn);
	}
	
}
