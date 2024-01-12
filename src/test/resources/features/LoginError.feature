Feature: Login with wrong username and password
  Scenario: Navigate to login with wrong username and password
    #Given open browser
    When navigate to url
    Then click on Login button
    And validate "Sign in to your Account" is displayed
    Then login with username "wrongusername" and password "wrongpassword"
    And verify error "ERROR" appears
    #And close browser