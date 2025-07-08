package com.Capium.Actions;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import com.Capium.Locators.Capium_Boookeeeping_Clientdashboard_Locators;
import com.Capium.Utilies.HelperClass;

public class Capium_Bookkeeping_Clientdashboard_Actions {

	
	Capium_Boookeeeping_Clientdashboard_Locators clientdashboardlocators = null;

	public Capium_Bookkeeping_Clientdashboard_Actions() {
		this.clientdashboardlocators = new Capium_Boookeeeping_Clientdashboard_Locators();
		PageFactory.initElements(HelperClass.getDriver(), clientdashboardlocators);
	}

public void Selectandclickonclientname() throws InterruptedException {
	
	HelperClass.Searchclient("Test Client", By.xpath("(//a[@class='azure'])[1]"));
	
}
public void VerifytheClientdashboard() {
	
	String actualtext = HelperClass.getText(By.xpath("//h1[text()='Dashboard']"));
	String expected = "Dashboard";

	if (actualtext == expected) {

		System.out.println("Dashboard verified");
	} else {
		System.out.println("Not Matched");
	}	
}
public void Clickonsalesbuttonandverify() throws InterruptedException {
	
	HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSales']"));
	
	Thread.sleep(2000);
	
	String actualtext = HelperClass.getText(By.xpath("//h1[text()='Create New Invoice']"));
	String expected = "Create New Invoice";

	if (actualtext == expected) {

		System.out.println("Create New Invoice page verified");
	} else {
		System.out.println("Not Matched");
	}	
}
public void Clickoncustomerbuttonandverify() throws InterruptedException {
	
HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[@class='btn btn-azure btn-sm'])[4]"));
	
	Thread.sleep(2000);
	
	String actualtext = HelperClass.getText(By.xpath("//a[@data-type='customer']"));
	String expected = "customer";

	if (actualtext == expected) {

		System.out.println("customer page verified");
	} else {
		System.out.println("Not Matched");
	}	
}

