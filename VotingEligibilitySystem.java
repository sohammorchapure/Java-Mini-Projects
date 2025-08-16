import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class VotingEligibilitySystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to VOTING ELIGIBILITY SYSTEM Project.\nTo know if you are eligible to vote, this system will tell.\n" +
                "You need to enter Your AGE and the system will calculate that you are eligible or not.\n" +
                "Remember : Firstly, It Will Calculate your Age.");

        System.out.println("Enter Your Date of Birth");
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        System.out.print("Enter Month: ");
        int month = sc.nextInt();
        System.out.print("Enter Date: ");
        int date = sc.nextInt();

        LocalDate dob = LocalDate.of(year, month, date);

        LocalDate today = LocalDate.now();

        Period p1 = Period.between(dob, today);


        System.out.println("Your Current Age is: "+ p1.getYears() + " years.");

        if (p1.getYears() >= 18) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote.");
        }


        sc.close();
    }
}