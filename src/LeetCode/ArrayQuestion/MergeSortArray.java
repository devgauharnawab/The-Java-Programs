package LeetCode.ArrayQuestion;
//merging 2 arrays and put it into single array c.
/* a = {2 ,4, 10, 15, 19};
*  b = {3, 5, 20, 25, 35, 40, 42};
*  c = {2, 4, 5, 10, 15, 19, 20, 25, 35, 40, 42};
* */
public class MergeSortArray {
    int[] merge(int [] a , int [] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
        return c;
    }
    void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int [] a = {2 , 4, 10, 15, 19};
        int [] b = {3, 5, 20, 25, 35, 40, 42};
        MergeSortArray ms = new MergeSortArray();
        int c [] = ms.merge(a,b);
        ms.printArray(a);
        ms.printArray(b);
        ms.printArray(c);
    }

}
