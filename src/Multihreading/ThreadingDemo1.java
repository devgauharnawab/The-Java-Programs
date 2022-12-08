package Multihreading;
//when we call the start() method more than one time


public class ThreadingDemo1 extends Thread {
    public void run(){
        System.out.println("First thread is running : ");
    }
    public static void main(String[] args) {
        ThreadingDemo1 td1 = new ThreadingDemo1();
        td1.start();
        //when we are calling it shows exception
       // td1.start();     
    }
}
