@TEK
Feature: checking existing account error on the Create Primary Account form
  Scenario: filling the Create Primary Account form and click on Create Account btn
    #Given open browser
    When navigate to url
    Then click on Create Primary Account
    And validate "Create Primary Account Holder" appears
    Then fill the Create Primary Account form
    And submit the form
    And verify error "ERROR" appears
    #And close browser