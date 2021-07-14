package vn.codegym.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int idName;
    private String img;
    private int price;
    private int amount;
    private String description;

    public Cart() {
    }

    public Cart(int id, String name, String img, int price, int amount, String description ,int idName) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
        this.amount = amount;
        this.description = description;
        this.idName = idName;
    }

    public Cart(String name, String img, int price, int amount, String description,int idName) {
        this.name = name;
        this.img = img;
        this.price = price;
        this.amount = amount;
        this.description = description;
        this.idName = idName;
    }

    public int getIdName() {
        return idName;
    }

    public void setIdName(int idName) {
        this.idName = idName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
