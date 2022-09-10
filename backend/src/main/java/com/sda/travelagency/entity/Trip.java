package com.sda.travelagency.entity;

import com.sda.travelagency.entity.enumeration.MealType;
import com.sda.travelagency.entity.enumeration.PaymentType;
import com.sda.travelagency.entity.enumeration.TransportType;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor (access = AccessLevel.PRIVATE)
@Builder
@Entity
public class Trip {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    LocalDate tripStartDate;
    LocalDate tripEndDate;

    //dirty fix just ignore that field
    @Transient
    Destination destination;
    @Transient
    Price tripPrice;
    @Enumerated(EnumType.STRING)
    TransportType typeOfTransport;
    @Transient
    SecurityRules securityRules;
    @Enumerated(EnumType.STRING)
    PaymentType paymentType;
    @Enumerated(EnumType.STRING)
    MealType mealType;
    @Transient
    HotelFacilities hotelFacilities;
    @Transient
    List<String> photos;

}
