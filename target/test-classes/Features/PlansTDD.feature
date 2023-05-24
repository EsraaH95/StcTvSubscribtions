@DDT
Feature: Plans Confirmation

  Scenario Outline: User tries <Country> plans page
    Given User navigates to base URL
    When User clicks on country selector
    And User selects <CountryCode>
    Then User should be navigated to <CountryCode> URL
    And User should see <CountryCode> flag
    And User should see plans of <Plan1>, <Plan2> and <Plan3>
    And User should see prices as <Plan1Price> for <Plan1>, <Plan2Price> for <Plan2> and <Plan3Price> for <Plan3>
    And User should see a currency of <Currency> for plans <Plan1>, <Plan2> and <Plan3>
    And Take a screenshot for <Country> page
    Examples:
      | Country | CountryCode | Plan1 | Plan1Price | Plan2   | Plan2Price | Plan3   | Plan3Price | Currency |
      | Bahrain | bh          | lite  | 2          | classic | 3          | premium | 6          | BHD      |
      | Saudi   | sa          | lite  | 15         | classic | 25         | premium | 60         | SAR      |
      | Kuwait  | kw          | lite  | 1.2        | classic | 2.5        | premium | 4.8        | KWD      |