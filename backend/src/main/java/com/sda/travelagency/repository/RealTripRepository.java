package com.sda.travelagency.repository;

import com.sda.travelagency.entity.*;
import com.sda.travelagency.entity.enumeration.MealType;
import com.sda.travelagency.entity.enumeration.PaymentType;
import com.sda.travelagency.entity.enumeration.TransportType;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import java.time.LocalDate;


@Profile("!develop")
public interface RealTripRepository extends TripRepository{


}
