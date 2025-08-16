import java.util.Scanner;
import java.lang.Math;


/* This is a mini calculator made by using IO Function, Scanner Class and Switch case */

class calculatorInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Press 1 for Addition.");
        System.out.println("Press 2 for Subtraction.");
        System.out.println("Press 3 for Multiplication.");
        System.out.println("Press 4 for Division.");
        System.out.println("Press 5 for Remainder.");
        System.out.println("Press 6 for Square Root.");
        System.out.println("Press 7 for Cube Root.");
        System.out.println("Press 8 for Raised to Power.");
        System.out.println("Press 9 for minimum number between two numbers.");
        System.out.println("Press 10 for maximum number between two numbers.");


        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
            case 5:
                System.out.println(num1 % num2);
                break;
            case 6:
                System.out.println("Enter a Number: ");
                int squareRoot = sc.nextInt();
                System.out.println(Math.sqrt(squareRoot));
                break;
            case 7:
                System.out.println("Enter a Number: ");
                int cubeRoot = sc.nextInt();
                System.out.println(Math.cbrt(cubeRoot));
            case 8:
                System.out.println(Math.pow(num1, num2));
                break;
            case 9:
                System.out.println(Math.min(num1, num2));
                break;
            case 10:
                System.out.println(Math.max(num1, num2));
                break;
        }
        sc.close();
    }
}