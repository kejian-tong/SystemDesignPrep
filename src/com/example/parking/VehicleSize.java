package com.example.parking;

public enum VehicleSize {
  TWOWHEELER, FOURWHEELER;
}

/**
 *We will be simulating the scenario — A vehicle to be parked can be either a two-wheeler or a four-wheeler.
 * When the vehicle is to be parked, the owner will be provided a ticket. If there are no parking slots available, then a parking full exception will be thrown. When the vehicle is to be unparked, the owner must provide the ticket.
 * The parking charges will depend on -
 *
 * If it is a weekend or a weekday
 * If the vehicle is a two-wheeler or a four-wheeler
 */