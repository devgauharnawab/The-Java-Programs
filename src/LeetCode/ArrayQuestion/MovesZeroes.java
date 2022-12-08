package LeetCode.ArrayQuestion;
//Q : 283 Moves Zeroes
public class MovesZeroes {
    public void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void movesZeroes(int [] nums){
        int low = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                swap(nums , i , low);
                low++;
            }
        }
    }
    void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        MovesZeroes mz = new MovesZeroes();
        int[] arr = {0,1,0,3,12};
        mz.printArray(arr);
        System.out.println("THE OUTPUT IS : ");
        mz.movesZeroes(arr);
        mz.printArray(arr);
    }
}
