@TestcaseP2R4
Feature: Parcel2Release4 Track and Trace Application
  Scenario: TrackAndTrace
    Given I launch the url "https://www.royalmail.com/"
    And  I click on Business Services
    Then I click on Royal Mail for small and medium sized businesses
    Then I click on Track your Item
    And I enter the Barcode "09036848800000000703"
    And I click on Track your Delivery
