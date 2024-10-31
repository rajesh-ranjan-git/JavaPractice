import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem62{
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

        Collections.reverse(intList);

        System.out.println("New list is " + intList);
    }
}
