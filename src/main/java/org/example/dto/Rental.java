package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Rental {
    private Integer rentId;
    private Integer rentalDate;
    private Integer returnDate;
    private Integer dueDate;
    private Integer totalCost;
    private String customerName;
    private Integer itemId;
    private String itemName;
}
