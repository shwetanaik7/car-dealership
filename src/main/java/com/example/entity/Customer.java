package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customer_id;
    private String customer_name;
    private String car_name;
    private String salesperson;
    @OneToOne(cascade = CascadeType.ALL)
  	@JoinColumn(name="car_id", referencedColumnName = "car_id")
  	Car car;
	
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	
	public String getSalesperson() {
		return salesperson;
	}
	public void setSalesperson(String salesperson) {
		this.salesperson = salesperson;
	}
}
