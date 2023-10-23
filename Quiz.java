

public class Quiz {
    public static void main(String[] args) {
        // Create instances of the two classes
        Timer Timer = new Timer();
        Questions Questions = new Questions();

        // Create threads for each class
        Thread thread1 = new Thread(Timer);
        Thread thread2 = new Thread(Questions);

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have finished.");
    }
}
