Feature: Deals CRUD Management

  @SmokeTest
  Scenario: Create a new Deals
    Given User is logged in
    When User creates a new Deals

  Scenario: View a Deals
    Given User is logged in
    When User view  Deals details

  Scenario: Delete a Deals
    Given User is logged in
    When User delete a Deals
