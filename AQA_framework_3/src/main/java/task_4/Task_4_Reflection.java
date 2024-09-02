package task_4;

import java.lang.reflect.Constructor;
public class Task_4_Reflection {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Custom.class;

            Constructor<?>[] constructors = clazz.getDeclaredConstructors();

            System.out.println("Declared Constructors:");

            for (Constructor<?> constructor : constructors) {
                String params = String.join(", ",
                        java.util.Arrays.stream(constructor.getParameterTypes())
                                .map(Class::getSimpleName)
                                .toArray(String[]::new));
                System.out.println(constructor.getName() + "(" + params + ")");
            }

            Constructor<?> specificConstructor = clazz.getDeclaredConstructor(int.class, String.class);
            Object instance = specificConstructor.newInstance(27, "Hello");

            System.out.println("\nCreated Instance:");
            System.out.println(instance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
