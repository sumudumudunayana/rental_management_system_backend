package org.example.service;

import org.example.dto.HardwareItem;

import java.util.List;

public interface HardwareItemService {
    List<HardwareItem> getall();

    void addHardwareItem(HardwareItem hardwareItem);

    HardwareItem searchHardwareItemById(Integer id);

    void deleteHardwareItemById(Integer id);

    void updateHardwareItemById(HardwareItem hardwareItem);
}
