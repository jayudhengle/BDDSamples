Feature: Tasks CRUD Management

@SmokeTest
Scenario: Create a new Tasks
Given User is logged in
When User creates a new Tasks

@RegressionTest
Scenario: View a Tasks
Given User is logged in
When User view  Tasks details


Scenario: Delete a Tasks
Given User is logged in
When User delete a Tasks