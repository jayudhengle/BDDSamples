Feature: Contacts CRUD Management

@SmokeTest
Scenario: Create a new Contacts
Given User is logged in
When User creates a new Contacts

@RegressionTest
Scenario: View a Contacts
Given User is logged in
When User view  Contacts details


Scenario: Delete a Contacts
Given User is logged in
When User delete a Contacts