package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable{
    private String downloadUrl;
    private double fileSizeMB;
    private double discountedPrice;

    public DigitalProduct(Long id, String name, double price, double fileSizeMB, String downloadUrl) {
        super(id, name, price);
        this.fileSizeMB = fileSizeMB;
        this.downloadUrl = downloadUrl;
    }
    public DigitalProduct(){
        super();

    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public String getSummary() {
        return "Digital: " + getName() + " |Download: " + downloadUrl;
    }


    @Override
    public void applyDiscount(double rate) {

    }

    @Override
    public double getDiscountedPrice() {
        return 0;
    }
}
