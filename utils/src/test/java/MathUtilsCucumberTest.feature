Feature: MathUtils
  Scenario Outline: Add two numbers
    Given I have numbers <num1> and <num2>
    When I add the numbers
    Then the result should be <result>

    Examples:
      | num1 | num2 | result |
      | 1    | 1    | 2      |
      | 2    | 3    | 5      |
      | 7    | 3    | 10     |
      | 0    | 5    | 5      |
