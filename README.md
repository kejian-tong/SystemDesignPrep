# Parking Lot System

This is a simple Java application that simulates a parking lot system. The system can handle two types of vehicles: two-wheelers and four-wheelers.

## Classes

The main classes in this application are:

- `Vehicle`: Represents a vehicle. Each vehicle has a number and a size (either `TWOWHEELER` or `FOURWHEELER`).
- `Ticket`: Represents a parking ticket. Each ticket has a slot number, vehicle number, vehicle size, and the date when the vehicle was parked.
- `ParkingLot`: Represents a parking lot. The parking lot can park vehicles, unpark vehicles, and initialize parking slots.

## Testing

The `TestParking` class contains unit tests for the `park` and `unPark` methods in the `ParkingLot` class. These tests check whether a `Ticket` is returned when a vehicle is parked and whether the correct parking charge is returned when a vehicle is unparked.

## Running the Tests

To run the tests, navigate to the `src/com/example/parking` directory and run the `TestParking` class.

