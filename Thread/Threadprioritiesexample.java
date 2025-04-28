import java.lang.Thread;

class Firstthread extends Thread {

    public void run() {
        System.out.println(getName() + "(prioities:" + getPriority() + ") is running");
    }
}

class Secondthread extends Thread {

    public void run() {
        System.out.println(getName() + "(prioities:" + getPriority() + ") is running");
    }
}

public class Threadprioritiesexample {
    public static void main(String[] args) {
        Firstthread firstthread = new Firstthread();
        Secondthread secondthread = new Secondthread();

        firstthread.setPriority(Thread.MIN_PRIORITY);
        secondthread.setPriority(Thread.MAX_PRIORITY);

        // set the name for thread
        firstthread.setName("firstThread");
        secondthread.setName("secondthread");

        firstthread.start();
        secondthread.start();

        try {
            // wait for thread to finish
            firstthread.join();
            secondthread.join();

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("all thread exectin completion");
    }
}
