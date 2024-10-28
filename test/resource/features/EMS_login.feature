Feature: Feature to test the functionality of Login in EMS application

  Scenario: User to test the functionality of login in EMS application
  Given User is on login page
  When User click on company Login button
  And User Enter service name"sattava"
  And User click on submit method
  When User Enter valid "sattava@gmail.com" and "Path@2024"
  Then User click on signin button
  And User enter otp "123456"
  Then User click on signin button
  
  Scenario Outline: User check the functionality of service name
  Given User is on login page
  And User click on company Login button
  When User Enter Invalid values into <servicename>
  
  Examples:
  | servicename                                |
  |                                45678987654 |
  | *&^%$#$%^&*                                |
  | t                                          |
  | iuydfjbn vbjhgfghytfgvchcggcgcgcgcgcghvhvc |
  |                                            |
  | SERVICE                                    |
  |                                            |
  | S E R V I C E                              |
  | jhgfdfghjkjhgfdsdfghjkjhgfdfghj            |
  
  Scenario Outline: User can check the functionality of login with invalid credentials
  Given User is on login page
  When User click on company Login button
  And User Enter service name"sattava"
  And User click on submit method
  When User Enter invalid <username> and <password>
  Then User click on signin button
  Examples:
  | username             | password   |
  |              2345678 |   23456789 |
  | hgfsdhgfhg@gmail.com | dfghjhg    |
  |                      |            |
  | @#$%^%$#             | ^%$#@#$%^& |
  | 13243413@gmail.com   | Path@2024  |
  | sattava@gmail.com    | path@2024  |
  |                      | Path@2024  |
  | sattava@gmail.com    |            |
  | sattava123@gmail.com | kjhgyfuy   |
 
  Scenario: User can check the functionality of forgot password
    Given User is on login page
    When User click on company Login button
    And User Enter service name"sattava"
    And User click on submit method
    And User can click forgot password link
    When User enter email "sattava@gmail.com"into email field
    And User click on send otp button
    When User enter "123456"otp into otp field
    And User click on submit button
    When User enter New password "Path@2024" and confirm password "Path@2024"
    Then User click on update password button
@Skip
  Scenario Outline: User can check the functionality  forgot password field with invalid credentials
    Given User is on login page
    When User click on company Login button
    And User Enter service name"sattava"
    And User click on submit method
    And User can click forgot password link
    When User enter <email> into email field
    Then User click on send otp button

    Examples: 
      | email                   |
      | nagabhushanam@gmail.com |
      | 12345@gmail.com         |
      |                12345678 |

  Scenario Outline: User can check the functionality of new and confirm password fields with invalid values
    Given User is on login page
    When User click on company Login button
    And User Enter service name"sattava"
    And User click on submit method
    And User can click forgot password link
    When User enter email "sattava@gmail.com"into email field
    And User click on send otp button
    When User enter "123456"otp into otp field
    And User click on submit button
    Then User enter <New password>  and <confirm password>

    Examples: 
      | New password | confirm password |
      | Path@2024    | Path@2023        |
      | path@2023    | path@2023        |
      | path123      | path123          |
      | Path@%^&*    | Path@%^&*        |
      | pah1234567 |         poi12345678 |
      | 345!@#$%^&*     | hjhj!@#$%^&*         |
      | ASDFGHJ      | IUHGFDSDF        |
