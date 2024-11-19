public class Ticket {
  private String passengerName;
  private String flightNumber;
  private double baseFare;
  protected int allowedBaggage;

  public Ticket(String passengerName, String flightNumber, double baseFare) {
    this.passengerName = passengerName;
    this.flightNumber = flightNumber;
    this.baseFare = baseFare;
    this.allowedBaggage = 15;
  }

  public double calculateFare() {
    return baseFare;
  }

  public String getPassengerName() {
    return passengerName;
  }

  public String getFlightNumber() {
    return flightNumber;
  }

  public double getBaseFare() {
    return baseFare;
  }

  public int getBaggageAllowance() {
    return allowedBaggage;
  }
}
