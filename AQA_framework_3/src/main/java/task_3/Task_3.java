package task_3;

public class Task_3 {

    public static void main(String[] args) {
        String[] a = {"one","two","three"};
        String[] b = {"apple","orange","one","two"};

        for(String e:b){
            boolean contains = false;
            for(String ee:a){
                if (e.equals(ee)){
                    contains = true;
                }
            }
            if (contains)
                System.out.println(e);
        }

    }
}

// V2.
// Array Intersection: Write a Java program that takes two arrays of integers and finds their intersection.
// Your program should prompt the user to enter the size and the elements of both arrays and then output the common elements between them.
