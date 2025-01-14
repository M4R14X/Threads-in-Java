public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock(5);
        Producer producer1 = new Producer(stock,"Producer 1");
        Producer producer2 = new Producer(stock,"Producer 2");
        Producer producer3 = new Producer(stock,"Producer 3");
        Consumer consumer1 = new Consumer(stock,"Consumer 1");
        Consumer consumer2 = new Consumer(stock,"Consumer 2");

        producer1.start();
        producer2.start();
        producer3.start();
        consumer1.start();
        consumer2.start();
    }
}

