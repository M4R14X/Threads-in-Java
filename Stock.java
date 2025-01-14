
import java.util.Stack;
public class Stock extends Stack {
    private final Stack<String> stock = new Stack<>();
    private final int capacity;
    public Stock(int capacity) {
        this.capacity = capacity;
    }
    public synchronized void addProduct(String product) throws InterruptedException {
        while (stock.size() == capacity){
            System.out.println(Thread.currentThread().getName()+" is waiting because the stock is full...");
            wait();
        }
        stock.push(product);
        System.out.println(product +" is produced by "+Thread.currentThread().getName());
        notifyAll();
    }
    public synchronized String removeProduct() throws InterruptedException {
        while (stock.isEmpty()){
            System.out.println(Thread.currentThread().getName()+" is waiting because the stock is empty...");
            wait();
        }
        String product = stock.pop();
        System.out.println(product +" is consumed by "+Thread.currentThread().getName());
        notifyAll();
        return product;
    }
}
