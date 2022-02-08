package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer car_id;
    private String car_numberplate;
	private Integer service_number;
    private String mechanic;
    private String service;
    @OneToOne(mappedBy ="car")
	Customer customer;
    public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Integer getCar_id() {
		return car_id;
	}
	public void setCar_id(Integer car_id) {
		this.car_id = car_id;
	}
	public String getCar_numberplate() {
		return car_numberplate;
	}
	public void setCar_numberplate(String car_numberplate) {
		this.car_numberplate = car_numberplate;
	}
	public Integer getService_number() {
		return service_number;
	}
	public void setService_number(Integer service_number) {
		this.service_number = service_number;
	}
	public String getMechanic() {
		return mechanic;
	}
	public void setMechanic(String mechanic) {
		this.mechanic = mechanic;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
}
