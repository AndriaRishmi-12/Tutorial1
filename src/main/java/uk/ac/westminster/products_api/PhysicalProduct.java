// A PhysicalProduct IS -A Product because it shares all core attricutes and behaviors of a general product (like id, name, price) while adding specific physical properties.

//A ShoppingCart would not pass this test because it represents a HAS-A relationship. (It contains products, but it is not a product itself).



package uk.ac.westminster.products_api;

import java.io.Serializable;

public class PhysicalProduct extends Product implements Discountable {
    private double weightKg;
    private String dimensions;
    private double discountedPrice;

    public PhysicalProduct(Long id, String name, double price,double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }
    public PhysicalProduct() {
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public String getSummary() {
        return getName() + "-" + weightKg;
    }

    @Override
    public void applyDiscount(double rate) {
        double capped = Math.min(rate, 0.20);
        this.discountedPrice = getPrice() * (1 - capped);

    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
// Always write @Override so the compiler can catch typos or signature mistakes instead of silently failing or creating an unwanted overload.