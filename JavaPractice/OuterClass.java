package JavaPractice;

 //InnerClass types
/*Non-Static Inner Class(Inner Class)
 * Static inner Class(nested Class)
 * Anonymous Class
 * Method Local inner Class
 */

//example of non static inner class

/*Java mein non-static inner class wo class hoti hai jo kisi dusre class ke andar define ki gayi hoti 
hai lekin wo static nahi hoti. Non-static inner classes, ya inner classes ya member inner classes,
 outer class ke members ko access kar sakte hai aur outer class ke kisi bhi method me instantiate ho
 sakti hai.Ek important baat ye hai ki non-static inner class ki instance hamesha outer class ki ek instance
  ke reference ko hold karti hai.*/

  class OuterClass {
    private int x = 10;

    class InnerClass{
        public void display(){
            System.out.println("display non static inner class : " + x);
        }
    }
   /*Is example mein InnerClass OuterClass ka non-static inner class hai.
    InnerClass ki instance create karne ke liye pehle OuterClass ki instance
     create karni hogi */
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic = oc.new InnerClass();
        ic.display();
    }
}   
/*Inner classes functionality aur data encapsulate karne ke liye aur Observer pattern 
implement karne ke liye useful hote hai jismein objects
 ko notify kiya jata hai jab kisi events dusre objects mein hote hai. */
