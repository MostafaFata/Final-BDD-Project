@TEK
Feature: Validating create account button and form
  Scenario: validating create account button and form
    #Given open browser
    When navigate to url
    Then click on Create Primary Account
    And validate "Create Primary Account Holder" appears
    #And close browser