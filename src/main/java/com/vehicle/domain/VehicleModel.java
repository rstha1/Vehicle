package com.vehicle.domain;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class VehicleModel {

	@Id
	private int id;
	private String make;
	private String model;
	private int vehicleYear;

	public VehicleModel() {

	}

	public VehicleModel(int id, String make, String model, int vehicleYear) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.vehicleYear = vehicleYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getVehicleYear() {
		return vehicleYear;
	}

	public void setVehicleYear(int vehicleYear) {
		this.vehicleYear = vehicleYear;
	}

}
