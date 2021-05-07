package model.bean;

public class Product {
    private int id ;
    private String name ;
    private int amount;
    private String url;

    public Product() {
    }

    public Product(int id, String name, int amount, String url) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
