package models;

public class Room extends Services{
    private String freeService;
    public Room(){

    }
    public Room(String id, String name, Double area, int amount, int cost, int rentalType, String freeService) {
        super(id, name, area, amount, cost, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String showInfo(){
        return "Room{" +
                "ID= " + this.getId() +
                " ,name= " + this.getName() + '\'' +
                ", area= " + this.getArea() +
                ", amount= " + this.getAmount() +
                ", cost= " + this.getCost() +
                ", rentalType= " + this.getRentalType() +
                ", freeService= " + this.getFreeService() +
                '}';
    }

    @Override
    public String toString() {
        return "Room{" +
                "ID= " + this.getId() +
                ", name= " + this.getName() + '\''+
                '}';
    }
}
