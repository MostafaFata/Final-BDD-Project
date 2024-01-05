Feature: Getting the title of a website
  Scenario: Check the title of the website is Google
    Given open the browser
    When navigate to google.com
    Then title should be Google
    And close the browser