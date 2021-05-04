package Customer;

public class Customer {
    private String name;
    private String dayOfBirth;
    private String address;
    private String url;

    public Customer() {
    }

    public Customer(String name, String dayOfBirth, String address, String url) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.address = address;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
