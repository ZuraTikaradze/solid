package tikaradze.i.solved.shopingcart;

// processPayment  და checkItemInStock მეთოდი კონცეპტუალურად არ არიან დამოკიდებული  ShoppingCart-ზე.
// ამიტომ უნდა გავიტანოთ ცალკე ინტერფეისებად.
public interface ShoppingCart {
    void addItem(Object item);
    void removeItem(Object item);
}
