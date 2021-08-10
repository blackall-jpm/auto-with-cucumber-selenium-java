Feature: feature file to test the web page

  Scenario: check web page searching function
    Given user is on the weather app web page
    And focus is on the search box
    When the user enters a city
    And the user hits return
    Then the web page updates the weather
