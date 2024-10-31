import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem67 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("India", "New Delhi");
        map.put("USA", "New York");
        map.put("Russia", "Moscow");
        map.put("France", "Paris");
        map.put("Spain", "Madrid");
        map.put("UK", "London");

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the the country name to get capital : ");
        String str = sc.nextLine();
        System.out.printf("Capital of %s is %s.", str, map.get(str));
    }
}