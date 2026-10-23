package uk.ac.westminster.products_api;

public class DigitalProduct extends Product{
    private String downloadUrl;
    private double fileSizeMB;

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


}
