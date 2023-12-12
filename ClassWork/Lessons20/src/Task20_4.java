public class Task20_4 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new CounterThread(counter));
            t.start();
        }
    }
}
