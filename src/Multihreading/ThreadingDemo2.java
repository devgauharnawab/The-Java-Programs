package Multihreading;
//sleep() : it is used to sleep a thread for the specified amount of time
// if the sleep time is negative then it shows exception
public class ThreadingDemo2 extends Thread {
    public void run(){
        for(int i = 1; i < 10; i++){
            try{
                //sleep time
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ThreadingDemo2 td2  = new ThreadingDemo2();
        ThreadingDemo2 td3 = new ThreadingDemo2();
        td2.start();
        td3.start();
    }
}
