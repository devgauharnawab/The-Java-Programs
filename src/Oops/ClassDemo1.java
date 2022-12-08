package Oops;

public class ClassDemo1 {
    int x;
    String s;
    float f;

    ClassDemo1(int a, String b, float c){
        x = a;
        s = b;
        f = c;
    }
    void  printer(ClassDemo1 ref){
        System.out.println(ref.x+ " "+ ref.s + " " + ref.f);
    }

    public static void main(String[] args) {
        ClassDemo1 cd1 = new ClassDemo1(10 , "Lucknow" , 3.2f);
        ClassDemo1 cd2 = new ClassDemo1(20, "Kanpur" , 4.5f);
        cd1.printer(cd1);
        cd1.printer(cd2);

    }
}
