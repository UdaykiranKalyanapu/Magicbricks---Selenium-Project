Feature: MB Testing



  @tag1
  Scenario: To validate that user is able to select a location
    Given User is able to login to access Homepage
    When User is on the homePage
    Then User clicks on dropdown menu on locations
    And User selects a location

  @tag2
  Scenario: To validate estates availability in preferred location
    Given User is able to select a preferred location
    When User clicks on property for rent
    Then User should see available estates


  @tag3
  Scenario: To validate share property feedback option
    Given User is on property for rent page
    When User clicks on share Feedback button
    And User selects a option displayed
    And clicks on submit button
    Then displays the ThankYou message to User


  @tag4

 Scenario: To validate the Flats availability in preferred location
    Given User is able to select the preferred locations
    When User clicks on flat for rent option
    Then User should see the available flats for rent


  @tag5
  Scenario: To validate MB prime Page
    Given User is logged in
    When User selects MBPrime option from header tab
    Then User should be displayed with prime packs

