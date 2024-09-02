package task_3;

public class Task_3_Exception {
    public static void main(String[] args) {

        int num = 5;

        try{
            int result = num/0;
        } catch (ArithmeticException e){
            System.err.println("Cannot divide by 0");
        }
    }
}

// Make up the situation for ArithmeticException. Catch it and display the explanation for your custom case.