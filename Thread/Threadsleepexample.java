public class Threadsleepexample {
    public static void main(String[] args) {
        Thread firsThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("first thread count" + i);
                    Thread.sleep(500);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Thread secondThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("second thread  count" + i);
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        firsThread.start();
        secondThread.start();
    }
}

// 4-core cpu (concurrently run 8 threads)
// 8-core cpu (concurrently run 16threads)