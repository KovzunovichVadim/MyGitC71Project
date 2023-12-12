public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Мы запускаем поток");
        Thread thread = new Thread(new MyFirstThread());
        thread.start();
        thread.join();
        System.out.println("Мы запустили поток");
    }
}