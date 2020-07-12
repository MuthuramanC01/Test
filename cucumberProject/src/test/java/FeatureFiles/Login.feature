Feature: Application_Launch

  Scenario: Home Page Default Login
    Given User is on landing page
    When User log into application with valid username and password
    Then Home Page is loaded
    And All options are displayed


  Scenario: Home Page Default Login
    Given User is on landing page
    When User log into application with valid "EY" and password "123"
    Then Home Page is loaded
    And All options are displayed