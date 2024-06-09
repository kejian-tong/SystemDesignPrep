package com.example.parking;

/**
 * If the parked vehicle is a four wheeler and it is parked on a weekday.
 */
public class FourWheelerWeekDayChargeStrategy implements ParkingChargeStrategy{

  @Override
  public int getCharge(int parkHours) {
    if(parkHours <= 1) {
      return 20;
    }
    return parkHours * 20;

  }
}
