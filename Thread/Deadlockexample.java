public class Deadlockexample {
    //create two resourse 
    private static final Object  resourse1=new Object();
    private static final Object  resourse2=new Object();
public static void main(String[] args) {
    //thread1 or (task 1)
    Thread t1 = new Thread(()-> {
        synchronized(resourse1){
            System.out.println("thread 1 is using resourse 1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(resourse2){
                System.out.println("thread 1 is using resourse 2");
            }
        }
    });
    // create second thread or task 1 
    Thread t2 = new Thread(()->{
        synchronized(resourse2){
            System.out.println("thread 2 is using resourse 2");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(resourse1){
                System.out.println("thread 2 is using resourse 1");
            }
        }
    });
    t1.start();
    t2.start();
}
}


// thread 1 : locked R1
// thread 1: sleep (100) wait()
//thread 2: locked R2
//thread 2: sleep (100)wati ()