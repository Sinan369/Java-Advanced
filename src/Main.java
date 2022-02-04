import market.Product;
import market.Wine;


public class Main {
    public static void main(String[] args) {
        Product proizvod1 = new Product("Čokolada 500gr", "E25845815M111", 5);
        Product proizvod2 = new Wine("Bijelo Vino 0.5l", "A54748458B55", 5);

        proizvod1.print();
        proizvod1.printTaxPrice();
        System.out.println("--------------");
        proizvod2.print();
        proizvod2.printTaxPrice();
    }
}
