package com.sda.travelagency.dto;


import com.sda.travelagency.entity.enumeration.MealType;
import com.sda.travelagency.entity.enumeration.PaymentType;
import com.sda.travelagency.entity.enumeration.TransportType;
import lombok.Builder;

import javax.validation.Valid;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Builder
public record TripDto(

        @Future
        LocalDate tripStartDate,

        @Future
        LocalDate tripEndDate,


        @Valid
        @NotNull
        DestinationDto destination,
        //inside dto field can have even different type
        //because dto is only for data transfer

        @NotNull
        String cost,


        @NotNull
        String currency,

        @NotNull
        TransportType typeOfTransport,

        SecurityRulesDto securityRules,


        @NotNull
        PaymentType paymentType,

        MealType mealType,

        HotelFacilitiesDto hotelFacilities,

        List<String> photos) {


}