public void Clickonquotebuttonandverify() throws InterruptedException {
	
HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[@class='btn btn-azure btn-sm'])[5]"));
	
	Thread.sleep(2000);
	
	String actualtext = HelperClass.getText(By.xpath("//h1[text()='Create New Quotation']"));
	String expected = "Create New Quotation";

	if (actualtext == expected) {

		System.out.println("Create New Quotation page verified");
	} else {
		System.out.println("Not Matched");
	}	
}
public void Clickonpurchasebuttonandverify() throws InterruptedException {
	
HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[@class='btn btn-azure btn-sm'])[6]"));
	
	Thread.sleep(2000);
	
	String actualtext = HelperClass.getText(By.xpath("//h1[text()='Create New Purchase']"));
	String expected = "Create New Purchase";

	if (actualtext == expected) {

		System.out.println("Create New Purchase page verified");
	} else {
		System.out.println("Not Matched");
	}	
}
public void Clickonsupplierbuttonandverify() throws InterruptedException {
	
HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//a[@class='btn btn-azure btn-sm'])[7]"));
	
	Thread.sleep(2000);
	
	String actualtext = HelperClass.getText(By.xpath("//a[@data-type='supplier']"));
	String expected = "Supplier";

	if (actualtext == expected) {

		System.out.println("Supplier page verified");
	} else {
		System.out.println("Not Matched");
	}	
}
	public void VerifyDebtorsCreditorsChartandtakescreenshot() throws IOException {
		

		String actualtext = HelperClass.getText(By.xpath("//span[text()='Debtors/Creditors Chart']"));
		String expected = "Debtors/Creditors Chart";

		if (actualtext == expected) {

			System.out.println("Debtors/Creditors Chart page verified");
		} else {
			System.out.println("Not Matched");
		}		
		
		HelperClass.captureScreenshot("Debtors/Creditors Chart page verified");
}
	public void VerifySalesPurchaseChartandtakescreenshot() throws IOException {
		
		
		String actualtext = HelperClass.getText(By.xpath("(//span[@class='widget-caption'])[5]"));
		String expected = "Sales/Purchase Chart";

		if (actualtext == expected) {

			System.out.println("Sales/Purchase Chart page verified");
		} else {
			System.out.println("Not Matched");
		}		
		
		HelperClass.captureScreenshot("Sales/Purchase Chart page verified");
	}
	
	public void VerifyInvoiceAgeingSummaryandtakescreenshot() throws IOException {
		
		
		String actualtext = HelperClass.getText(By.xpath("//span[text()='Invoice Ageing Summary']"));
		String expected = "Invoice Ageing Summary";

		if (actualtext == expected) {

			System.out.println("Invoice Ageing Summary page verified");
		} else {
			System.out.println("Not Matched");
		}		
		
		HelperClass.captureScreenshot("Invoice Ageing Summary page verified");
		
	}
	
	public void Clickoneditclientchangetheadrees1andverify() throws InterruptedException {
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-edit themeprimary']"));
		
		HelperClass.sendKeys(By.xpath("//input[@name='Address1']"), "Hitechpaerl, Hyderabad");
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//button[text()='Save']"));
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-check']"));
		
		Thread.sleep(2000);
		
		String actualtext = HelperClass.getText(By.xpath("//label[text()='Hitechpaerl, Hyderabad']"));
		String expected = "Hitechpaerl, Hyderabad";

		if (actualtext == expected) {

			System.out.println("Hitechpaerl, Hyderabad adress1 verified");
		} else {
			System.out.println("Not Matched");
		}		
	}
	
	public void Clickonaddbankbuttonandverify() throws InterruptedException {
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@class='pull-left btn btn-azure btn-sm']"));
		
        Thread.sleep(2000);
		
		String actualtext = HelperClass.getText(By.xpath("//h1[text()='Bank Dashboard']"));
		String expected = "Bank Dashboard";

		if (actualtext == expected) {

			System.out.println("Bank Dashboard page verified");
		} else {
			System.out.println("Not Matched");
		}		
		
	}
	public void VerifyCurrentDebtorsListandtakescreenshot() throws IOException {
		
		String actualtext = HelperClass.getText(By.xpath("//span[text()='Current Debtors List']"));
		String expected = "Current Debtors List";

		if (actualtext == expected) {

			System.out.println("Current Debtors List page verified");
		} else {
			System.out.println("Not Matched");
		}		
		HelperClass.captureScreenshot("Current Debtors List Captured");
		
	}
	public void VerifyRecentSalesListandtakescreenshot() throws IOException {
		
		String actualtext = HelperClass.getText(By.xpath("//span[text()='Recent Sales List']"));
		String expected = "Recent Sales List";

		if (actualtext == expected) {

			System.out.println("Recent Sales List page verified");
		} else {
			System.out.println("Not Matched");
		}		
		HelperClass.captureScreenshot("Recent Sales List Captured");
	
	}
	
	public void Verifyeditdashboardbuttonandtakescreenshot() throws InterruptedException, IOException {
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()='Edit Dashboard']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection1']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection2']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection3']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection4']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection5']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection6']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection7']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection8']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection9']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection10']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection11']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection12']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection13']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection14']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection15']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection16']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection17']"));
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='btnSaveSection']"));
		
		HelperClass.captureScreenshot("client dashboard hidden verified");
		

		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()='Edit Dashboard']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection1']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection2']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection3']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection4']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection5']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection6']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection7']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection8']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection9']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection10']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection11']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection12']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection13']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection14']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection15']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection16']"));
		Thread.sleep(1000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[@id='lnkSection17']"));
		
		HelperClass.captureScreenshot("client dashboard show verified");
	
	}
	public void Verifyrefreshbutton() {
		
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-refresh']"));
	}
	
	public void Verifyminimisebutton() throws IOException {
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-arrows-h']"));
		
		HelperClass.captureScreenshot("Verifyminimisebutton verified");
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-arrows-h']"));
	}
}