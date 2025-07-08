package com.Capium.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.Capium.Locators.Capium_Bookkeeping_FixedAssets_Locators;
import com.Capium.Utilies.HelperClass;


public class Capium_Bookkeeping_FixedAssets_Actions {

	Capium_Bookkeeping_FixedAssets_Locators FixedAssestLocators = null;
	 
	public Capium_Bookkeeping_FixedAssets_Actions() {
		this.FixedAssestLocators = new Capium_Bookkeeping_FixedAssets_Locators();
		PageFactory.initElements(HelperClass.getDriver(), FixedAssestLocators);
	}
 
	public void Clickonfixedassestsvalidatefixedassestspage() throws InterruptedException {
	
		HelperClass.Searchclient("Test client", By.xpath("(//a[@class='azure'])[1]"));
		FixedAssestLocators.clickFixedAsset.click();
 
		String actualtext = HelperClass.getText(By.xpath("//h1[text()='Fixed Assets']"));
 
		String expected = "Fixed Assets";
 
		if (actualtext == expected) {
 
			System.out.println("Verified");
		} else {
			System.out.println("Not Matched");
		}
	}
 
	public void Clickonaddfixedassestsandverifypurchasepage() throws InterruptedException {
		Thread.sleep(2000);
		FixedAssestLocators.addFixedAsset.click();
		Thread.sleep(2000);
 
		String actualtext = HelperClass.getText(By.xpath("//h1[text()='Create New Purchase']"));
		String expected = "Create New Purchase";
 
		if (actualtext == expected) {
 
			System.out.println("Verified");
		} else {
			System.out.println("Not Matched");
		}
	}
 
	public void Clickaddfixedassestsandaddtangbleassestinpurchase() throws InterruptedException {
 
		FixedAssestLocators.addFixedAsset.click();
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-plus azure']"));
		HelperClass.sendKeys(By.xpath("//input[@id='txtCName']"), "Supplierfortangble");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//i[@class='fa fa-save'])[3]"));
		Thread.sleep(2000);
		FixedAssestLocators.enterDescription.sendKeys("des1");
		HelperClass.setValueUsingJS(By.xpath("(//input[@type='text'])[5]"), "1000");
		HelperClass.sendKeys(By.xpath("(//input[@type='text'])[7]"), "4100");
		HelperClass.selectOptionByValue(By.xpath("//select[@name='Items[1].F_TaxCodeMaster']"), "5");
		FixedAssestLocators.clickSaveandClose.click();
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//span[@class='menu-text'])[6]"));
 
		String actualtext = HelperClass.getTitile(By.xpath("//div[@title='Fixtures & Fittings - Cost b/fwd']"));
		String expected = "Other Intangible - Additions Cost";
 
		if (actualtext == expected) {
 
			System.out.println("Verified");
		} else {
			System.out.println("Not Matched");
		}
	}
 
	public void Clickaddfixedassestsandaddintangbleassestinpurchase() throws InterruptedException {
 
		FixedAssestLocators.addFixedAsset.click();
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-plus azure']"));
		HelperClass.sendKeys(By.xpath("//input[@id='txtCName']"), "Supplierforintangble");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//i[@class='fa fa-save'])[3]"));
		Thread.sleep(2000);
		FixedAssestLocators.enterDescription.sendKeys("des2");
		HelperClass.setValueUsingJS(By.xpath("(//input[@type='text'])[5]"), "1000");
		HelperClass.sendKeys(By.xpath("(//input[@type='text'])[7]"), "4031");
		HelperClass.selectOptionByValue(By.xpath("//select[@name='Items[1].F_TaxCodeMaster']"), "5");
		FixedAssestLocators.clickSaveandClose.click();
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//span[@class='menu-text'])[6]"));
 
		String actualtext = HelperClass.getText(By.xpath("//div[@class='hideoverflow danger']"));
		String expected = "Other Intangible - Additions Cost";
 
		if (actualtext == expected) {
 
			System.out.println("Verified");
		} else {
			System.out.println("Not Matched");
		}
	}
 
	public void Clickaddfixedassestsandaddleasedassestinpurchase() throws InterruptedException {
 
		FixedAssestLocators.addFixedAsset.click();
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-plus azure']"));
		HelperClass.sendKeys(By.xpath("//input[@id='txtCName']"), "Supplierforleased");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//i[@class='fa fa-save'])[3]"));
		Thread.sleep(2000);
		FixedAssestLocators.enterDescription.sendKeys("des3");
		HelperClass.setValueUsingJS(By.xpath("(//input[@type='text'])[5]"), "1000");
		HelperClass.sendKeys(By.xpath("(//input[@type='text'])[7]"), "4130");
		HelperClass.selectOptionByValue(By.xpath("//select[@name='Items[1].F_TaxCodeMaster']"), "5");
		FixedAssestLocators.clickSaveandClose.click();
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//span[@class='menu-text'])[6]"));
 
		String actualtext = HelperClass.getText(By.xpath("//div[@class='hideoverflow danger']"));
		String expected = "Land & Buildings Leased - Cost b/fwd";
 
		if (actualtext == expected) {
 
			System.out.println("Verified");
		} else {
			System.out.println("Not Matched");
		}
	}
 
