package PatternQuestion;

public class Main5 {
    public static void main(String[] args) {
        for (int i = 5; i >=1; i--){
            for (int j = 1; j <=5; j++){
                if(j < i){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
                System.out.println();
            }
           // System.out.println(); when you print triangle
        }
    }
}
