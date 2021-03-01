package _12_java_collection_framework.bai_tap.luyen_tap_su_dung_Arraylist;

public class Product {
    private String id;
    private String name;
    private Integer amount;

    public  Product(){

    }

    public Product(String id, String name, Integer amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
