package com.packt.cardatabase.domain;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CarRepository extends CrudRepository <Car, Long> {

    List<Car> findByBrandAndModel(String brand, String model);

   // @Query("insert into Car from Car values("Ford", "Mustang", "Red", "ADF-1121", 2017, 59000))");
    // Car("Ford", "Mustang", "Red", "ADF-1121", 2017, 59000))
    //@Query("insert into Car (brand,  model,  color, registerNumber,  year,  price) values ( 'Ford', 'Mustang','Red', 'ADF-1127', 2017, 59000)");

    // Fetch cars by brand using SQL
    @Query("select c from Car c where c.brand = ?1")
    List<Car> findByBrand(String brand);


}