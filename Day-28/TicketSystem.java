import java.util.Scanner;

public class TicketSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Movie details
        String movieName = "Avengers: Endgame";
        double ticketPrice = 12.50;
        
        // Total 10 seats available (false = Available, true = Booked)
        boolean[] seats = new boolean[10]; 

        while (true) {
            System.out.println("\n--- Movie Ticket Booking System ---");
            System.out.println("Now Showing: " + movieName + " | Price: $" + ticketPrice);
            System.out.println("1. View Available Seats");
            System.out.println("2. Book Tickets");
            System.out.println("3. Cancel a Booking");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            
            int choice = scanner.nextInt();

            if (choice == 1) {
                // 1. View Seats
                System.out.println("\n--- Seating Arrangement ---");
                for (int i = 0; i < seats.length; i++) {
                    String status = seats[i] ? "[X] Booked" : "[ ] Available";
                    System.out.println("Seat #" + (i + 1) + ": " + status);
                }
            } 
            else if (choice == 2) {
                // 2. Book Tickets
                System.out.print("Enter Seat Number (1-10) to book: ");
                int seatNum = scanner.nextInt();
                int index = seatNum - 1; // Convert to array index

                if (index >= 0 && index < seats.length) {
                    if (seats[index]) {
                        System.out.println("Sorry, Seat #" + seatNum + " is already taken.");
                    } else {
                        seats[index] = true;
                        System.out.printf("Success! Seat #%d booked. Please pay $%.2f at the counter.\n", seatNum, ticketPrice);
                    }
                } else {
                    System.out.println("Invalid seat number. Please choose between 1 and 10.");
                }
            } 
            else if (choice == 3) {
                // 3. Cancel Booking
                System.out.print("Enter Seat Number (1-10) to cancel: ");
                int seatNum = scanner.nextInt();
                int index = seatNum - 1;

                if (index >= 0 && index < seats.length) {
                    if (!seats[index]) {
                        System.out.println("Seat #" + seatNum + " is not currently booked.");
                    } else {
                        seats[index] = false;
                        System.out.println("Success! Booking for Seat #" + seatNum + " has been canceled.");
                    }
                } else {
                    System.out.println("Invalid seat number.");
                }
            } 
            else if (choice == 4) {
                // 4. Exit
                System.out.println("Thank you for using the booking system. Enjoy your movie!");
                scanner.close();
                break;
            } 
            else {
                System.out.println("Invalid choice. Please select 1 to 4.");
            }
        }
    }
}
