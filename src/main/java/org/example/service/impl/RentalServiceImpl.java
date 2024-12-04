package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Rental;
import org.example.entity.RentalEntity;
import org.example.repository.RentalRepository;
import org.example.service.RentalService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {

    private final ModelMapper mapper;
    private final RentalRepository repository;

    @Override
    public List<Rental> getall() {
        List<Rental> rentalArrayList = new ArrayList<>();
        repository.findAll().forEach(entity ->{
            rentalArrayList.add(mapper.map(entity, Rental.class));
        });
        return rentalArrayList;
    }

    @Override
    public void addRental(Rental rental) {
        repository.save(mapper.map(rental, RentalEntity.class));
    }


    @Override
    public Rental searchRentalById(Integer id) {
        return mapper.map(repository.findById(id), Rental.class);

    }

    @Override
    public void deleteRentalById(Integer id) {
        repository.deleteById(id);

    }

    @Override
    public void updateRentalById(Rental rental) {
        repository.save(mapper.map(rental, RentalEntity.class));
    }
}
