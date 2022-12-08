package BashirSir;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1221; // palindrome number is 1221
        int x = 0 , y = num;


        while (num != 0){
            x = (x * 10) + (num % 10);
            num = num/10;
        }
     //   System.out.println(x);

        //if you check palindrome
        if (x == y){
            System.out.println("palindrome");
        }else {
            System.out.println("Not palindrome");
        }

    }
}













 // Solve:
/*      x = 0        num = 2478
*       (0 * 10) + (2478 % 10)  = 247
*         0 + 8 = 8
*        (8 * 10) + 7 = 87      = 24
*         (87 * 10) + 4 = 874   = 2
*         (874 * 10) + 2 = 8742     */
