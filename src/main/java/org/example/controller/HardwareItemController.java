package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Customer;
import org.example.dto.HardwareItem;
import org.example.service.CustomerService;
import org.example.service.HardwareItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("hardwareItem")
public class HardwareItemController {

    @Autowired
    final HardwareItemService service;

    @GetMapping
    public List<HardwareItem> getHardwareItem(){
        return service.getall();
    }

    @PostMapping("/add-hardwareItem")
    public void addHardwareItem(@RequestBody HardwareItem hardwareItem){
        service.addHardwareItem(hardwareItem);
    }

    @GetMapping("/search-by-id/{id}")
    public HardwareItem getHardwareItemById(@PathVariable Integer id){
        return service.searchHardwareItemById(id);
    }

    @DeleteMapping("/delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteHardwareItemById(@PathVariable Integer id){
        service.deleteHardwareItemById(id);
    }

    @PutMapping("/update-hardwareItem")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateHardwareItem(@RequestBody HardwareItem hardwareItem){
        service.updateHardwareItemById(hardwareItem);
    }
}
