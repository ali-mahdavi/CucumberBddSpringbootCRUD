Feature: Employee integration Bdd
  this test is for employee integration test

  Scenario : Create Employee
    Given ali is "employee"
    When call the "/api/employees"
    Then It should return "employee"

