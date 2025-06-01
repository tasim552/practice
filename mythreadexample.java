package mythreadexample;

public class Main {
    public static void main(String[] args) {

        // Thread using anonymous inner class
        Thread thread1 = new Thread() {
            public void run() {
                System.out.println("Thread 1 is running...");
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread 1: " + i);
                    try {
                        Thread.sleep(500); // 0.5 second pause
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }
        };

        // Thread using lambda expression
        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 is running...");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2: " + i);
                try {
                    Thread.sleep(700); // 0.7 second pause
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
