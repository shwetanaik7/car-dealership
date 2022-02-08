package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Car;

public interface CarRepository extends CrudRepository<Car, Integer> {

}
