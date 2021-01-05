package com.vehicle.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VehicleRecord {

	@Id	
	private int id;
	private long mileage;
	private String vehicleCondition;
	private String color;
	private String problem;
	private int vehicleModel_ID;
	
	public VehicleRecord() {
		
	}
	
	public VehicleRecord(int id, long mileage, String vehicleCondition, String color, String problem,
			int vehicleModel_ID) {
		super();
		this.id = id;
		this.mileage = mileage;
		this.vehicleCondition = vehicleCondition;
		this.color = color;
		this.problem = problem;
		this.vehicleModel_ID = vehicleModel_ID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getMileage() {
		return mileage;
	}

	public void setMileage(long mileage) {
		this.mileage = mileage;
	}

	public String getVehicleCondition() {
		return vehicleCondition;
	}

	public void setVehicleCondition(String vehicleCondition) {
		this.vehicleCondition = vehicleCondition;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public int getVehicleModel_ID() {
		return vehicleModel_ID;
	}

	public void setVehicleModel_ID(int vehicleModel_ID) {
		this.vehicleModel_ID = vehicleModel_ID;
	}

	



}
