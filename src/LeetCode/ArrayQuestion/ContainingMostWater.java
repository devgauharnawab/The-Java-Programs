package LeetCode.ArrayQuestion;
// 11 : Containing Most Water
// Medium
public class ContainingMostWater {

    public int  maxArea(int []height){
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left < right){
            int currentMin = Math.min(height[left], height[right]);
            max = Math.max(max, currentMin * (right - left));
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
    void printArray(int arr []){
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.println(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        ContainingMostWater cmw = new ContainingMostWater();
        int height[] = {1 , 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("The element");
        cmw.printArray(height);
        cmw.maxArea(height);

    }
}
