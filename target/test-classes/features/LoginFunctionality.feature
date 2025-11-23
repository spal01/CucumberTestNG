Feature: Login to website
  I want to use this template for my feature file

  @Smoke
  Scenario: Login with valid user credential
    Given I am on Login Page
    When I enter valid username and password
    Then I am able to login successfully

