package tikaradze.d.solved;


// Hight level class
public class PaymentProcessor {

    public void pay(String productId) {
        SqlProductRepo repo = new SqlProductRepo();
        Object product = repo.getProductById("1");
        this.processPayment(product);
    }

    public void processPayment(Object product) {
        // logic
    }
}
