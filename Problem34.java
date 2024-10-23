import java.util.Scanner;

public class Problem34 {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        ArrayUtility.printArray(arr);

        System.out.print("Enter the number to find the number of occurrences of that element in array : ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        System.out.println(target + " is present in the array " + noOfOccurrences(arr, target) + " times.");
    }

    public static int noOfOccurrences(int[] arr, int target) {
        int counter = 0;

        for (int ele : arr) {
            if (target == ele) {
                counter++;
            }
        }

        return counter;
    }
}