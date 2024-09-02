package task_4;

public class Task_4_Generic {
    public static void main(String[] args) {
        Processor<String> processor = new StringProcessor();

        processor.process("I'm hungry");
    }
}

// c) Create a generic interface that defines a method that takes a parameter of any type, and implements the interface
// with a concrete class that specifies the type using interface and implements.