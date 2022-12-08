package BashirSir;

public class Switch2 {
    public static void main(String[] args) {
        //we can use int or char together
        // if we remove the break it print all the statement
        int x = 65;
        switch (x){
            case 2: // this is Label -  it is basically a literal
                System.out.println("case 2");
                break;
            case 'A'://change to Ascii value
                System.out.println("case 1");
                break;
            default:
                System.out.println("default");
                break;
            case 10:
                System.out.println("case 3");
                break;
        }
    }
}
