import java.util.Scanner;

public class ArrayUtility {

    public static void main(String[] args) {
        int arr[] = inputArray();
        printArray(arr);
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
}
