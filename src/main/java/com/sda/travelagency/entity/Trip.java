package com.sda.travelagency.entity;


import com.sda.travelagency.dto.DestinationDto;
import com.sda.travelagency.entity.enumeration.MealType;
import com.sda.travelagency.entity.enumeration.PaymentType;
import com.sda.travelagency.entity.enumeration.TransportType;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor (access = AccessLevel.PRIVATE)
@Builder
public class Trip {
    LocalDate tripStartDate;
    LocalDate tripEndDate;
    DestinationDto destination;
    Price price;
    TransportType typeOfTransport;
    SecurityRules securityRules;
    PaymentType paymentType;
    MealType mealType;
    HotelFacilities hotelFacilities;
    List<String> photos;

}
