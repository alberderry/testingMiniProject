Feature: As a user i have be able to login so that i can see home screen

  Scenario: As a user i cant login because i input invalid password
    Given user on home page
    When user click account info
    When user input valid email
    And user input invalid password
    And user click login button
#    Then user see error message "Wrong Email or Password"