	public void Clickoneditandexplaininactiondropdownfortangible() throws InterruptedException {
 
		HelperClass.selectOptionByValue(By.xpath("(//select[@class='fa-action input-xs text-center'])[1]"), "edit");
		HelperClass.sendKeys(By.xpath("//input[@id='fa-edit-rate']"), "10");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-save']"));
		Thread.sleep(2000);
 
		String actualtext = HelperClass.getText(By.xpath("//div[@class='hideoverflow ']"));
		String expected = "Land & Buildings Leased - Cost b/fwd";
 
		if (actualtext == expected) {
 
			System.out.println("Verified");
		} else {
			System.out.println("Not Matched");
		}
	}
 
	public void Clickonsellinactiondropdownfortangible() throws InterruptedException {
 
		HelperClass.selectOptionByValue(By.xpath("(//select[@class='fa-action input-xs text-center'])[1]"), "sell");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//li[@class='active'])[4]"));
 
		HelperClass.setValueUsingJS(By.xpath("//input[@name='Price']"), "1000");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//button[@type='button'])[4]"));
		Thread.sleep(2000);
		FixedAssestLocators.clickDisposed.click();
		String actualtext = HelperClass.getTitile(By.xpath("//div[@title='Fixtures & Fittings - Cost b/fwd']"));
		String expected = "Fixtures & Fittings - Cost b/fwd";
 
		if (actualtext == expected) {
 
			System.out.println("Verified");
		} else {
			System.out.println("Not Matched");
		}
	}
 
	public void Clickonactivatesellaseestinactiondropdownfortangible() {
 
		FixedAssestLocators.clickDisposed.click();
		HelperClass.selectOptionByValue(By.xpath("(//select[@class='fa-action-disposed input-xs text-center'])[1]"),
				"activate");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-check']"));
		String actualtext = HelperClass.getTitile(By.xpath("//div[@title='Fixtures & Fittings - Cost b/fwd']"));
		String expected = "Fixtures & Fittings - Cost b/fwd";
 
		if (actualtext == expected) {
 
			System.out.println("Verified");
		} else {
			System.out.println("Not Matched");
		}
	}
 
	public void Clickondisposedinactiondropdownfortangible() throws InterruptedException {
 
		HelperClass.selectOptionByValue(By.xpath("(//select[@class='fa-action input-xs text-center'])[1]"), "dispose");
		Thread.sleep(2000);
		FixedAssestLocators.clickDisposedsave.click();
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-save']"));
		Thread.sleep(2000);
 
		String actualtext = HelperClass.getText(By.xpath("//div[@class='hideoverflow ']"));
		String expected = "Land & Buildings Leased - Cost b/fwd";
 
		if (actualtext == expected) {
 
			System.out.println("Verified");
		} else {
			System.out.println("Not Matched");
		}
	}
 
	public void Clickonactivatedisposedactiondropdownfortangible() {
 
		FixedAssestLocators.clickDisposed.click();
		HelperClass.selectOptionByValue(By.xpath("(//select[@class='fa-action-disposed input-xs text-center'])[1]"),
				"activate");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-check']"));
		String actualtext = HelperClass.getTitile(By.xpath("//div[@title='Fixtures & Fittings - Cost b/fwd']"));
		String expected = "Fixtures & Fittings - Cost b/fwd";
 
		if (actualtext == expected) {
 
			System.out.println("Verified");
		} else {
			System.out.println("Not Matched");
		}
	}
 
