@web @regression @daytemp
  Feature: Individual day temperature

    Background:
      Given I am on Darksky Home Page

      @temp
      Scenario: Verify individual day temp timeline
        When I expand today's timeline
        Then I verify lowest and highest temp is displayed correctly

