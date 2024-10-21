import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        ArrayUtility.printArray(arr);
        System.out.print("Enter the number to find the no. of occurrences : ");
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        int counter = noOfOccurrences(arr, element);
        if (counter > 0) {
            System.out.printf("The number of occurrences of %d is ", counter);
        } else {
            System.out.printf("%d was not present in the array.", element);
        }
    }

    public static int noOfOccurrences(int[] arr, int target) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                counter++;
            }
        }
        return counter;
    }
}
