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

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String showInfo(){
        return "House{" +
                "ID= " + this.getId() +
                " ,name= " + this.getName() + '\'' +
                ", area= " + this.getArea() +
                ", amount= " + this.getAmount() +
                ", cost= " + this.getCost() +
                ", rentalType= " + this.getRentalType() +
                ", standardRoom= " + this.getStandardRoom() +
                ", other= " +this.getOther() +
                ", numberOfFloors= " + this.getNumberOfFloors() +
                '}';
    }

    @Override
    public String toString() {
        return "House{" +
                "ID= " + this.getId() +
                ", name= " + this.getName() + '\''+
                '}';
    }
}
