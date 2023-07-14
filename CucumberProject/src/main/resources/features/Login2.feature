
Feature: Login feature

  Background: A user Navigates to Login Page
    Given A user Navigates to Login URL

  @regression
  Scenario: As a user, I can Login with valid credentials
    When A user login with "test40@yahoo.com" and "yassin"
    Then A user is redirected to home page


  @regression @smoketest
  Scenario: As a user, I can't Login with invalid credentials
    When A user login with "username2@test.com" and "password2"
    Then An error msg is displayed


  @outline
    Scenario Outline: As a user, I can't Login with invalid credentials
      When A user login with <username> and <password>
      Then An error msg is displayed

      Examples:
      |username|password|
      |"test40@yahoo.com"|"yassin"|
      |"c253c04ad0ef@drmail.in"|"mmmmmssssmmm"|
      |"tests@test.com"|"123456"|

