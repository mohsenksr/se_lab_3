@tag
Feature: Calculator

  Scenario: add two numbers
    Given Two input values, 8 and 2
    When I get radical of a division by b the two values
    Then I expect the result 2

  Scenario Outline: add two numbers
    Given Two input values, <a> and <b>
    When I get radical of a division by b the two values
    Then I expect the result <result>
    Examples:
      | a  | b | result |
      | 4  | 1 | 2      |
      | 36 | 4 | 3      |