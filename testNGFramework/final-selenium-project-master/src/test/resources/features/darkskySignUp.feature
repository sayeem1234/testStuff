@web @regression @darksky
  Feature: Signup Feature

    Background:
      Given I am on the sign-up page

      @signup-1
      Scenario: Verify Invalid Registration
        When I click on register button
        Then I verify I am on register page by asserting register header




