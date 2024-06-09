package com.example.parking;

/**
 * We will be creating a custom exception named ParkingFullException -
 *
 */


public class ParkingFullException extends Exception {
  public ParkingFullException(String message) {
    super(message);
  }

}
