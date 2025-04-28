
class myThreadclass extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("thread:" + i);
        }
    }
}

public class Threadexample {
    public static void main(String[] args) {
        myThreadclass t1 = new myThreadclass();
        t1.start();
    }
}
