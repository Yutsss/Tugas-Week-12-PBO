public class EconomyTicket extends Ticket {
  public EconomyTicket(String passengerName, String flightNumber, double baseFare) {
    super(passengerName, flightNumber, baseFare);
    this.allowedBaggage = 15;
  }

  @Override
  public double calculateFare() {
    return getBaseFare() * 0.9;
  }

  public void provideSnacks() {
    System.out.println("Providing in-flight snacks for Economy class.");
  }

  public void sharedEntertainment() {
    System.out.println("Access to shared in-flight entertainment system.");
  }
}
