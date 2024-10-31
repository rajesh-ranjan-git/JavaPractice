import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem60 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(5);
        intList.add(5);
        intList.add(8);
        intList.add(5);
        intList.add(6);
        intList.add(5);
        intList.add(5);
        intList.add(2);
        intList.add(5);
        intList.add(5);
        intList.add(1);
        intList.add(5);

        System.out.println("Frequency of 5 in intList is " + Collections.frequency(intList, 5));
    }
}
