import java.util.Date;

/**
 * Class Ticket — Once the vehicle has been parked, the owner will be provided with the Ticket.
 * It will have the slotNumber, vehicle number, time at which the vehicle has been parked and the vehicle size.
 */


public class Ticket {

  private int slotNumber;
  private String vehicleNumber;
  private Date date;
  private VehicleSize vehicleSize;

  public Ticket(int slotNumber, String vehicleNumber, VehicleSize vehicleSize, Date date) {
    super();
    this.slotNumber = slotNumber;
    this.vehicleNumber = vehicleNumber;
    this.setVehicleSize(vehicleSize);
    this.date = date;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public int getSlotNumber() {
    return slotNumber;
  }

  public void setSlotNumber(int slotNumber) {
    this.slotNumber = slotNumber;
  }

  public String getVehicleNumber() {
    return vehicleNumber;
  }

  public void setVehicleNumber(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
  }

  public VehicleSize getVehicleSize() {
    return vehicleSize;
  }

  public void setVehicleSize(VehicleSize vehicleSize) {
    this.vehicleSize = vehicleSize;
  }

  @Override
  public String toString() {
    return "Ticket [slotNumber=" + slotNumber + ", vehicleNumber=" + vehicleNumber + ", date=" + date
        + ", vehicleSize=" + vehicleSize + "]";
  }

}
