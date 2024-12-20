import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem61 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        intList.add(7);
        intList.add(8);
        intList.add(9);

        System.out.println("Old list is " + intList);

        // Collections.swap(intList, 3, 4);
        swap2(intList, 3, 4);

        System.out.println("New list is " + intList);
    }

    public static void swap2(List<Integer> list, int index1, int index2) {
        int swap = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, swap);
    }
}
