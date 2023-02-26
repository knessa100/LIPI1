Feature:  Signup Feature
  @regression @smoke @sanity
  Scenario: User should be able to create a brand new email with unique email

   Given user in TalentTEK Homepage
    And User enter valid email address
    And User enter valid password
    When User clicks on Log In button
    Then User should be able to successfully login


    And when we click on the create new account button