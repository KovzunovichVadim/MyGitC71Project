public class CounterThread implements Runnable {
    public Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.setCount(1);
        for (int i = 0; i < 4; i++) {
            System.out.println(counter.getCount());
            counter.increase();
        }
    }
}