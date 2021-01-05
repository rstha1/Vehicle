package com.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.domain.VehicleModel;
import com.vehicle.domain.VehicleRecord;
import com.vehicle.service.VehicleService;

@RestController
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;
	
	@RequestMapping("/vehicleModelInfo")
	public List<VehicleModel> getAllModelInfo(){
		return vehicleService.getAllModelInfo();
	}
	
	@PostMapping("/addVehicleModelInfo")
	public void addModelInfo(@RequestBody VehicleModel modelinfo){
		vehicleService.addModelInfo(modelinfo);
	}
	
	@PutMapping("/updateVehicleModelInfo")
	public void updateModelInfo(@RequestBody VehicleModel modelinfo) {
		vehicleService.updateModelInfo(modelinfo);
	}
	
	@RequestMapping("/vehicleRecordInfo")
	public List<VehicleRecord> getAllRecordInfo(){
		return vehicleService.getRecordInfo();
	}
	
	@PostMapping("/addVehicleRecordInfo")
	public void addRecordInfo(@RequestBody VehicleRecord recordinfo) {
		vehicleService.addRecordInfo(recordinfo);
	}
	
	@PutMapping("/updateVehicleRecordInfo")
	public void updateRecordInfo(@RequestBody VehicleRecord recordinfo) {
		vehicleService.updateRecordInfo(recordinfo);
	}

}
