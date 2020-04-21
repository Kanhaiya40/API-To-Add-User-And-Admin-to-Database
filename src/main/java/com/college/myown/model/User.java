package com.college.myown.model;

import javax.persistence.*;
import java.util.Set;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int user_Id;
    private String user_Name;
    private String passwo;
    private String email;

    @OneToMany(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Role> role;
    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getPasswo() {
        return passwo;
    }

    public void setPasswo(String passwo) {
        this.passwo = passwo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }
}
