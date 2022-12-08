package Sorting;

 public  class SelectionSort  {
     void selectionSort(int [] arr){
         for (int i = 0; i < arr.length - 1; i++){
             int min = i;
             for (int j = i + 1; j < arr.length; j++){
                 if (arr[j] < arr[min]){
                     min = j;
                     int temp = arr[min];
                     arr[min] = arr[i];
                     arr[i] = temp;
                 }
             }
         }
     }
     void printArray(int [] arr){
         int n = arr.length;
         for (int i = 0; i < arr.length; i++)
             System.out.print(arr[i] + " ");
         System.out.println();
     }

     public static void main(String[] args) {
         SelectionSort ss = new SelectionSort();
         int arr [] = {5, 7, 9, 3, 4, 1, 15};
         ss.printArray(arr);
         ss.selectionSort(arr);
         ss.printArray(arr);
     }
}







//arr = {5, 7, 9, 3, 4, 1, 5};
//arr [j]     >       min