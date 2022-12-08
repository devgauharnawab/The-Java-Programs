package LeetCode.ArrayQuestion;
// Question is We're given a array a or b we can sort and put in on b
public class Merge {
    void mergeDemo(int[] a,int[] b){
        int i = a.length-1;
        int k = b.length-1;
        int j = b.length - a.length- 1;
        while (i >= 0 && j >= 0){
            if (b[j] >= a[i]){
                b[k--] = b[j--];
            }else {
                b[k--] = a[i--];
            }
        }
        while(i >= 0){
            b[k--] = a[i--];
        }
    }
    void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
      //  Merge m = new Merge();
        int a [] = {2,7,15,25,32,47};
        int b [] = {5,8,38,0,0,0,0,0,0};
        Merge m = new Merge();
        m.printArray(a);
        m.printArray(b);
        m.mergeDemo(a,b);
        m.printArray(b);
    }
}
