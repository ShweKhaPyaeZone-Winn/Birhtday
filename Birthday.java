import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println("Enter your Birthday...");
        System.out.println();
        System.out.print("Year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        System.out.print("Month: ");
        Scanner sc1 = new Scanner(System.in);
        int month = sc1.nextInt();

        System.out.print("Day: ");
        Scanner sc2 = new Scanner(System.in);
        int day = sc2.nextInt();

        LocalDate past = LocalDate.of(year, month, day);
        Period pastTotoday = Period.between(past,today);
        System.out.println("Period: " +pastTotoday);
        int days = pastTotoday.getDays();
        int months = pastTotoday.getMonths();
        int years = pastTotoday.getYears();
        System.out.printf("You are now "+"%d days, %d months, %d years "+"old.%n", days,
                months,years);
    }
}
