package com.gorbatenko.embed.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class Address {
    @Column(name="street")
    private String street;

    @Column(name="city")
    private String city;

    @Column(name="country")
    private String country;
}