import java.util.Scanner;

class PositiveChecker {

    public static void main (String[] sandra) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        if (num > 0) {
            System.out.println("The number is a positive number.");
        } else {
            System.out.println("The number is not a positive number.");
        }
    }  
} 
