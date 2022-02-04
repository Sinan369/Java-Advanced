package market;

import java.text.DecimalFormat;

public class Product {

    public static final double TAX_PERCENTAGE = 17;
    public static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.00");

    private String name, serialNumber;
    private double price;


    public Product(String name, String serialNumber, double price) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public Product() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double tax(){
        double tax = TAX_PERCENTAGE / 100 * price;
        return tax;
    }

    public double grossPrice(){
        double grossPrice;
        grossPrice = tax() + price;
        return grossPrice;
    }

    public double printNetPrice(){
        double printNetPrice;
        printNetPrice = getPrice();
        System.out.println("Neto cijena je: " + printNetPrice + " KM");
        return printNetPrice;
    }

    public double printGrossPrice(){
        double gp;
        gp = grossPrice();
        System.out.println("Bruto cijena je: " + gp + " KM");
        return gp;
    }

    public double printTaxPrice(){
        double printTax;
        printTax = tax();
        System.out.println("Porez je: " + DECIMAL_FORMAT.format(printTax) + " KM");
        return printTax;
    }

    public void print(){
        System.out.println("Ime proizvoda: " + name + " Serijski broj: " + serialNumber + " Cijena: " + DECIMAL_FORMAT.format(grossPrice())  + " KM.");
    }
}
