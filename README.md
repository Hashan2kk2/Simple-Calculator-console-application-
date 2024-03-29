### Simple Console Calculator Application

#### Overview
This is a simple console calculator application developed using Java. The program prompts the user to enter two numbers and an operator (+, -, *, /) to perform basic arithmetic operations. The application utilizes a switch statement to determine the operation based on the operator input and displays the result to the user.

#### Features
- User-friendly console interface for input and output.
- Supports addition, subtraction, multiplication, and division operations.
- Handles invalid operator inputs gracefully with an error message.
- Utilizes Java Scanner class for user input.

#### How to Use
1. Run the program in a Java IDE or command line environment.
2. Follow the on-screen prompts to enter two numbers and choose an operator.
3. The program will calculate the result based on the chosen operation and display it to the user.

#### Code Snippet
```java
// Create a Scanner object for user input
Scanner s = new Scanner(System.in);

// Prompt the user to enter the first number
        System.out.println("Please enter number 1");
double num1 = s.nextDouble();

// Prompt the user to enter the second number
        System.out.println("Please enter number 2");
double num2 = s.nextDouble();

// Prompt the user to enter an operator (+, -, *, /)
        System.out.println("Please enter the operator (+,-,*,/) :");
char operator = s.next().charAt(0);

// Close the Scanner object to prevent resource leaks
        s.close();

double output;
// Perform the calculation based on the operator entered
        switch (operator) {
        case '+':
            output = num1 + num2;
            break;
        case '-':
            output = num1 - num2;
            break;
        case '*':
            output = num1 * num2;
            break;
        case '/':
            output = num1 / num2;
            break;
        default:
        System.out.println("Please Enter Valid Operator");
        return;
        }

// Display the final result of the calculation
System.out.println("=========== Final Result ===========");
System.out.println(num1 + " " + operator + " " + num2 + " = " + output);
```

#### Future Enhancements
- Implement error handling for invalid number inputs.
- Add support for more complex operations or functions.
- Enhance the user interface for a more interactive experience.

Feel free to contribute to the project or customize the application based on your requirements.