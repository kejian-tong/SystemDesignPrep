package com.example.parking;

/**
 * Constructs a new InvalidVehicleNumberException with the specified detail message.
 *
 * @param s the detail message
 */
public class InvalidVehicleNumberException extends Exception {
  public InvalidVehicleNumberException(String s) {
    super(s);
  }
}

/**
 * Create an exception class named InvalidVehicleNumberException.
 * This exception will be thrown if due to some reason the vehicle to be unparked cannot be found in the parking lot.
 */