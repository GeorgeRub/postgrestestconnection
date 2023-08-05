package com.george.local.postgrestestconnection.repositories;

import com.george.local.postgrestestconnection.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, String> {
}
