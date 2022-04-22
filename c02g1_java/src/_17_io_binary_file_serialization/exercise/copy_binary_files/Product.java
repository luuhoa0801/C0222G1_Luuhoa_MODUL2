package _17_io_binary_file_serialization.exercise.copy_binary_files;

import java.io.Serializable;

public class Product implements Serializable {
    private int idProduct;
    private String name;
    private String theFirm;
    private int price;
    private String other;

    public Product() {
    }

    public Product(int idProduct, String name, String theFirm, int price, String other) {
        this.idProduct = idProduct;
        this.name = name;
        this.theFirm = theFirm;
        this.price = price;
        this.other = other;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheFirm() {
        return theFirm;
    }

    public void setTheFirm(String theFirm) {
        this.theFirm = theFirm;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", name='" + name + '\'' +
                ", theFirm='" + theFirm + '\'' +
                ", price=" + price +
                ", other='" + other + '\'' +
                '}';
    }
}
