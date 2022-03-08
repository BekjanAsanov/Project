@Smoke

Feature: Login functionality
  #here we would write the feature name to be tested
  # we create one feature file per feature

  @Regression
  Scenario: Verify user can login with valid credentials
    # Given steps are used for precondition
    Given User is logged to https://www.facebook.com/
    #When action
    When User enter test@test.com to email field
    # And
    And User should enter Hello1234 in password input field
    And  User should click on Log in button
    #Then Validation
    Then User should successfully logged into to the Facebook