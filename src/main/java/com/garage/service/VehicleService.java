package com.garage.service;

import com.garage.domain.Vehicle.Vehicle;
import com.garage.domain.Vehicle.VehicleDTO;
import com.garage.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public Vehicle addVehicle (VehicleDTO data){
        Vehicle newVehicle = new Vehicle();
        newVehicle.setModelName(data.modelName());

        vehicleRepository.save(newVehicle);
        return newVehicle;
    }
}
