package sort;

public class BubbleSort {

    private static void sort(int[] arr) {

        int n = arr.length;
        for (int i= 0; i < n-1; i++) {
            for (int j = i + 1; j < n -1 - i ; j++) {
                if (arr[j] > arr[j+1]) { //前面的数>后面的数
                    swap(arr,j+1, j);
                }
            }
        }

    }

    private static void swap(int[] arr, int j, int i) {
        int t = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = t;

    }

    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        BubbleSort.sort(arr);
        for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i]);
            System.out.print(',');
        }
        System.out.println();
    }
}
