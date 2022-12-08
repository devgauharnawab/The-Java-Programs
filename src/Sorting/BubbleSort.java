package Sorting;
// Bubble Sort
public class BubbleSort {



    public void  bubbleSort(int[] arr){
        int temp = 0;

        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n-1; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    //print the array
    void  printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {5 , 1 , 6, 2, 4, 3};
        ob.bubbleSort(arr);
        System.out.println("Sorted Array is : ");
        ob.printArray(arr);

    }
}
