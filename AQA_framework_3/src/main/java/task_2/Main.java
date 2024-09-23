package task_2;

public class Main {

    public String compare(int v1, int v2) {

        if (v1 > v2) {
            return "Variable 'v1' is greater than 'v2'";
        } else if (v1 < v2) {
            return "Variable 'v2' is greater than 'v1'";
        } else {
            return "Both variables are equal";
        }
    }

    public String isEven(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public int maxOfThree(int n1, int n2, int n3) {
        return Math.max(n1, Math.max(n2, n3));
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.compare(10, 20));
        System.out.println(main.isEven(5));
        System.out.println(main.maxOfThree(5, 8, 1));
    }
}

// V 2: Conditional Statements
// Objective: To understand and use conditional statements in Java with primitive types.
// Instructions:
// Declare two int variables.
// Assign values to the variables and use an if-else statement to check which variable is greater.
// Print the result of the comparison to the console.
