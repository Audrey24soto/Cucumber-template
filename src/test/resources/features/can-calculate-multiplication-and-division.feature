#Author: Audrey24soto@qa.com

#As a user, I need to divide two numbers for use in another calculation.
#As a user, I want to multiply two numbers to find the result.

Feature: Can multiply and divide numbers with calculator?
  To test wheate the calculator works
  
  Todo:
  - Implement multiply
  - Implement division

  
  Scenario: 9 multiply 9 is 81
    Given a New Calculator
    When Can the Calculator multiply 9 by 9
    Then the answer should be 81

 
  Scenario: 6 divided 3 is 2
    Given a New Calculator
    When the Calculator divides 6 by 3
    Then the answer should be 2

   