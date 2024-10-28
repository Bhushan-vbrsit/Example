Feature: feature to test the functionality of company registration

  Background: User to test the functionality of login with valid credentials
    Given User is on login page
    And User click on emslogin button
    When User enter Username"admin@pathbreaker.com" and password"Passw0rd!"
    And User click on login button

  Scenario: User to test the functionality of private limited company registration with valid credentials
    When User click on Employer dropdown
    And User click on Registration button
    When User click on Radio button
    And User enter valid "Evy" and "ev" and "evy@gmail.com" and "Bhushan@2024" and "7654345698 " and "9879876787" and "Hyderabad, Gachibowli" and "L76545HB8765HBG876543" and "09YHBGF8765G4Z5" and "VBHGF6787G" and "Nani" and "nani@gmail.com" and "9345234587" and "Hyderabad, Gachibowli"
    Then User click on submit button
  Scenario: User to test the Home page button is working or not
    When User click on Employer dropdown
    And User click on Registration button
    Then User can verify the home button is working or not

  Scenario Outline: User to test the functionality of company registration with Invalid credentials
    When User click on Employer dropdown
    And User click on Registration button
    When User click on Radio button
    And User enter Invalid "<CompanyName>","<ServiceName>","<CompanyEmailid>","<Password>","<ContactNumber>","<AlternateNumber>","<CompanyAddress>","<CompanyCINnumber>","<CompanyGSTNumber>","<CompanyPANnumber>","<Name>","<PersonalEmailid>","<PersonalMobilenumber>","<Address>"
    Then User click on submit button
    Examples:
      | CompanyName | ServiceName | CompanyEmailid  | Password | ContactNumber | AlternateNumber | CompanyAddress | CompanyCINnumber      | CompanyGSTNumber  | CompanyPANnumber | Name   | PersonalEmailid  | PersonalMobilenumber | Address   |
      |    34567876 |         765 | 45566@gmail.com | Path@juu |     789765434 | fghugfdfghj     | Hyderabad      | L8765GH87654HB987654K | 09HNBV87654F8Z765 | CGHUJH9876       | 234567 | bhushangmail.com | 765ertyuytrtyu       | Hyderabad |
   Scenario: User to test the functionality of firm company registration with valid credentials
    When User click on Employer dropdown
    And User click on Registration button
    When User click on Radio buttons
    And User enter valid firm credentials"Onpassive" and "pass" and "onpass@gmail.com" and "Bhushanam@2024" and "7654345696 " and "9879876785" and "Hyderabad, Gachibowli" and "L76545HB8765HBG876542" and "09YHBGF8765G4Z6" and "VBHGF6787K" and "Nanij" and "nanij@gmail.com" and "9345234582" and "Hyderabad, Gachibowli"
    Then User click on submit button
  Scenario: User to test the functionality of Eye icon
  When User click on Employer dropdown
  And User click on Registration button
  And User enter password "Path@707" into password field
  Then  User can verify the after clicking the eye icon password should be visible or not  
      
