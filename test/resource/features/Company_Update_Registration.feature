Feature: Feature to test the Update Registration in EMS application

  Background: 
    Given User is on login page
    And User click on emslogin button
    When User enter Username"admin@pathbreaker.com" and password"Passw0rd!"
    And User click on login button

  Scenario Outline: User to test the functionality of Update company Registration
    When User click on Employer dropdown
    And User click on Summary Registration button
    And User click on Edit button
    When User update the <contactnumber> and <companyaddress>
    Then User click on update company button

    Examples: 
      | contactnumber | companyaddress        |
      |    9703515010 | Hyderabad, Hitechcity |

  Scenario Outline: User to test the functionality of search field
    When User click on Employer dropdown
    And User click on Summary Registration button
    Then User enter the <companyname> in search field the related companies should be displayed or not

    Examples: 
      |companyname|
      | Evy          |
      |         1234 |
      | &^%$%^&      |
   Scenario: User to test the functionality of Delete button
    When User click on Employer dropdown
    And  User click on Summary Registration button
    And  User click on Delete icon
    And  User click on delete button
    Then User click on logout button
