package market;

public class Wine extends Product{
    private static final double ALCOHOL_TAX_PERCENTAGE = TAX_PERCENTAGE + 10;

    public Wine(String name, String serialNumber, double price) {
        super(name, serialNumber, price);
    }

    public double alcoholTax(){
        double alcoholTax;
        alcoholTax= ALCOHOL_TAX_PERCENTAGE / 100 * getPrice();
        return alcoholTax;
    }

    @Override
    public double grossPrice() {
        double alcoholGrossPrice = super.grossPrice();
        alcoholGrossPrice = alcoholTax() + getPrice();
        return alcoholGrossPrice;
    }

    @Override
    public double tax() {
        double alcoholTax = super.tax();
        alcoholTax = alcoholTax();
        return alcoholTax;
    }
}
