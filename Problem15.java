import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        ArrayUtility.printArray(arr);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to delete : ");
        int element = sc.nextInt();

        int[] res = deleteElementFromArray(arr, element);
        ArrayUtility.printArray(res);
    }

    public static int[] deleteElementFromArray(int[] arr, int target) {
        int temp[] = new int[arr.length - ArrayUtility.noOfOccurrences(arr, target)];
        int i = 0, j = 0;

        while (i < arr.length) {
            if (target != arr[i]) {
                temp[j] = arr[i];
                j++;
            }
            i++;
        }

        return temp;
    }
}
