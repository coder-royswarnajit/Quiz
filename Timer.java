package QuizFile;
public class Timer implements Runnable {
    @Override
    public void run() {
        
            try {
                Thread.sleep(10000); // time for 2mins
                System.out.println("BOOHHH!!! THE TIME IS UP");
                System.exit(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}

