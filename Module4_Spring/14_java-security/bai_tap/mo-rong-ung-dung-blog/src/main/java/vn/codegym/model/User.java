package vn.codegym.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    private String name;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",joinColumns = @JoinColumn(name = "user_name" ,referencedColumnName = "name"),
            inverseJoinColumns = @JoinColumn(name ="role_id" ,referencedColumnName = "id"))
    private Set<Role> roles;

    public User() {
    }

    public User(String name, String password, Set<Role> roles) {
        this.name = name;
        this.password = password;
        this.roles = roles;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
