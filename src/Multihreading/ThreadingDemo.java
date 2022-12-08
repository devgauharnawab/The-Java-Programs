package Multihreading;

 // start() method is used to begin the execution of the thread
 // we are achieving the thread using extends and runnable interface
public class ThreadingDemo extends Thread {
    public void run(){
        System.out.println("Thread is running... ");
    }
    public static void main(String[] args) {
        ThreadingDemo td = new ThreadingDemo();
        td.start();
    }
}
