package com.vehicle.repository;

import org.springframework.data.repository.CrudRepository;

import com.vehicle.domain.VehicleRecord;



public interface VehicleRecordRepository extends CrudRepository<VehicleRecord, Integer>{

}
