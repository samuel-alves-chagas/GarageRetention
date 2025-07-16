package com.garage.service;

import com.garage.dto.Vehicle;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    public String addVehicle (Vehicle newVehicle){
        return newVehicle.getModelName() + " added to the system";
    }
}
