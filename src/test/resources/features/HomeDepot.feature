Feature: HomeDepot rental request

  @NegativeRequest
  Scenario: Untimely request
    Given the user want to go to HomeDepot website
    And verify the Url "https://www.homedepot.ca/en/home.html"
    Then the user want to navigate to Rental module
    And verify the header tittle "Tool, Vehicle & Equipment Rental"
    Then the user want to choose Closed Trailer
    And click Request Reservation
    And verify header "Request Reservation"
    Then click on calendar and choose tomorrow
    And click on time dropdown and choose "6 AM"
    Then verify a massage "No availability for this time. Please select a different time."


