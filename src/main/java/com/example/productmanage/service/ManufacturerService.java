package com.example.productmanage.service;

import com.example.productmanage.entity.Manufacturer;
import com.example.productmanage.repositories.ManufacturerRepository;

import java.util.List;

public class ManufacturerService {
    private ManufacturerRepository manufacturerRepository;

    public ManufacturerService() {
        manufacturerRepository = new ManufacturerRepository();
    }

    public Manufacturer save(Manufacturer manufacturer) {
        return manufacturerRepository.save(manufacturer);
    }

    public List<Manufacturer> getAll() {
        return manufacturerRepository.findAll();
    }

    public Manufacturer getManufacturerById(String id) {
        return manufacturerRepository.findManufacturerById(id);
    }

    public Boolean delete(String id) { return manufacturerRepository.delete(id); }

    public Manufacturer update(Manufacturer manufacturer) { return  manufacturerRepository.update(manufacturer); }

}
