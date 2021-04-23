@web @regression @accuratetemp
  Feature: Correct Temp

    Background:
      Given I am on Darksky Home Page

      @accurate-temp1
      Scenario: Verify Correct Current temperature is between the lowest and highest temperature values
        Then I verify current temp is between the lowest and highest temps from daily timeline
