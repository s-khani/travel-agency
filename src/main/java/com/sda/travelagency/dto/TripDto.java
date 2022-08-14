package com.sda.travelagency.dto;

import com.sda.travelagency.entity.Destination;
import com.sda.travelagency.entity.HotelFacilities;
import com.sda.travelagency.entity.Price;
import com.sda.travelagency.entity.SecurityRules;
import com.sda.travelagency.entity.enumeration.MealType;
import com.sda.travelagency.entity.enumeration.PaymentType;
import com.sda.travelagency.entity.enumeration.TransportType;
import lombok.Builder;

import java.time.LocalDate;
import java.util.List;

@Builder
public record TripDto( LocalDate tripStartDate,
                       LocalDate tripEndDate,
                       Destination destination,
                       Price price,
                       TransportType typeOfTransport,
                       SecurityRules securityRules,
                       PaymentType paymentType,
                       MealType mealType,
                       HotelFacilities hotelFacilities,
                       List<String> photos) {


}

