Feature: Login Page Test
  As a user
  I want to log into the secure area
  So that I can access protected resources

  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter a valid username and password
    And I click the login button
    Then I should be redirected to the secure area
