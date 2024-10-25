public class Problem45 {
    public static void main(String[] args) {
        String[] strArr = ArrayUtility.inputStrArray();
        StringBuilder sb = new StringBuilder();

        for (String str : strArr) {
            sb.append(str + " ");
        }

        System.out.println(sb.toString());
    }
}