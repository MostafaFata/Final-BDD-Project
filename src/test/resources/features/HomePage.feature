@TEK
Feature: Validate title and button on homepage
  Scenario: user navigates to home page, title is TEK Insurance App & create Primary Account button exists
    #Given open browser
    When navigate to url
    Then get title and validate title is "Tek Insurance UI"
    And assure that create primary button exists
    #And close browser