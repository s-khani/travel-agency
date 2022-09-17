package com.sda.travelagency.dto;

import java.util.List;

public record HotelFacilitiesDto(

        long id,

        List<AttractionDto> attractions,

        List<String> apartmentFacilities

) {
}
