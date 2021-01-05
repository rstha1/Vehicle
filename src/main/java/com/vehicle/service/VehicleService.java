package com.vehicle.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.domain.VehicleModel;
import com.vehicle.domain.VehicleRecord;
import com.vehicle.repository.VehicleModelRepository;
import com.vehicle.repository.VehicleRecordRepository;

@Service 
public class VehicleService {
	
	@Autowired
	private VehicleModelRepository vehicleModelRepository;
	@Autowired
	private VehicleRecordRepository vehicleRecordRepository;
	
	public List<VehicleModel> getAllModelInfo(){
		List<VehicleModel> modelinfo = new ArrayList<>();
		Iterable<VehicleModel> VM = vehicleModelRepository.findAll();
		VM.forEach(modelinfo:: add);
		return modelinfo;
	}
	
	public void addModelInfo(VehicleModel modelinfo) {
		vehicleModelRepository.save(modelinfo);
	}
	
	public void updateModelInfo(VehicleModel modelinfo) {
		List<VehicleModel> allModelInfos = this.getAllModelInfo();
		for(int i = 0; i < allModelInfos.size(); i++) {
			if(allModelInfos.get(i).getId() == modelinfo.getId()) {
				vehicleModelRepository.save(modelinfo);
			}
		}
	}

	public List<VehicleRecord> getRecordInfo(){
		List<VehicleRecord> recordinfo = new ArrayList<>();
		Iterable<VehicleRecord> VR = vehicleRecordRepository.findAll();
		VR.forEach(recordinfo:: add);
		return recordinfo;
	}
	
	public void addRecordInfo(VehicleRecord recordinfo) {
		vehicleRecordRepository.save(recordinfo);
	}
	
	public void updateRecordInfo(VehicleRecord recordinfo) {
		List<VehicleRecord> allRecordInfos = this.getRecordInfo();
		for(VehicleRecord record : allRecordInfos) {
			if(record.getId() == recordinfo.getId()) {
				vehicleRecordRepository.save(recordinfo);
			}
		}
		
	}
}
