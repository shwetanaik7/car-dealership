package com.example.controller;

import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Car;
import com.example.service.CarService;

@RestController
public class CarController {
	@Autowired
	CarService carService;
	
	 @GetMapping("/ car")
		Iterable<Car> getCars() {
		      return  carService.getCars();
		 }
	 @GetMapping("/ car/{id}")
		Optional<Car> getCars(@PathVariable("id")Integer id){
			return  carService.getcar(id);
		}
	 @PostMapping("/ car")
		@Transactional
		@ResponseStatus(code = HttpStatus.CREATED)
		void createCar(@RequestBody @Valid Car  car) {
		 carService.saveCar( car);
		}
}
