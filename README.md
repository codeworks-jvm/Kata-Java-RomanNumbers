# Kata-Java-RomanNumbers
This kata is inspired by the [roman numeral system](https://en.wikipedia.org/wiki/Roman_numerals).

## Instructions
You have to implement a converter from common numeral system to roman numeral system.

The function takes in parameter one integer and return a string.
Input number is always include between 1 and 3000.

# Rules & examples
Return a string representing the input number in the roman numeral system.
  
Examples :
  - romanNumber(1) must return "I"
  - romanNumber(90) must return "XC" (even if "XXXXXXXXX" can be considered as a good return, it's not optimal, test will fail)
  - romanNumber(567) must return "DLXVII"
  
## Code
In the `src/main/java` folder, you will find the class `App` with the function ready to be implemented.

## Test it
You can use `mvn test` to test your code.

First install the dependencies with `mvn clean install -DskipTests`. Thanks.

## Optimisation & clean code
Find the optimal form. Keep your code as clean as possible (easy to read, understandable ...).