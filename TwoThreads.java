class TwoThreads {
    private static final int MAX_NUMBER = 50;

    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> printNumbers(true));
        Thread oddThread = new Thread(() -> printNumbers(false));
        evenThread.start();
        oddThread.start();
        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void printNumbers(boolean isEven) {
        for (int i = isEven ? 2 : 1; i <= MAX_NUMBER; i += 2) {
            if (isEven) {
                System.out.println("Even Thread: " + i);
            } else {
                System.out.println("Odd Thread: " + i);
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}