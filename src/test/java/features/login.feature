Scenario: User should able to login with valid email and valid password
    Given User should be on TalentTEK homepage
    And User enter valid email address
    And User enter valid password
    When User clicks on Log In button
    Then User should be able to successfully login

Scenario: User should not able to login with valid email and invalid password
    Given User should be on TalentTEK homepage
    And  User enter valid email address
    And  User enter invalid password
    When User clicks on Log In button
    Then User should be able see "You have entered an incorrect email or student Id."

Scenario: User should not able to login with invalid email and valid password
    Given User should be on TalentTEK homepage
    And User enter invalid email address
    And User enter valid password
    When User clicks on Log In button
    Then User should be able see "You have entered an incorrect email or student Id."

Scenario: User should not able to login with invalid email and invalid password
    Given UserGiven user should be on TalentTEK homepage
    And User enter invalid email address
    And User enter invalid password
    When User clicks on Log In button
    Then User should be able to see "You have entered an incorrect email or student Id."