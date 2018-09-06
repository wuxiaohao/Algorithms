package sort;

public class InsertSort {

    private static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) { //和j前面的元素逐个比较
                if (arr[j] < arr[j-1]) {
                    swap(arr,j,j-1);
                } else {
                    //只要j大于前面某个值，则直接跳出，因为前面只会更小
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int t = arr[j];
        arr[j] = arr[i];
        arr[i] = t;

    }

    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        InsertSort.sort(arr);
        for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i]);
            System.out.print(',');
        }
        System.out.println();
    }


}
