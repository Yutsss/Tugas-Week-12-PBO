public class BusinessTicket extends Ticket {
  public BusinessTicket(String passengerName, String flightNumber, double baseFare) {
    super(passengerName, flightNumber, baseFare);
    this.allowedBaggage = 30;
  }

  @Override
  public double calculateFare() {
    return getBaseFare() * 1.25;
  }

  public void priorityCheckIn() {
    System.out.println("Priority check-in service for Business class.");
  }

  public void gourmetMeals() {
    System.out.println("Serving gourmet meals to Business class passengers.");
  }

  public void personalEntertainment() {
    System.out.println("Access to personal in-flight entertainment screen.");
  }
}
