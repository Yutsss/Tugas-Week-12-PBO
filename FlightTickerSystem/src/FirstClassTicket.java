public class FirstClassTicket extends Ticket {
  public FirstClassTicket(String passengerName, String flightNumber, double baseFare) {
    super(passengerName, flightNumber, baseFare);
    this.allowedBaggage = 40;
  }

  @Override
  public double calculateFare() {
    return getBaseFare() * 1.5;
  }

  public void priorityBoarding() {
    System.out.println("Priority boarding service for First class.");
  }

  public void fineDining() {
    System.out.println("Offering fine dining experience to First class passengers.");
  }

  public void lieFlatSeats() {
    System.out.println("Lie-flat seats for a comfortable sleep during the flight.");
  }

  public void personalAttendant() {
    System.out.println("Personal flight attendant service for First class passengers.");
  }
}
