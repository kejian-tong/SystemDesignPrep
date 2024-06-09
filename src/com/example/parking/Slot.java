package com.example.parking;

/**
 * Class Slot — This class represents the space in the parking lot which will be used to park the vehicle.
 * A Parking lot will have a finite number of parking slots. This number will be initialized.
 * The parking lot will have two types of slots -
 *
 * Two Wheeler Parking Slots
 * Four Wheeler Parking Slots
 * Each slot will be having a unique slot number.
 */



public class Slot {

  private int slotNumber;
  private boolean isEmpty;
  private Vehicle parkVehicle;

  public Slot(int slotNumber) {
    this.slotNumber = slotNumber;
    isEmpty = true;
  }

  public int getSlotNumber() {
    return slotNumber;
  }

  public void setSlotNumber(int slotNumber) {
    this.slotNumber = slotNumber;
  }

  public boolean isEmpty() {
    return isEmpty;
  }

  public void setEmpty(boolean isEmpty) {
    this.isEmpty = isEmpty;
  }

  public Vehicle getParkVehicle() {
    return parkVehicle;
  }

  public void setParkVehicle(Vehicle parkVehicle) {
    this.parkVehicle = parkVehicle;
  }

  public void vacateSlot() {
    parkVehicle = null;
    this.isEmpty = true;
  }

  public void occupySlot(Vehicle parkVehicle) {
    this.parkVehicle = parkVehicle;
    this.isEmpty = false;
  }
}
