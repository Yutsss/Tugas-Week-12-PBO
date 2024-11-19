public class Main {
    public static void main(String[] args) {
        Ticket economy = new EconomyTicket("John Doe", "FL123", 100.0);
        Ticket business = new BusinessTicket("Jane Smith", "FL456", 100.0);
        Ticket firstClass = new FirstClassTicket("Emily Johnson", "FL789", 100.0);

        System.out.println("Economy Ticket Fare: " + economy.calculateFare());
        ((EconomyTicket) economy).provideSnacks();
        ((EconomyTicket) economy).sharedEntertainment();
        System.out.println("Baggage Allowance: " + economy.getBaggageAllowance() + " kg");

        System.out.println("\nBusiness Ticket Fare: " + business.calculateFare());
        ((BusinessTicket) business).priorityCheckIn();
        ((BusinessTicket) business).gourmetMeals();
        ((BusinessTicket) business).personalEntertainment();
        System.out.println("Baggage Allowance: " + business.getBaggageAllowance() + " kg");

        System.out.println("\nFirst Class Ticket Fare: " + firstClass.calculateFare());
        ((FirstClassTicket) firstClass).priorityBoarding();
        ((FirstClassTicket) firstClass).fineDining();
        ((FirstClassTicket) firstClass).lieFlatSeats();
        ((FirstClassTicket) firstClass).personalAttendant();
        System.out.println("Baggage Allowance: " + firstClass.getBaggageAllowance() + " kg");
    }
}
