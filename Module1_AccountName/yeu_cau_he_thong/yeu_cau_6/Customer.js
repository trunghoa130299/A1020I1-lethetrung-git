class Customer {
    constructor() {
        this.name="";
        this.cmnd="";
        this.birthday="";
        this.email="";
        this.address="";
        this.quantityIncluded="";
        this.typeService="";
        this.typeRoom="";
        this.typeCustomer="";
        this.rentDays="";
        this.discount="";
    }
    setName(name) {
        this.name = name;
    };
    getName() {
        return this.name;
    };
    setCMND(cmnd) {
        this.cmnd = cmnd;
    };
    getCMND() {
        return this.cmnd;
    };
    setBirthday(birthday) {
        this.birthday = birthday;
    };
    getBirthday() {
        return this.birthday;
    };
    setEmail(email) {
        this.email = email;
    };
    getEmail() {
        return this.email;
    };
    setAddress(address) {
        this.address = address;
    };
    getAddress() {
        return this.address;
    };
    setTypeCustomer(typeCustomer) {
        this.typeCustomer=typeCustomer;
    };
    getTypeCustomer() {
        return this.typeCustomer;
    };
    setDiscount(discount) {
        this.discount=discount;
    };
    getDiscount() {
        return this.discount;
    };
    setQuantityIncluded(quantityIncluded) {
        this.quantityIncluded=quantityIncluded;
    };
    getQuantityIncluded() {
        return this.quantityIncluded;
    };
    setTypeRoom(typeRoom) {
        this.typeRoom=typeRoom;
    };
    getTypeRoom() {
        return this.typeRoom;
    };
    setRentDays(rentDays) {
        this.rentDays=rentDays;
    };
    getRentDays() {
        return this.rentDays;
    };
    setTypeService(typeService) {
        this.typeService=typeService;
    };
    getTypeService() {
        return this.typeService;
    };
    totalPays() {
        let money=0;
        if(this.getTypeService()==="Villa"){
            money=500;
        }else if (this.getTypeService()==="House"){
            money=300;
        }else if(this.getTypeService()==="Room"){
            money=200;
        }
        return this.getRentDays()*money*(1-this.getDiscount()/100);
    }
}