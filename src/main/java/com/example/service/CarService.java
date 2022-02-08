package com.example.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Car;
import com.example.repository.CarRepository;

@Service
public class CarService {
	@Autowired
    CarRepository carRepository;


	public Iterable<Car> getCars() {
		return carRepository.findAll();
	}

	public Optional<Car> getcar(Integer id) {
		return carRepository.findById(id);
	}

	public void saveCar(@Valid Car car) {
		carRepository.save(car);
		
	}
}
