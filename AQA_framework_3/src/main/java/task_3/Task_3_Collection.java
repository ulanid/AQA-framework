package task_3;

import java.util.LinkedList;
public class Task_3_Collection {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>(java.util.Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        list.addFirst(0);
        list.addLast(8);

        list.removeFirst();
        list.removeLast();


        System.out.print("Elements in reverse order: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}

// Make LinkedList from the result array and perform the following operations:
// a) Add an element to the beginning of the list;
// b) Add an element to the end of the list;
// c) Remove the first element from the list;
// d) Remove the last element from the list;
// e) Print the elements of the list in reverse order;