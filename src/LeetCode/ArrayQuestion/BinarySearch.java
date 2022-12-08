package LeetCode.ArrayQuestion;
// Given an array of integers nums which is sorted in ascending order, and an integer target,
// write a function to search target in nums. If target exists, then return its index. Otherwise,
// return -1.
//You must write an algorithm with O(log n) runtime complexity.
//Example 1:
//Input: nums = [-1,0,3,5,9,12], target = 9
//Output: 4
//Explanation: 9 exists in nums and its index is 4
public class BinarySearch {
    public int search(int[] nums , int target){
        if (nums.length == 0)return -1;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int mid = left + (right - left)/2;
            if (nums[mid] == target){
                return  mid;
            } else if (nums[mid] > target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return  - 1;
    }
    void printArray(int arr[]){
        for (int i = 0; i < arr.length;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int  arr [] = {-1 , 0, 3, 5, 9, 12};
        bs.printArray(arr);
        bs.search(arr, 9);
    }
}
