@wip
Feature: select

  Scenario Outline: Tabs_Modules_Task
    Given The user is on the Login Page
    When The user input valid credentials to "<userEmail>" and "<password>" bars
    Then The user verify that on the "<relatedPage>" page
    When The user navigate to "<Tabs>" "<modules>"
    Then The user verfiy that "<moduleSubtitle>"
    When The user should select from selectmenu two
    Then The user should verify "<current_URL>"
    Then The user navigate to back and verify the current URL

    Examples:
      | userEmail         | password  | relatedPage | Tabs       | modules      | moduleSubtitle |current_URL|
      | zafer@gmail.com   | 123456789 | Dashboard   | Forms      | Select       | Select         |https://www.krafttechexlab.com/forms/select|
