package Multithreading;
// use synchronized : when a thread is already acting on an object preventing any thread from acting on the same object is called
// Thread synchronization
// Thread synchronization is recommended when multple thread threads used on the same object
// Q : Write a program to synchronize the threads acting on the same object. the synchronized block in the program can be executed only one thread
//     at a time
public class Reserve1 implements  Runnable {
    int available = 1;
    int wanted;
    //accepted wanted births at run time
    Reserve1(int i){
        wanted = i;
    }
    public void run(){
        //synchronized this current objct
        synchronized (this){
            //display available births
            System.out.println("Available births " + available);
            //if available births more than wanted birth
            if (available >= wanted){
                //get the name of the passenger
                String name = Thread.currentThread().getName();
                System.out.println(wanted + " Berth reserved for" + name);
                try {
                    Thread.sleep(1500);
                    //update the no of available births
                    available = available - wanted;
                }catch (Exception e){

                }
            }else {
                System.out.println("Sorry , no births");
            }
        }
    }
}
class Safe{
    public static void main(String[] args) {
        Reserve1 r1 = new Reserve1(1);
        //attach first thread to the obhect
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        //take the thread name as person name
        t1.setName("Ahmar Nawab");
        t2.setName("Ahsan Nawab");
        //send the request for birth
        t1.start();
        t2.start();
    }
}
