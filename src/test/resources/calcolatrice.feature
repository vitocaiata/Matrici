Feature: Calculator operations

  Rule: Only Calculator operations

  @Math
  Scenario: Sum two number
    Given two number 10 and 5
    Then the sum is 15

  @Math
  Scenario: Difference two number
    Given two number 10 and 5
    Then the difference is 5

  @Math
  Scenario: Multiply two number
    Given two number 10 and 5
    Then the multiply is 50

  @Math
  Scenario: Divide two number
    Given two number 10 and 5
    Then the division is 2