package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HardwareItem {
    private Integer itemId;
    private String itemName;
    private String availability;
    private String finePerDay;
    private String rentalPerDay;
}
