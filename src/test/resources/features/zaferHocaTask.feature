
Feature: Home Page

  Scenario Outline: Tabs_Modules_Task
    Given The user is on the Login Page
    When The user input valid credentials to "<userEmail>" and "<password>" bars
    Then The user verify that on the "<relatedPage>" page
    When The user navigate to "<Tabs>" "<modules>"
    Then The user verfiy that "<moduleSubtitle>"
    When The user should close all tabs
    Then The user navigate to back and verify the current URL
    Examples:
      | userEmail         | password  | relatedPage | Tabs       | modules      | moduleSubtitle |
      | sgezer@gmail.com  | 12345678  | Dashboard   | Components | Iframe       | Iframe         |
      | zafer@gmail.com   | 123456789 | Dashboard   | Forms      | Select       | Select         |
      | mustafa@gmail.com | 123456789 | Dashboard   | JavaScript | Clicks       | Clicks         |
      | mike@gmail.com    | mike1234  | Dashboard   | Components | Open New Tab | Opennew        |


