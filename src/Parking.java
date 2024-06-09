/**
 *
 * Create an interface named Parking which will have park method.
 */

public interface Parking {

  public Ticket park(Vehicle vehicle) throws ParkingFullException;
  public Ticket unPark(Ticket ticket, ParkingChargeStrategy parkingChargeStrategy) throws InvalidVehicleNumberException;

}

/**
 * Finally we will be implementing the above interface to write the logic for parking the vehicle
 * and returning the ticket. This class will be a singleton class.
 *
 */