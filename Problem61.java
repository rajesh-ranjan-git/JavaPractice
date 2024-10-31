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

        swap(intList, 3, 4);

        System.out.println("New list is " + intList);
    }

    @SuppressWarnings("unchecked")
    public static void swap(List list, int index1, int index2) {
        int swap = (int) list.get(index1);
        list.add(index1, list.get(index2));
        list.remove(index2);
        list.add(index2, swap);
        list.remove(index2 + 1);
    }
}
