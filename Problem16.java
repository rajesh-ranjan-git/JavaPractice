public class Problem16 {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        ArrayUtility.printArray(arr);

        reverseArray(arr);
    }

    public static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            if (arr[i] != arr[j]) {
                int swapVar = arr[i];
                arr[i] = arr[j];
                arr[j] = swapVar;
            }
            i++;
            j--;
        }

        ArrayUtility.printArray(arr);
    }
}
