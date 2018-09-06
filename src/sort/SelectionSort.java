package sort;

public class SelectionSort {

    private static void sort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {  // 寻找[i, n)区间里的最小值的索引
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j]<arr[minIndex]) {
                    minIndex = j; //找出最小值
                }
            }
            swap(arr, i, minIndex); //交换值
        }

    }

    private static void swap(int[] arr, int i, int minIndex) {
        int t = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = t;

    }

    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        SelectionSort.sort(arr);
        for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i]);
            System.out.print(',');
        }
        System.out.println();
    }

}
