package com.example.parking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * Next we will be creating a class to test the above parking logic.
 */

public class TestParking {
  private ParkingLot parkingLot;

  @BeforeEach
  public void setup() {
    parkingLot = ParkingLot.getParkingLot();
    parkingLot.initializeParkingSlots(10, 10);
  }

  @Test
  public void parkTwoWheeler() throws ParkingFullException {
    Vehicle vehicle = new Vehicle("Mh12", "TWOWHEELER");
    Ticket ticket = parkingLot.park(vehicle);
    Assertions.assertNotNull(ticket);
    Assertions.assertEquals("Mh12", ticket.getVehicleNumber());
  }

  @Test
  public void parkFourWheeler() throws ParkingFullException {
    Vehicle vehicle = new Vehicle("Mh13", "FOURWHEELER");
    Ticket ticket = parkingLot.park(vehicle);
    Assertions.assertNotNull(ticket);
    Assertions.assertEquals("Mh13", ticket.getVehicleNumber());
  }

  @Test
  public void unParkTwoWheelerReturnsCorrectCharge() throws ParkingFullException, InvalidVehicleNumberException {
    Vehicle vehicle = new Vehicle("Mh12", "TWOWHEELER");
    Ticket ticket = parkingLot.park(vehicle);
    ParkingChargeStrategy parkingChargeStrategy = new ParkingChargeStrategy() {
      @Override
      public int getCharge(int parkHours) {
        return parkHours * 5; // Mock implementation
      }
    };
    int charge = parkingLot.unPark(ticket, parkingChargeStrategy);
    Assertions.assertEquals(parkingChargeStrategy.getCharge(2), charge);
  }

  @Test
  public void unParkFourWheelerReturnsCorrectCharge() throws ParkingFullException, InvalidVehicleNumberException {
    Vehicle vehicle = new Vehicle("Mh13", "FOURWHEELER");
    Ticket ticket = parkingLot.park(vehicle);
    ParkingChargeStrategy parkingChargeStrategy = new ParkingChargeStrategy() {
      @Override
      public int getCharge(int parkHours) {
        return parkHours * 10; // Mock implementation
      }
    };
    int charge = parkingLot.unPark(ticket, parkingChargeStrategy);
    Assertions.assertEquals(parkingChargeStrategy.getCharge(2), charge);
  }
}
