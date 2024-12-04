package org.example.service;

import org.example.dto.Rental;

import java.util.List;

public interface RentalService {
    List<Rental> getall();

    void addRental(Rental rental);

    Rental searchRentalId(Integer id);

    void deleteRentalById(Integer id);

    void updateRentalById(Rental rental);
}
