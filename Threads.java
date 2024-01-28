public class Threads extends Thread {
    public String threadName;

    public Threads(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {
        Threads thread1 = new Threads("Thread 1");
        Threads thread2 = new Threads("Thread 2");

        thread1.start();
        thread2.start();
    }
}