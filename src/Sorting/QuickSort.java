package Sorting;
public  class QuickSort{
    static  void swap(int arr[], int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int arr[] , int low, int high){
        int pivot = low + (high - low)/2;
        int i = (low - 1);
        for (int j = low; j <= high-1; j++){
            if (arr[j] < pivot)
                i++;
            swap(arr,i,j);
        }
        swap(arr, i+1,high);
        return (i + 1);
    }
    static  void quickSort(int arr[] , int low , int high){
        if(low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
     static  void  printArray(int arr[] , int n){
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        quickSort(arr ,0,n-1);
        System.out.println("SORTED ARRAY");
        printArray(arr,n);
    }
}



































































//public class QuickSort {
    //take three variable
    /*int partition(int [] arr, int low , int high){
        //find pivot
        int pivot = arr[(low + high)/2];
        while(low <= high){
            while (arr[low] < pivot){
                low++;
            }
            while (arr[high] > pivot){
                high--;
            }
            //swap the elements
            if(arr[low] <= arr[high]){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }
        return low;
    }
    void quickSortRecursion(int[] arr ,int low, int high){
        int pi = partition(arr, low, high);
        //sort left side
        if (low < pi - 1){
            quickSortRecursion(arr , low, pi - 1);
        }
        //sort right side
        if (pi < high){
            quickSortRecursion(arr, pi, high);
        }
    }
    void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int arr [] = {15, 9, 7, 13, 12, 16, 4, 8, 11};
        int leng = arr.length;
        qs.quickSortRecursion(arr,0,leng-1);
        qs.printArray(arr);
    }
}*/
