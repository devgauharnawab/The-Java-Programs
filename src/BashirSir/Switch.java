package BashirSir;

public class Switch {
    public static void main(String[] args) {
        // if we remove the break it print all the statement
        int x = 2;// value decide which statement is execute
        switch (x){
            case 2: // this is Label -  it is basically a literal
                System.out.println("case 2");
                break;
            case 1:
                System.out.println("case 1");
                break;
            default:
                System.out.println("default");
                break;
            case 3:
                System.out.println("case 3");
                break;
        }
    }
}
