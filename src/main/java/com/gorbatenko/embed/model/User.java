package com.gorbatenko.embed.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name")
    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user" , cascade = CascadeType.ALL)
    private List<Phone> phones = new ArrayList<>();

    @Embedded
    private Address address;

    public User (String name, List<Phone> phones, Address address) {
        this.name = name;
        this.address = address;
        for(Phone phone : phones) {
            phone.setUser(this);
        }
        getPhones().addAll(phones);
    }

}
