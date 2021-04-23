@web @regression @timeline
  Feature: Timeline feature

    Background:
      Given I am on Darksky Home Page

      @timeline-1
      Scenario: Verify timeline is displayed in correct format
        Then I verify timeline is displayed with 2 hours incremented
