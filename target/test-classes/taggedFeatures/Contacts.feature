@PhaseTwo
Feature: Contacts CRUD Management

  Background: User Login
    Given User is logged in

  @SmokeTest
  Scenario: Create a new Contacts
    When User creates a new Contacts

  @RegressionTest
  Scenario: View a Contacts
    When User view  Contacts details

  Scenario: Delete a Contacts
    When User delete a Contacts
