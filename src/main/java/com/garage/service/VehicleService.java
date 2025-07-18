package com.garage.service;

import com.garage.domain.Vehicle.VehicleDTO;
import com.garage.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public String addVehicle (VehicleDTO newVehicle){
        return newVehicle.modelName() + " added to the system";
    }
}
