Feature: Demo QA
  I want to interactive
  to the DemoQA page
  to put my skills into practice
  Scenario Outline:Scenario: Interact in the website
    Given that Andres open de browser and enter the page 'https://demoqa.com/dynamic-properties'
    When he select to the element option and the category dynamic properties
      | button_option | <button_option> |
    Then He should see on the screen the selected button
    Examples:
      | button_option |
      | visible       |

