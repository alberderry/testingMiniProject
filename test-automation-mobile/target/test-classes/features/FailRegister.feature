Feature: New user can Create account and Fail Registered

  @Register
  Scenario: As a new user, I have be able to create new account
    When New user click account
    When New user click register
    And New user input name on name field
    And New user input email on email field
    And New user input password on password field
    And New user click register button
#    Then New user see failed message "Gagal :("