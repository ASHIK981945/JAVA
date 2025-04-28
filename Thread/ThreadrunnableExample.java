import java.lang.Runnable;

class mythreadrunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("runnable:" + i);
        }
    }
}

public class ThreadrunnableExample {

    public static void main(String[] args) {
        Runnable runnable = new mythreadrunnable();
        Thread t1 = new Thread(runnable);
        t1.start();
    }
}
