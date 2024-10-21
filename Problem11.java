public class Problem11 {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        ArrayUtility.printArray(arr);
        System.out.println("Sum is " + sumArr(arr));
        System.out.printf("Average is %.2f", avgArr(arr));
    }
    
    public static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double avgArr(int[] arr) {
        return (double) sumArr(arr) / (double) arr.length;
    }
}
