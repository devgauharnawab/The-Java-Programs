package BitsManipulation;

// Question : Find the total numbers of bits needed to be flipped
 //Convert a given integer to another
// Input:
//
//x = 65 (which is 01000001 in binary)
//y = 80 (which is 01010000 in binary)
//
//Output: The total number of bits to be flipped is 2

// we have to take  XOR of the given two integers and after calculating the XOR
//problem will reduce to counting set bits in the XOR output.

public class Flipped {
    //find the total number of bits needed to be flipped to convert 'x' to 'y'
    public  static  int findBit(int x ,int y){
        // take XOR of x and y and store in n
        int n = x ^ y;

        // using Brian Kernighans algorithm to count set bits
        //count stores the total bit set in n
        int count = 0;

        while (n != 0){
            n = n &(n - 1); // clear the least singnificant bit
            count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        int x = 65;
        int y = 80;

        System.out.println(x + " in Binary is " + Integer.toBinaryString(x));
        System.out.println(y + " in Binary is " + Integer.toBinaryString(y));

        System.out.println("The total number of flipped is " + findBit(x , y));
    }
}
