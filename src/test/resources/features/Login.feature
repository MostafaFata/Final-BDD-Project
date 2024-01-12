Feature: Login
  Scenario: Navigate to login by clicking on Login button and enter valid csr user
    #Given open browser
    When navigate to url
    Then click on Login button
    And validate "Sign in to your Account" is displayed
    Then login with username "supervisor" and password "tek_supervisor"
    And validate user navigates to "Customer Service Portal"
    #And close browser