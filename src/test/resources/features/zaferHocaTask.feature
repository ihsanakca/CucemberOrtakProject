Feature: Zafer Hoca Task

  @wip
  Scenario Outline: Tabs_Modules_Task
    Given The user is on the Login Page
    When The user input valid credentials to "<userEmail>" and "<password>" bars
    Then The user verify that on the "<relatedPage>" page
    When The user navigate to "<Tabs>" "<modules>"
    Then The user verfiy that "<moduleSubtitle>"
    When The user should close all tabs
    Then The user verify that all tabs are closed

    Examples:
      | userEmail        | password | relatedPage | Tabs       | modules | moduleSubtitle |
      | sgezer@gmail.com | 12345678 | Dashboard   | Components | Iframe  | Iframe         |

