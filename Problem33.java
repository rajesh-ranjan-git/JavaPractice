public class Problem33 {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        ArrayUtility.printArray(arr);

        int max = Integer.MIN_VALUE;

        for (int ele : arr) {
            if (max < ele) {
                max = ele;
            }
        }

        System.out.println("Maximum of array is : " + max);
    }
}