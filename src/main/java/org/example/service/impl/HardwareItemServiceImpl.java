package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.HardwareItem;
import org.example.entity.HardwareItemEntity;
import org.example.repository.HardwareItemRepository;
import org.example.service.HardwareItemService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HardwareItemServiceImpl implements HardwareItemService {

    private final ModelMapper mapper;
    private final HardwareItemRepository repository;

    @Override
    public List<HardwareItem> getall() {
        List<HardwareItem> hardwareItemArrayList = new ArrayList<>();
        repository.findAll().forEach(entity ->{
            hardwareItemArrayList.add(mapper.map(entity, HardwareItem.class));
        });
        return hardwareItemArrayList;
    }

    @Override
    public void addHardwareItem(HardwareItem hardwareItem) {
        repository.save(mapper.map(hardwareItem, HardwareItemEntity.class));
    }

    @Override
    public HardwareItem searchHardwareItemById(Integer id) {
        return mapper.map(repository.findById(id), HardwareItem.class);

    }

    @Override
    public void deleteHardwareItemById(Integer id) {
        repository.deleteById(id);

    }

    @Override
    public void updateHardwareItemById(HardwareItem hardwareItem) {
        repository.save(mapper.map(hardwareItem, HardwareItemEntity.class));
    }
}
