package BashirSir;

public interface AdapterDemo1 {
    public void addNumbWith(int num);
    public void multiplyBy(int num);
}
abstract class Adapter implements AdapterDemo1{
    public void addNumbWith(int num){};
    public void multiplyBy(int num){};
}
class Adapter10 extends Adapter{
    public void addNumbWith(int num){
        int res = num + 5;
        System.out.println("After adding 5 with num, the required number is : " + res);
    }
    public void multiplyBy(int num){
        int res = num  * 5;
        System.out.println("After multiplying 5 with num, the required number is "  + res);
    }
    public static void main(String[] args) {
        Adapter10 ad = new Adapter10();
        ad.addNumbWith(10);
        ad.multiplyBy(5);
    }
}



/*Let's now use the adapter class approach in example , we will consider that there is as an interface AdapterDemo1 and in that interface,
 * there are two methods addNumWith and multiplyNumBy:
 * now , we will have to implement this interface to our adapter class and provide the empty implementation for the addNumWith method
 * and also to multiplyNumBy,after the empty implementation,we will have to extends this Adapter Class in our Adapter!0 class,and as we 
 * and as we all know that when we would use Interface and wants to override its methods then we will have to provide the implementation 
 * for all the methods which were presents in the interface. But here, in this example, we only override that method which we will require 
 * at that time or we can say that we only override that method which we would want to use.
 */
