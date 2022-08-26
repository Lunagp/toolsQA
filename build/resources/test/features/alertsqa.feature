Feature: Review the operation of the alerts on the website

  Scenario: enter the page and make alerts
    Given go to the website "https://demoqa.com/alerts"
    When click to see how each alert works
    Then verification message
    |confirm | You selected Ok|