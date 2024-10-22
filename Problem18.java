public class Problem18 {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtility.inputArray();
        ArrayUtility.printArray(arr1);

        int[] arr2 = ArrayUtility.inputArray();
        ArrayUtility.printArray(arr2);

        int res[] = new int[arr1.length + arr2.length - 1];

        if (arr1[0] < arr1[arr1.length - 1]) {
            res = mergeAscending(arr1, arr2);
        } else if (arr1[0] > arr1[arr1.length - 1]) {
            res = mergeDescending(arr1, arr2);
        }
        
        ArrayUtility.printArray(res);
    }

    public static int[] mergeAscending(int[] arr1, int[] arr2) {
        int temp[] = new int[arr1.length + arr2.length];

        if (arr1[0] > arr2[arr2.length - 1]) {
            for (int i = 0; i < arr2.length; i++) {
                temp[i] = arr2[i];
            }
            int t = arr2.length;
            for (int i = 0; i < arr1.length; i++) {
                temp[t] = arr1[i];
                t++;
            }
            return temp;
        } else if (arr1[arr1.length - 1] < arr2[0]) {
            for (int i = 0; i < arr1.length; i++) {
                temp[i] = arr1[i];
            }
            int t = arr1.length;
            for (int i = 0; i < arr2.length; i++) {
                temp[t] = arr2[i];
                t++;
            }
            return temp;
        }

        int i = 0;
        int j = 0;
        int k = 0;

        while (k < temp.length) {
            if (i < arr1.length && j < arr2.length && arr1[i] < arr2[j]) {
                temp[k] = arr1[i];
                System.out.println("if : " + temp[k]);
                i++;
                k++;
            } else if (j < arr2.length) {
                temp[k] = arr2[j];
                System.out.println("else : " + temp[k]);
                j++;
                k++;
            } else if (i < arr1.length) {                
                temp[k] = arr1[i];
                System.out.println("else : " + temp[k]);
                i++;
                k++;
            }
        }
        return temp;
    }

    public static int[] mergeDescending(int[] arr1, int[] arr2) {
        int temp[] = new int[arr1.length + arr2.length - 1];

        return temp;
    }
}
