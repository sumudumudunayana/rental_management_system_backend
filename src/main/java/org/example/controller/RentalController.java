package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Rental;
import org.example.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("rental")
public class RentalController {

    @Autowired
    final RentalService service;

    @GetMapping("/get-all")
    public List<Rental> getRental(){
        return service.getall();
    }

    @PostMapping("/add-rental")
    public void addRental(@RequestBody Rental rental){
        service.addRental(rental);
    }

    @GetMapping("/search-by-id/{id}")
    public Rental getRentalById(@PathVariable Integer id){
        return service.searchRentalById(id);
    }

    @DeleteMapping("/delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteRentalById(@PathVariable Integer id){
        service.deleteRentalById(id);
    }

    @PutMapping("/update-rental")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateRental(@RequestBody Rental rental){
        service.updateRentalById(rental);
    }
}
