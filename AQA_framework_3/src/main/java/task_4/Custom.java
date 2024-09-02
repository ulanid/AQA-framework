package task_4;

public class Custom {
    private int value;
    private String text;

    public Custom() {
        this.value = 0;
        this.text = "Default";
    }

    public Custom(int value) {
        this.value = value;
        this.text = "Initialized with int";
    }

    public Custom(int value, String text) {
        this.value = value;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Custom{value=" + value + ", text='" + text + "'}";
    }
}

// b) Create your own custom class with a few constructors, and make an object for it. Use getDeclaredConstructors()
// to print out all the constructors of the class and their parameter types. Choose a specific constructor and create
// a new instance of the class using newInstance(). Print out your results or processing progress.