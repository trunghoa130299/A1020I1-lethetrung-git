package models;

public class House extends Services{
    private String standardRoom;
    private String other;
    private int numberOfFloors;

    public House(){

    }

    public House(String id, String name, Double area, int amount,
                 int cost, int rentalType, String standardRoom, String other, int numberOfFloors) {
        super(id, name, area, amount, cost, rentalType);
        this.standardRoom = standardRoom;
        this.other = other;
        this.numberOfFloors = numberOfFloors;
    }
    @Override
    public String showInfo(){
        return "House{" +
                "ID= " + this.getId() +
                "name='" + this.getName() + '\'' +
                ", area=" + this.getArea() +
                ", amount=" + this.getAmount() +
                ", cost=" + this.getCost() +
                ", rentalType=" + this.getRentalType() +
                ", standardRoom= " + standardRoom +
                ", other= " + other +
                ", numberOfFloors= " + numberOfFloors +
                '}';
    }
}
