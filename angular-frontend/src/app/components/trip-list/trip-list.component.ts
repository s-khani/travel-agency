import { Component, OnInit } from '@angular/core';
import {TripService} from "../../services/trip-service/trip-service.service";
import {TripDto} from "../../models/trips";

@Component({
  selector: 'app-trip-list',
  templateUrl: './trip-list.component.html',
  styleUrls: ['./trip-list.component.css']
})
export class TripListComponent implements OnInit {

  trips: Array<TripDto> = []

  constructor(private tripService: TripService) { }

  ngOnInit(): void {
    //place for querying the backend and obtaining result
    this.tripService.getAllTrip()
      //.pipe() //TODO:delay data to present that they are availabe sometimes later
      .subscribe(value => this.trips = value)
  }

}
