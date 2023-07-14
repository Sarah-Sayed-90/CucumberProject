Feature: Login feature

  Background: A user Navigates to Login Page
    Given A user Navigates to Login URL


  Scenario: As a user, I can Login with valid credentials
  # Given A user open Chrome Browser
  #And A user Navigates to Login URL
  When A user inserts a valid username and valid password
  Then A user should redirected to the homepage


  Scenario: As a user, I can't Login with invalid credentials
    # Given A user open Chrome Browser
    #And A user Navigates to Login URL
    When A user inserts an invalid username and invalid password
    Then An error msg is displayed