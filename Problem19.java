import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        int[][] arr = ArrayUtility.input2DArray();
        ArrayUtility.print2DArray(arr);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search : ");
        int element = sc.nextInt();

        searchElementIn2DArray(arr, element);
    }

    public static void searchElementIn2DArray(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    System.out.printf("Element is present at : [%d][%d] index.", i, j);
                    return;
                }
            }
        }
        System.out.println("Element is not present in the array.");
    }
}
