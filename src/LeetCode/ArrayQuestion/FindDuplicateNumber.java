package LeetCode.ArrayQuestion;

public class FindDuplicateNumber {
    public static int findDuplicate2(int[] nums) {
        //we are using binary search and using two pointer
        int len = nums.length;
        int low = 0;
        int high = len - 1;
        while (low < high){
            //find mid element
            int mid = low + (high - low)/2;
            int count = 0;
            for (int i = 0; i < len; i++){
                if (nums[i] <= mid){
                    count++;
                }
                if (count <= mid){
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
        }
        return low;
    }
    void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        FindDuplicateNumber fd = new FindDuplicateNumber();
        int nums[] = {1, 3, 4, 2, 2};
        fd.printArray(nums);
        fd.findDuplicate2(nums);
        fd.printArray(nums);
    }
}
