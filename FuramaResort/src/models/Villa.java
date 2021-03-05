package models;

public class Villa extends Services {
    private String standardRoom;
    private String other;
    private Double areaLake;
    private int numberOfFloors;
    public Villa(){

    }

    public Villa(String id, String name, Double area, int amount, int cost, int rentalType,
                 String standardRoom, String other, Double areaLake, int numberOfFloors) {
        super(id, name, area, amount, cost, rentalType);
        this.standardRoom = standardRoom;
        this.other = other;
        this.areaLake = areaLake;
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

    public Double getAreaLake() {
        return areaLake;
    }

    public void setAreaLake(Double areaLake) {
        this.areaLake = areaLake;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    @Override
    public String showInfo(){
        return "Villa{" +
                "ID= " + this.getId() +
                ", name= " + this.getName() + '\'' +
                ", area= " + this.getArea() +
                ", amount= " + this.getAmount() +
                ", cost= " + this.getCost() +
                ", rentalType= " + this.getRentalType() +
                ", standardRoom= " + standardRoom +
                ", other= " + other +
                ", areaLake= " + areaLake +
                ", numberOfFloors= " + numberOfFloors +
                '}';
    }
}
