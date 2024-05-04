import java.util.Scanner;

public class Grade_System {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mark: ");
        int mark = scanner.nextInt();

        String grade = calculateGrade(mark);

        System.out.println("Grade: " + grade);
    }

    public static String calculateGrade(int mark) {
        if (mark >= 90 && mark <= 100) {
            return "S";
        } else if (mark >= 80 && mark < 90) {
            return "A";
        } else if (mark >= 70 && mark < 80) {
            return "B";
        } else if (mark >= 60 && mark < 70) {
            return "C";
        } else if (mark >= 50 && mark < 60) {
            return "D";
        } else if (mark >= 0 && mark < 50) {
            return "F";
        } else {
            return "Invalid mark";
        }
    }
}
