package com.Capium.stepDefinations;
import java.io.IOException;

import com.Capium.Actions.Capium_Bookkeeping_Clientdashboard_Actions;
import com.Capium.Utilies.Log;
import com.Capium.Utilies.StepTracker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Capium_Bookkeping_Clientdashboard {
	
	Capium_Bookkeeping_Clientdashboard_Actions clientdashboardactions=new Capium_Bookkeeping_Clientdashboard_Actions();

	@Given("Select and click on client name")
	public void select_and_click_on_client_name() throws InterruptedException {

       clientdashboardactions.Selectandclickonclientname();
		
		StepTracker.setCurrentStep("Select and click on client name");
		Log.info("Select and click on client name");
	}

	@Then("Verify the Client dashboard")
	public void verify_the_client_dashboard() {

     clientdashboardactions.VerifytheClientdashboard();
		
		StepTracker.setCurrentStep("Verify the Client dashboard");
		Log.info("Verify the Client dashboard");
	}

	@Then("Click on sales button and verify")
	public void click_on_sales_button_and_verify() throws InterruptedException {

     clientdashboardactions.Clickonsalesbuttonandverify();
		
		
		StepTracker.setCurrentStep("Click on sales button and verify");
		Log.info("Click on sales button and verify");
	}

	@Then("Click on customer button and verify")
	public void click_on_customer_button_and_verify() throws InterruptedException {

      clientdashboardactions.Clickoncustomerbuttonandverify();
		
		StepTracker.setCurrentStep("Click on customer button and verify");
		Log.info("Click on customer button and verify");
	}

	@Then("Click on quote button and verify")
	public void click_on_quote_button_and_verify() throws InterruptedException {

      clientdashboardactions.Clickonquotebuttonandverify();
		
		StepTracker.setCurrentStep("Click on quote button and verify");
		Log.info("Click on quote button and verify");
	}

	@Then("Click on purchase button and verify")
	public void click_on_purchase_button_and_verify() throws InterruptedException {


		clientdashboardactions.Clickonpurchasebuttonandverify();
		
		StepTracker.setCurrentStep("Click on purchase button and verify");
		Log.info("Click on purchase button and verify");
	}

	@Then("Click on supplier button and verify")
	public void click_on_supplier_button_and_verify() throws InterruptedException {

      clientdashboardactions.Clickonsupplierbuttonandverify();
		
		StepTracker.setCurrentStep("Click on supplier button and verify");
		Log.info("Click on supplier button and verify");
	}

	@Then("Verify Debtors\\/Creditors Chart and take screenshot")
	public void verify_debtors_creditors_chart_and_take_screenshot() throws IOException {

       clientdashboardactions.VerifyDebtorsCreditorsChartandtakescreenshot();
		
		StepTracker.setCurrentStep("Verify Debtors\\\\/Creditors Chart and take screenshot");
		Log.info("Verify Debtors\\\\/Creditors Chart and take screenshot");
	}

	@Then("Verify Sales\\/Purchase Chart and take screenshot")
	public void verify_sales_purchase_chart_and_take_screenshot() throws IOException {


		clientdashboardactions.VerifySalesPurchaseChartandtakescreenshot();

		StepTracker.setCurrentStep("Verify Sales\\\\/Purchase Chart and take screenshot");
		Log.info("Verify Sales\\\\/Purchase Chart and take screenshot");
		
	}

	@Then("Verify Invoice Ageing Summary and take screenshot")
	public void verify_invoice_ageing_summary_and_take_screenshot() throws IOException {

      clientdashboardactions.VerifyInvoiceAgeingSummaryandtakescreenshot();
		
		
		StepTracker.setCurrentStep("Verify Invoice Ageing Summary and take screenshot");
		Log.info("Verify Invoice Ageing Summary and take screenshot");
	}

	@Then("Click on edit client change the adrees1 and verify")
	public void click_on_edit_client_change_the_adrees1_and_verify() throws InterruptedException {


		clientdashboardactions.Clickoneditclientchangetheadrees1andverify();
		
		StepTracker.setCurrentStep("Click on edit client change the adrees1 and verify");
		Log.info("Click on edit client change the adrees1 and verify");
	}

	@Then("Click on addbank button and verify")
	public void click_on_addbank_button_and_verify() throws InterruptedException {


		clientdashboardactions.Clickonaddbankbuttonandverify();
		
		
		StepTracker.setCurrentStep("Click on addbank button and verify");
		Log.info("Click on addbank button and verify");
	}

	@Then("Verify Current Debtors List and take screenshot")
	public void verify_current_debtors_list_and_take_screenshot() throws IOException {


		clientdashboardactions.VerifyCurrentDebtorsListandtakescreenshot();
		
		StepTracker.setCurrentStep("Verify Current Debtors List and take screenshot");
		Log.info("Verify Current Debtors List and take screenshot");
	}

	@Then("Verify Recent Sales List and take screenshot")
	public void verify_recent_sales_list_and_take_screenshot() throws IOException {


		clientdashboardactions.VerifyRecentSalesListandtakescreenshot();
		
		StepTracker.setCurrentStep("Verify Recent Sales List and take screenshot");
		Log.info("Verify Recent Sales List and take screenshot");
	}

	@Then("Verify edit dashboard button and take screenshot")
	public void verify_edit_dashboard_button_and_take_screenshot() throws InterruptedException, IOException {


		clientdashboardactions.Verifyeditdashboardbuttonandtakescreenshot();
		
		StepTracker.setCurrentStep("Verify edit dashboard button and take screenshot");
		Log.info("Verify edit dashboard button and take screenshot");
	}

	@Then("Verify refresh button")
	public void verify_refresh_button() {


		clientdashboardactions.Verifyrefreshbutton();
		
		
		StepTracker.setCurrentStep("Verify refresh button");
		Log.info("Verify refresh button");
	}

	@Then("Verify minimise button")
	public void verify_minimise_button() throws IOException {

     clientdashboardactions.Verifyminimisebutton();
		
		
		StepTracker.setCurrentStep("Verify minimise button");
		Log.info("Verify minimise button");
	}	
}
