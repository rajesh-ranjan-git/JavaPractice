public class Problem21 {
    public static void main(String[] args) {
        int[][] arr = ArrayUtility.input2DArray();
        ArrayUtility.print2DArray(arr);

        int sum = sumOf2DArray(arr);
        System.out.printf("Sum of all elements in 2D array is %d", sum);
        System.out.println();
        System.out.printf("Average of all elements in 2D array is %.2f", sum / ((double)arr.length * (double)arr[0].length));
    }

    public static int sumOf2DArray(int[][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        
        return sum;
    }
}
