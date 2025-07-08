Feature: Bookkeeping Fixed Assets
 
  Background: User login
  Given Launch the browser
  And User need to enter the Application Url
  When User Enter username and Password
  Then User Click on login button
  And redirect to Bookkeeping module
 
  @FixedAssets @Regression
   Scenario: Verify Fixed Assets page
   Given Click onfixedassests validate fixedassests page
   @FixedAssets @Regression
   Scenario: Verify add fixed assests redirection to purchase
   Given Click onfixedassests validate fixedassests page
   Then Click on addfixedassests and verify purchase page
   @FixedAssets @Regression
   Scenario: Verify add tangble fixed assest in purchase
   Given Click onfixedassests validate fixedassests page
   Then Click addfixedassests and add tangble assest in purchase
   @FixedAssets @Regression
   Scenario: Verify add intangble fixed assest in purchase
   Given Click onfixedassests validate fixedassests page
   Then Click addfixedassests and add intangble assest in purchase
   @FixedAssets @Regression
   Scenario: Verify add leased fixed assest in purchase
   Given Click onfixedassests validate fixedassests page
   Then Click addfixedassests and add leased assest in purchase
   @FixedAssets @Regression
   Scenario: Verify Edit and explain functionality for tangible
   Given Click onfixedassests validate fixedassests page
   Then Click on edit and explain in action dropdown for tangible
   @FixedAssets @Regression
   Scenario: Verify sell functionality for tangible
   Given Click onfixedassests validate fixedassests page
   Then Click on sell in action dropdown for tangible
   @FixedAssets @Regression
   Scenario: Verify activate(sell assest) functionality for tangible
   Given Click onfixedassests validate fixedassests page
   Then Click on activate(sell aseest) in action dropdown for tangible
   @FixedAssets @Regression
   Scenario: Verify disposed functionality for tangible
   Given Click onfixedassests validate fixedassests page
   Then Click on disposed in action dropdown for tangble
   @FixedAssets @Regression
   Scenario: Verify activate(disposed assest) functionality for tangble
   Given Click onfixedassests validate fixedassests page
   Then Click on activate(disposed)action dropdown for tangble
   @FixedAssets @Regression
   Scenario: Verify Edit and explain functionality for intangible
   Given Click onfixedassests validate fixedassests page
   Then Click on edit and explain in action dropdown for intangible
   @FixedAssets @Regression
   Scenario: Verify disposed functionality for intangible
   Given Click onfixedassests validate fixedassests page
   Then Click on disposed in action dropdown for intangble
   @FixedAssets @Regression
   Scenario: Verify activate(disposed assest) functionality for intangble
   Given Click onfixedassests validate fixedassests page
   Then Click on activate(disposed)action dropdown for intangble
   @FixedAssets @Regression
   Scenario: Verify disposed functionality for leased
   Given Click onfixedassests validate fixedassests page
   Then Click on disposed in action dropdown for leased
   @FixedAssets @Regression
   Scenario: Verify Edit and explain functionality for leased
   Given Click onfixedassests validate fixedassests page
   Then Click on edit and explain in action dropdown for leased
    @FixedAssets @Regression
   Scenario: Verify sell functionality for leased
   Given Click onfixedassests validate fixedassests page
   Then Click on sell in action dropdown for leased
   @FixedAssets @Regression
   Scenario: Verify activate(sell assest) functionality for leased
   Given Click onfixedassests validate fixedassests page
   Then Click on activate(sell aseest) in action dropdown for leased
   @FixedAssets @Regression
   Scenario: Verify activate(disposed assest) functionality for leased
   Given Click onfixedassests validate fixedassests page
   Then Click on activate(disposed)action dropdown for leased
   @FixedAssets @Regression
   Scenario: Verify depreciation functionality
   Given Click onfixedassests validate fixedassests page
   Then Click on depreciation and verify depreciate