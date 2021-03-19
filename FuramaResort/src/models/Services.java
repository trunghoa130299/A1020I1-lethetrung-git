package models;

import java.util.Objects;

public abstract class Services implements Comparable<Services> {
    private String id;
    private String name;
    private Double area;
    private int amount;
    private int cost;
    private int rentalType;

    public Services() {
    }

    public Services(String id, String name, Double area, int amount, int cost, int rentalType) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.amount = amount;
        this.cost = cost;
        this.rentalType = rentalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getRentalType() {
        return rentalType;
    }

    public void setRentalType(int rentalType) {
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String showInfo() {
        return "Services{" +
                "ID= " + id +
                "name='" + name + '\'' +
                ", area=" + area +
                ", amount=" + amount +
                ", cost=" + cost +
                ", rentalType=" + rentalType +
                '}';
    }

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", amount=" + amount +
                ", cost=" + cost +
                ", rentalType=" + rentalType +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Services services = (Services) o;
//        return name.equals(services.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }

    @Override
    public int compareTo(Services o) {
        return this.getName().compareTo(o.getName());
    }
}
