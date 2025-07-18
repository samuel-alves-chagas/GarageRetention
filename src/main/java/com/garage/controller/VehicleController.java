package com.garage.controller;

import com.garage.domain.Vehicle.VehicleDTO;
import com.garage.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/add")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping
    public String addVehicle(@RequestBody VehicleDTO newVehicle) {
        return vehicleService.addVehicle(newVehicle);
    }
}
