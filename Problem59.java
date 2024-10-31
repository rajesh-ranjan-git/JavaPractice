import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Problem59 {    
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Bear", "Zebra", "Lion", "Ant");
        System.out.println("Old list : " + listOfStrings);
        sortInDescending(listOfStrings);
        System.out.println("New list : " + listOfStrings);
    }

    private static void sortInDescending(List<String> listOfStrings) {
        Collections.sort(listOfStrings, new Comparator<String>() {
            public int compare(String s, String s1) {
                if(s.equals(s1)) {
                    return 0;
                } else if (s.charAt(0) < s1.charAt(0)) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }
}
