public class Problem17 {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        ArrayUtility.printArray(arr);

        boolean flag = checkPalindrome(arr);

        if (flag) {
            System.out.println("Array is palindrome.");
        } else {
            System.out.println("Array is not palindrome.");
        }
    }

    public static boolean checkPalindrome(int[] arr) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
