package com.george.local.postgrestestconnection.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Entity
@Table(name = "car")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Car {

    @Id
    private String id = UUID.randomUUID().toString();

    private String name;

}
