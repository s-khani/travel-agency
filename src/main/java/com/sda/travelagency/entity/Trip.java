package com.sda.travelagency.entity;


import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor (access = AccessLevel.PRIVATE)
@Builder
public class Trip {
    LocalDate tripStartDate;
    LocalDate tripEndDate;
    Destination destination;
    Price price;
    TransportType typeOfTransport;
    SecurityRules securityRules;
    PaymentType paymentType;
    MealType mealType;

}