	public void Clickondepreciationandverifydepreciatefortangible() throws InterruptedException {
 
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()='Depreciation']"));
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//input[@id='chkfixed']"));
 
	}
 
	public void Clickoneditandexplaininationropdownforintangible() throws InterruptedException {
 
		HelperClass.selectOptionByValue(By.xpath("(//select[@class='fa-action input-xs text-center'])[2]"), "edit");
		HelperClass.sendKeys(By.xpath("//input[@id='fa-edit-rate']"), "10");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-save']"));
		Thread.sleep(2000);
 
		String actualtext = HelperClass.getText(By.xpath("//div[@class='hideoverflow ']"));
		String expected = "Land & Buildings Leased - Cost b/fwd";
 
		if (actualtext == expected) {
 
			System.out.println("Verified");
		} else {
			System.out.println("Not Matched");
		}
 
	}
 
	public void Clickondisposedinactiondropdownforintangble() throws InterruptedException {
 
		HelperClass.selectOptionByValue(By.xpath("(//select[@class='fa-action input-xs text-center'])[2]"), "dispose");
		Thread.sleep(2000);
		FixedAssestLocators.clickDisposedsave.click();
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-save']"));
		Thread.sleep(2000);
 
		String actualtext = HelperClass.getText(By.xpath("//div[@class='hideoverflow ']"));
		String expected = "Other Intangible - Additions Cost";
 
		if (actualtext == expected) {
 
			System.out.println("Verified");
		} else {
			System.out.println("Not Matched");
		}
	}
 
	public void Clickonactivatedisposedactiondropdownforintangble() {
 
		FixedAssestLocators.clickDisposed.click();
		HelperClass.selectOptionByValue(By.xpath("(//select[@class='fa-action-disposed input-xs text-center'])[1]"),
				"activate");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-check']"));
		String actualtext = HelperClass.getTitile(By.xpath("//div[@title='Other Intangible - Additions Cost']"));
		String expected = "Other Intangible - Additions Cost";
 
		if (actualtext == expected) {
 
			System.out.println("Verified");
		} else {
			System.out.println("Not Matched");
		}
	}
 
	public void Clickoneditandexplaininactiondropdownforleased() throws InterruptedException {
 
		HelperClass.selectOptionByValue(By.xpath("(//select[@class='fa-action input-xs text-center'])[1]"), "edit");
		HelperClass.sendKeys(By.xpath("//input[@id='fa-edit-rate']"), "10");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-save']"));
		Thread.sleep(2000);
 
		String actualtext = HelperClass.getText(By.xpath("//div[@class='hideoverflow ']"));
		String expected = "Land & Buildings Leased - Cost b/fwd";
 
		if (actualtext == expected) {
 
			System.out.println("Verified");
		} else {
			System.out.println("Not Matched");
		}
	}
 
	public void Clickonsellinactiondropdownforleased() throws InterruptedException {
 
		HelperClass.selectOptionByValue(By.xpath("(//select[@class='fa-action input-xs text-center'])[1]"), "sell");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//li[@class='active'])[4]"));
 
		HelperClass.setValueUsingJS(By.xpath("//input[@name='Price']"), "1000");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//button[@type='button'])[4]"));
		Thread.sleep(2000);
		FixedAssestLocators.clickDisposed.click();
		String actualtext = HelperClass.getTitile(By.xpath("//div[@title='Land & Buildings Leased - Cost b/fwd']"));
		String expected = "Land & Buildings Leased - Cost b/fwd";
 
		if (actualtext == expected) {
 
			System.out.println("Verified");
		} else {
			System.out.println("Not Matched");
		}
	}
 
	public void Clickonactivatesellaseestinactiondropdownforleased() {
 
		FixedAssestLocators.clickDisposed.click();
		HelperClass.selectOptionByValue(By.xpath("(//select[@class='fa-action-disposed input-xs text-center'])[1]"),
				"activate");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-check']"));
		String actualtext = HelperClass.getTitile(By.xpath("//div[@title='Land & Buildings Leased - Cost b/fwd']"));
		String expected = "Land & Buildings Leased - Cost b/fwd";
 
		if (actualtext == expected) {
 
			System.out.println("Verified");
		} else {
			System.out.println("Not Matched");
		}
	}
 
	public void Clickondisposedinactiondropdownforleased() throws InterruptedException {
 
		HelperClass.selectOptionByValue(By.xpath("(//select[@class='fa-action input-xs text-center'])[1]"), "dispose");
		Thread.sleep(2000);
		FixedAssestLocators.clickDisposedsave.click();
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-save']"));
		Thread.sleep(2000);
 
		String actualtext = HelperClass.getText(By.xpath("//div[@class='hideoverflow ']"));
		String expected = "Land & Buildings Leased - Cost b/fwd";
 
		if (actualtext == expected) {
 
			System.out.println("Verified");
		} else {
			System.out.println("Not Matched");
		}
	}
 
	public void Clickonactivatedisposedactiondropdownforleased() {
 
		FixedAssestLocators.clickDisposed.click();
		HelperClass.selectOptionByValue(By.xpath("(//select[@class='fa-action-disposed input-xs text-center'])[1]"),
				"activate");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//i[@class='fa fa-check']"));
 
		String actualtext = HelperClass.getTitile(By.xpath("//div[@title='Land & Buildings Leased - Cost b/fwd"));
		String expected = "Land & Buildings Leased - Cost b/fwd";
 
		if (actualtext == expected) {
 
			System.out.println("Verified");
		} else {
			System.out.println("Not Matched");
		}
 
	}
 
	public void Clickondepreciationandverifydepreciate() throws InterruptedException {
 
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()='Depreciation']"));
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//input[@id='chkfixed']"));
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//button[@type='button'])[4]"));
 
		String actualtext = HelperClass.getTitile(By.xpath("//a[text()='Rollback']"));
		String expected = "Rollback";
 
		if (actualtext == expected) {
 
			System.out.println("Verified");
		} else {
			System.out.println("Not Matched");
		}
	}
}
