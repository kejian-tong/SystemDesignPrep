/***
 * Class Vehicle — The vehicle to be parked. It has the vehicle number and the type of vehicle i.e. two-wheeler or four-wheeler.
 */


public class Vehicle {
  private String vehicleNumber;
  private String vehicleSize;

  public Vehicle(String vehicleNumber, String vehicleSize) {
    this.vehicleNumber = vehicleNumber;
    this.vehicleSize = vehicleSize;
  }

  public String getVehicleNumber() {
    return vehicleNumber;
  }

  public void setVehicleNumber(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
  }

  public String getVehicleSize() {
    return vehicleSize;
  }

  public void setVehicleSize(String vehicleSize) {
    this.vehicleSize = vehicleSize;
  }
}
