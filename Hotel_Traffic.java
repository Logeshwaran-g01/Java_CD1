import java.util.Scanner;

public class Hotel_Traffic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month number (1-12): ");
        int month = scanner.nextInt();

        System.out.println("Enter the number of rooms occupied: ");
        int roomsOccupied = scanner.nextInt();

        double roomRent = calculateRoomRent(month);

        double totalRevenue = roomsOccupied * roomRent;

        System.out.println("Total Revenue: $" + totalRevenue);
    }

    public static double calculateRoomRent(int month) {
        double baseRoomRent = 100; // Base room rent
        double peakSeasonMultiplier = 1.20; // 20% increase during peak season

        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                return baseRoomRent * peakSeasonMultiplier;
            default:
                return baseRoomRent;
        }
    }
}
