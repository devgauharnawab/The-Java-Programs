package Sorting;

 // Java program for implementation of Insertion Sort
class InsertionSort {
    /*Function to sort array using insertion sort*/
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

			/* Move elements of arr[0..i-1], that are
			greater than key, to one position ahead
			of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        int arr[] = {9, 6, 5, 0, 8, 2, 7, 1, 3};

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        printArray(arr);
    }
}
/*public class InsertionSort {
    public void insertionSort(int arr[]){
        int n = arr.length;

        for (int j = 1; j < arr.length; ++j){
          int key = arr[j];
            int i = j -1;
            while (i >= 0 && arr[i] > arr[j]){
                arr[i+1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }
    }
    void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; ++i)
            System.out.print("Print sorted Array : " + arr[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int arr[] = {9, 6, 5, 0, 8, 2, 7, 1, 3};
        is.insertionSort(arr);
        is.printArray(arr);
    }
}*/


