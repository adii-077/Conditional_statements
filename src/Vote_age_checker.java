import java.util.Scanner;

public class Vote_age_checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your nationality: ");
        String nationality = sc.next();
        if (age >= 18 && nationality.equals("Nepali") ) {
            System.out.println("You are eligible to vote.");
        }
    }
}
