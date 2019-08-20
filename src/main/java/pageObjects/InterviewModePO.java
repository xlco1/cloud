package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InterviewModePO {
	
		public WebDriver driver;
		public InterviewModePO(WebDriver driver) {
			this.driver=driver;
		}

By interviewicon = By.id("interviewMode");//Interview mode icon on the top menu
By intvmarriedicon = By.id("icons8-one_ring");//Married icon in interv mode
By intvhadchldicon = By.id("Shape");//Had children icon in intv mode
By intvhadjobicon = By.id("icons8-new_job");//Had Job Icon in intv mode
By intviconpgNextbtn = By.id("Z005150");// Next btn in the Intrv icon page

//----------------------------Filing Status Page-------------------------------------------------------------
By intvMFJbox = By.id("003000");// Married Filling Jointly text box
By intvFSpgNextbtn = By.id("Z030290");//Next btn in Filing status pg

//------------------------Personal Information Page--------------------------------------------------------------
By intvTPfirstname = By.id("PNMA00");//Tax payer's first name txt box
By intvTPlastname = By.id("PNMC00");// Tax payer's last name
By intvTPdob = By.id("PDOB00");//TP's DOB field 
By intvTPoccupation = By.id("132200");//TP's occupation
By intvTPhomeph = By.id("HOME00");//TP's home phone number
								//-----Spouse's Personal Info-----
By intvSPfirstname = By.id("SNMA00");//Sp's first name
By intvSPlastname = By.id("SNMC00");//SP's last name
By intvSPdob = By.id("SDOB00");//SP's dob
By intvSPoccuaption = By.id("132700");//SP's occupation
By intvperinfopgNextbtn = By.id("Z0204745");// Next btn in Personal information page

//--------------------------------------Address Information----------------------------------------------------------------------
By intvusaddress = By.id("dadd00");// US add field
By intvcity = By.id("dcty00");// city field
By intvstate = By.id("dsta00");//state field
By intvzip = By.id("dzip00");//zip field
By intvlivedinUS = By.id("001000");// US citizen or lived in US  check
By intvaddinfopgNextbtn = By.id("Z021310");//Next button in Add Info page

//----------------------------------Additional personal Information--------------------------------------------------------------------------------
By intvadditionalperinfopgNextbtn = By.id("Z022455");// Next button 

//-----------------------------------Dependents and Others cared For----------------------------------------------
By intvyesdepstoclaim = By.id("001000");//Dependents to claim- Yes
By intvyeshomeorsupport = By.id("003000");// Provide home/support - Yes
By intvdepspgNextbtn = By.id("Z0401750");// Next button

//---------------------------------------Type Of Income ---------------------------------------------------------------------------
By intvaddTPW2frmbtn = By.id("Z0511100");// add Taxpayer Form btn- W2
By intvtypofincNextbtn = By.id("Z05118465");// next btn in Type of Income pg

//--------------------------------W2 Form---------------------------------------------------------------------------
By intvW2frmNextbtn = By.id("ZI011025");// Next button in W2 frm

//-------------------------------Adjustments/Deductions Interview-----------------------------------------------------------------------------
By intvadjustmentspgNextbtn = By.id("Z065125");// next button

//------------------------------------Credits Interview------------------------------------------------------------------------------------
By intvcreditspgNextbtn = By.id("Z07575");//Next button

//-------------------------------Health Care Coverage-------------------------------------------------------------------------
By intvhealthemployer = By.id("HCQ200");// By Employer in Health Care
By intvhealthpgNextbtn = By.id("Z080205");// Next button

//--------------------------------Other Misc Items------------------------------------------------------------------
By intvmiscpgNextbtn = By.id("Z095140");// next button

//--------------------------------State Returns-----------------------------------------------------------------------
By intvstateretpgNextbtn = By.id("Z100175");// Next button

//-----------------------------Filing Options-------------------------------------------------------------------------------
By intvRTfinprod = By.id("fldTog8140");// RT financial Product field
By intvfinishbtn = By.id("Z800585");//Finish button

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public WebElement clickinterviewicon()
{
	return driver.findElement(interviewicon);
}
public WebElement clickintvmarriedicon()
{
	return driver.findElement(intvmarriedicon);
}
public WebElement clickintvhadchldicon()
{
	return driver.findElement(intvhadchldicon);
}
public WebElement clickintvhadjobicon()
{
	return driver.findElement(intvhadjobicon);
}
public WebElement clickintviconpgNextbtn()
{
	return driver.findElement(intviconpgNextbtn);
}
//----------------------------------------------------Filling Status-------------------------------------------------------------------------------------------------------------
public WebElement clickintvMFJbox()
{
	return driver.findElement(intvMFJbox);
}
public WebElement clickintvFSpgNextbtn()
{
	return driver.findElement(intvFSpgNextbtn);
}
//-----------------------------------------------------Personal Information Page------------------------------------------------------------------------------------------------------
public WebElement clickintvTPfirstname()
{
	return driver.findElement(intvTPfirstname);
}
public WebElement clickintvTPlastname()
{
	return driver.findElement(intvTPlastname);
}
public WebElement clickintvTPdob()
{
	return driver.findElement(intvTPdob);
}
public WebElement clickintvTPoccupation()
{
	return driver.findElement(intvTPoccupation);
}
public WebElement clickintvTPhomeph()
{
	return driver.findElement(intvTPhomeph);
}
public WebElement clickintvSPfirstname()
{
	return driver.findElement(intvSPfirstname);
}
public WebElement clickintvSPlastname()
{
	return driver.findElement(intvSPlastname);
}
public WebElement clickintvSPdob()
{
	return driver.findElement(intvSPdob);
}
public WebElement clickintvSPoccupation()
{
	return driver.findElement(intvSPoccuaption);
}
public WebElement clickintvperinfopgNextbtn()
{
	return driver.findElement(intvperinfopgNextbtn);
}
//-------------------------------------------------------------Address Information-----------------------------------------------------------------------------------------------------
public WebElement clickintvusaddress()
{
	return driver.findElement(intvusaddress);
}
public WebElement clickintvcity()
{
	return driver.findElement(intvcity);
}
public WebElement clickintvstate()
{
	return driver.findElement(intvstate);
}
public WebElement clickintvzip()
{
	return driver.findElement(intvzip);
}
public WebElement clicklivedinUS()
{
	return driver.findElement(intvlivedinUS);
}
public WebElement clickaddinfopgNextbtn()
{
	return driver.findElement(intvaddinfopgNextbtn);
}
//-----------------------------------------------------------Additional personal information-----------------------------------------------------------------------------------------------------------------------------
public WebElement clickintvadditionalinfopgNextbtn()
{
	return driver.findElement(intvadditionalperinfopgNextbtn);
}
//------------------------------------------------------------Dependents--------------------------------------------------------------------------------------------------------------
public WebElement clickintvyesdepstoclaim()
{
	return driver.findElement(intvyesdepstoclaim);
}
public WebElement clickintvyeshomeorsupport()
{
	return driver.findElement(intvyeshomeorsupport);
}
public WebElement clickintvdepspgNextbtn()
{
	return driver.findElement(intvdepspgNextbtn);
}
//----------------------------------------------------------------------Type of Income---------------------------------------------------------------------------------------------
public WebElement clickintvaddTPW2frmbtn()
{
	return driver.findElement(intvaddTPW2frmbtn);
}
public WebElement clickintvtypofincNextbtn()
{
	return driver.findElement(intvtypofincNextbtn);
}
//---------------------------------------------------------------------W2 Form-----------------------------------------------------------------
public WebElement clickintvW2frmNextbtn()
{
	return driver.findElement(intvW2frmNextbtn);
}
//-------------------------------------------------------------------Adjustments/Deductions Interview----------------------------------------------------------------------------------------------------------
public WebElement clickintvadjustmentspgNextbtn()
{
	return driver.findElement(intvadjustmentspgNextbtn);
}
//----------------------------------------------------------------------------Credits-----------------------------------------------------------------------------------------------
public WebElement clickintvcreditspgNextbtn()
{
	return driver.findElement(intvcreditspgNextbtn);
}
//--------------------------------------------------------------------------Health care coverage---------------------------------------------------------------------------------------------------------------
public WebElement clickintvhealthemployer()
{
	return driver.findElement(intvhealthemployer);
}
public WebElement clickintvhealthpgNextbtn()
{
	return driver.findElement(intvhealthpgNextbtn);
}
//-------------------------------------------------------------------------Other Misc-------------------------------------------------------------------------------------------------------------
public WebElement clickintvmiscpgNextbtn()
{
	return driver.findElement(intvmiscpgNextbtn);
}
//-------------------------------------------------------------------------State Returns-------------------------------------------------------------------------------------------------------
public WebElement clickintvstateretpgNextbtn()
{
	return driver.findElement(intvstateretpgNextbtn);
}
//------------------------------------------------------------------------Filing Options-----------------------------------------------------------------------------------------------
public WebElement clickintvRTfinprod()
{
	return driver.findElement(intvRTfinprod);
}
public WebElement clickintvfinishbtn()
{
	return driver.findElement(intvfinishbtn);
}
}
