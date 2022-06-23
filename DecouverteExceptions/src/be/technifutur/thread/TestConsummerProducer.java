package be.technifutur.thread;

public class TestConsummerProducer
{

    public static void main(String[] args) throws InterruptedException {

        Oven oven = new Oven();
        new Producer(oven);
        Producer producer = new Producer(oven);
        Producer producer2 = new Producer(oven);
        Consummer consummer = new Consummer(oven);
        Consummer consummer2 = new Consummer(oven);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consummer :: removeBread);
        Thread thread3 = new Thread(producer2);
        Thread thread4 = new Thread(consummer2 :: removeBread);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(200);
        oven.Closed();

    }

}
