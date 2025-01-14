
public class Producer extends Thread{
    private final Stock stock;
    public Producer(Stock stock, String name) {
        super(name);
        this.stock = stock;
    }
    public void run() {
        int productcount=1;
        while(true){
            try{
                String product = "Product " + productcount++;
                stock.addProduct(product);
                Thread.sleep(1000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
