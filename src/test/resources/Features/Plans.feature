@AllTests
Feature: Plans Confirmation

  @Saudi
  Scenario: User tries Saudi plans page
    Given User navigates to base URL
    When User clicks on country selector
    And User selects sa
    Then User should be navigated to sa URL
    And User should see sa flag
    And User should see plans of lite, classic and premium
    And User should see prices as 15 for lite, 25 for classic and 60 for premium
    And User should see a currency of SAR for plans lite, classic and premium
    And Take a screenshot for Saudi page


  @Bahrain
  Scenario: User tries Bahrain plans page
    Given User navigates to base URL
    When User clicks on country selector
    And User selects bh
    Then User should be navigated to bh URL
    And User should see bh flag
    And User should see plans of lite, classic and premium
    And User should see prices as 2 for lite, 3 for classic and 6 for premium
    And User should see a currency of BHD for plans lite, classic and premium
    And Take a screenshot for Bahrain page


  @Kuwait
  Scenario: User tries Kuwait plans page
    Given User navigates to base URL
    And User clicks on country selector
    And User selects kw
    Then User should be navigated to kw URL
    And User should see kw flag
    And User should see plans of lite, classic and premium
    And User should see prices as 1.2 for lite, 2.5 for classic and 4.8 for premium
    And User should see a currency of KWD for plans lite, classic and premium
    And Take a screenshot for Kuwait page



