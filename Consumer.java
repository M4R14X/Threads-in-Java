
public class Consumer extends Thread{
    private final Stock stock;
    public Consumer(Stock stock, String name) {
        super(name);
        this.stock = stock;
    }
    public void run() {
        while (true) {
            try{
                stock.removeProduct();
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}






