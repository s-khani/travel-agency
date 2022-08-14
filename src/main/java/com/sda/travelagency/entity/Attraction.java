package com.sda.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Attraction {

    String description;

    com.sda.travelagency.entity.enumeration.ageRestrictions ageRestrictions;

    List<String> photos;
}
