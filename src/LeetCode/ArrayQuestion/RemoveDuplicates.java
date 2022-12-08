package LeetCode.ArrayQuestion;
// 26 remove duplicates from sorted array :
//   ALGORITHM
/* Steps to solve the problem :
*   0: taking a variable current assign with nums[0]*
*   1: check if nums.length equal 0 it means our array is empty simply we return 0
*   2: taking a second variable which is count intialised it 1
*   3: run loop for 0 <---- nums.length
*   4: check if current is equal to nums[i] we can continue
*   5: otherwise, nums[count] = nums[i]
*   6: current equals nums[i]
*   7: increment the count
*   8: return count */

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums){
        if (nums.length == 0)return 0;
        int curr = nums[0];
        int count = 1;
        for (int i = 0; i < nums.length; ++i){
            if (curr == nums[i]){
                continue;
            }else {
                nums[count] = nums[i];
                curr = nums[i];
                count++;
            }
        }
        return count;
    }
    void printArray(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        int arr[] = {0, 1, 1, 2};
        rd.printArray(arr);
        rd.removeDuplicates(arr);
        rd.printArray(arr);
    }
}
