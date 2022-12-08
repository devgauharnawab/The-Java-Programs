package PatternQuestion;
//how to print 1 to 5 number in the form of grid
public class Main1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j<=5; j++){
                System.out.print(i + "");
            }
            System.out.println();
        }
    }
}

/* output:
   11111
   22222
   33333
   44444
   55555
* */
