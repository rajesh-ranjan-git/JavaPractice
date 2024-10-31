import java.util.HashSet;
import java.util.Set;

public class Problem64 {
    public static void main(String[] args) {
        String str = "Sayantanee";
        Set<Character> strSet = new HashSet<Character>();
        
        for (Character c : str.toCharArray()) {
                strSet.add(c);
        }

        for (char c : strSet) {
            System.out.println("Got : " + c);
        }
    }
}
