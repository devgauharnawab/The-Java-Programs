package Multihreading;
//multiple threads acting on single object
class Reserve implements  Runnable {
    // available seat 1
    int available = 1;
    int wanted;

    //accepted wanted births at run time
    Reserve(int i){
        wanted = i;
    }
    public void  run(){
        //display available births
        System.out.println("Available Births = " + available);
        //if available births more than wanted births
        if (available >= wanted){
            //get the passenger name
            String name = Thread.currentThread().getName();
            //allot the birth to him
            System.out.println(wanted + " Berths reserves for " + name);
            try {
                Thread.sleep(1500);// wait for printing the ticket
                available = available - wanted;
            }catch (Exception e){

            }
            //if available births are less, then  display sorry
        }else {
            System.out.println("Sorry , no births ");
        }
    }
}
class Unsafe{
    public static void main(String[] args) {
        //tell that one birth is needed
        Reserve re = new Reserve(1);
        //attach first thread to the object
        Thread t1 = new Thread(re);
        //attach second thread to the same object
        Thread t2 = new Thread(re);

        //take the thread name as person name:
        t1.setName("Ahmar Nawab");
        t2.setName("Ahsan Nawab");
        //send the request for birth
        t1.start();
        t2.start();
    }
}
