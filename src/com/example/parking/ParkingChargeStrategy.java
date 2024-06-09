package com.example.parking;

public interface ParkingChargeStrategy {
  int getCharge(int parkHours);

}

/**
 * Create an interface named ParkingChargeStrategy which will have getCharge method.
 * For this interface we will provide four implementations as follows -
 * If the parked vehicle is a four wheeler and it is parked on a weekday.
 */