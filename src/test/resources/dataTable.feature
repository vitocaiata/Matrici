Feature: calculator with dataTable

  Rule: operations with dataTable

   Scenario Outline: Sum
     Given two number <num1> and <num2>
     Then the sum is <result>
     Examples:
     |num1|num2|result|
     |10  |5   |15    |
     |20  |10  |30    |

   Scenario Outline: Difference
     Given two number <num1> and <num2>
     Then the difference is <result>
     Examples:
        |num1|num2|result|
        |10  |5   |5    |
        |20  |10  |10   |

    Scenario Outline: Multiply
      Given two number <num1> and <num2>
      Then the multiply is <result>
      Examples:
        |num1|num2|result|
        |10  |5   |50   |
        |20  |10  |200   |

    Scenario Outline: Division
      Given two number <num1> and <num2>
      Then the division is <result>
      Examples:
        |num1|num2|result|
        |10  |5   |2    |
        |20  |10  |2   |