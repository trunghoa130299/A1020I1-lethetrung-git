package vn.codegym.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "customerType")
    private Set<Customer> customers;

    public CustomerType() {
    }

    public CustomerType(String name, Set<Customer> customers) {
        this.name = name;
        this.customers = customers;
    }

    public CustomerType(Integer id, String name, Set<Customer> customers) {
        this.id = id;
        this.name = name;
        this.customers = customers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}
