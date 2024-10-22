import java.util.Scanner;

public class ArrayUtility {

    public static void main(String[] args) {
        // int arr[] = inputArray();
        // printArray(arr);
        int arr2D[][] = input2DArray();
        print2DArray(arr2D);
    }
    
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[][] input2DArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array. Row : ");
        int m = sc.nextInt();
        System.out.print("Column : ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "] : ");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    
    public static void printArray(int[] arr) {
        System.out.print("Array : [");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i] + "]");
            }
        }
        System.out.println();
    }

    public static void print2DArray(int[][] arr) {
        System.out.println("2D Array :");
        System.out.println("[");
        for (int i = 0; i < arr.length; i++) {
            print2D(arr[i]);
            System.out.print(",\n");
            if (i == arr.length - 1) {
                System.out.println("]");
            }
        }
    }

    public static void print2D(int[] arr) {
        System.out.print("\t[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i] + "]");
            }
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
