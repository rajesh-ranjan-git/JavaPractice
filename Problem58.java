public class Problem58 {
    public static String concatenateStrings(String... str) {
        StringBuffer sb = new StringBuffer();

        for (String s : str) {
            sb.append(s);
            sb.append(" ");
        }

        return sb.toString();
    }
    
    public static void main(String[] args) {
        System.out.println("String after concatenation is : " + concatenateStrings("Rajesh", "Ranjan", "wants", "to", "become", "a", "FullStack", "Developer."));
    }
}
