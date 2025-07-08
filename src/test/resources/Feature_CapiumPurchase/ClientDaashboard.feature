Feature: Client Dashboard
 
Background: User login
   Given Launch the browser
  And User need to enter the Application Url
  When User Enter username and Password
  Then User Click on login button
  And redirect to Bookkeeping module
  
  
@ClientDashboard @Regression   
Scenario: Validate Client dashboard
Given Select and click on client name
Then Verify the Client dashboard

@ClientDashboard @Regression   
Scenario: Validate Sales button
Given Select and click on client name
Then Verify the Client dashboard
And Click on sales button and verify

@ClientDashboard @Regression   
Scenario: Validate Sales button
Given Select and click on client name
Then Verify the Client dashboard
And Click on customer button and verify

@ClientDashboard @Regression   
Scenario: Validate Sales button
Given Select and click on client name
Then Verify the Client dashboard
And Click on quote button and verify

@ClientDashboard @Regression   
Scenario: Validate Sales button
Given Select and click on client name
Then Verify the Client dashboard
And Click on purchase button and verify

@ClientDashboard @Regression   
Scenario: Validate Sales button
Given Select and click on client name
Then Verify the Client dashboard
And Click on supplier button and verify

@ClientDashboard @Regression   
Scenario: Validate Sales button
Given Select and click on client name
Then Verify the Client dashboard
And Verify Debtors/Creditors Chart and take screenshot

@ClientDashboard @Regression   
Scenario: Validate Sales button
Given Select and click on client name
Then Verify the Client dashboard
And Verify Sales/Purchase Chart and take screenshot
  
@ClientDashboard @Regression 
Scenario: Validate Sales button
Given Select and click on client name
Then Verify the Client dashboard
And Verify Invoice Ageing Summary and take screenshot

@ClientDashboard @Regression 
Scenario: Validate Sales button
Given Select and click on client name
Then Verify the Client dashboard
And Click on edit client change the adrees1 and verify

@ClientDashboard @Regression   
Scenario: Validate Sales button
Given Select and click on client name
Then Verify the Client dashboard
And Click on addbank button and verify

@ClientDashboard @Regression   
Scenario: Validate Sales button
Given Select and click on client name
Then Verify the Client dashboard
And Verify Current Debtors List and take screenshot

@ClientDashboard @Regression   
Scenario: Validate Sales button
Given Select and click on client name
Then Verify the Client dashboard
And Verify Recent Sales List and take screenshot

@ClientDashboard @Regression   
Scenario: Validate Sales button
Given Select and click on client name
Then Verify the Client dashboard
And Verify edit dashboard button and take screenshot

@ClientDashboard @Regression   
Scenario: Validate Sales button
Given Select and click on client name
Then Verify the Client dashboard
And Verify refresh button

@ClientDashboard @Regression   
Scenario: Validate Sales button
Given Select and click on client name
Then Verify the Client dashboard
And Verify minimise button



