package LeetCode.ArrayQuestion;

/* 27 : Remove duplicates
    AlGO:
    step 1: taking two pointer start and end were start initialised with arr[0] and end intialised with nums.length -1
    step 2: check if start less than equal to end so we're decrement the end
    step 3: now, we check if arrOf end is equal to value (value is given in the question) then,
    step 4: swap arr[start] , arr[end]
    step 5: increment the start
    step 6: decrement the end
    step 7: finally we return end+1
* */

public class RemoveDuplicates1 {
    public int removeDuplicate(int nums[]){
        int val = 2;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            if (nums[end] == val){
                end--;
            }else if(nums[start] == val){
                int temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;
                start++;
                end--;
            }else {
                start++;
            }
        }
        return end+1;
    }
    void printArray(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveDuplicates1 rd1 = new RemoveDuplicates1();
        int arr[] = {0, 1, 2, 2, 3, 0, 4, 2};
        rd1.printArray(arr);
        System.out.println("The Array is : ");
        rd1.removeDuplicate(arr);
        rd1.printArray(arr);

    }
}
