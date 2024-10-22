public class Problem14 {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        ArrayUtility.printArray(arr);

        if (checkSorted(arr)) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }

    public static boolean checkSorted(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return false;
            } else if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
