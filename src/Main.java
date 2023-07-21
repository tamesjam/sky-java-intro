import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
//        String firstName = "James";
//        String lastName = "Tam";
//
//        String name = firstName + lastName;
//        System.out.println(name);

//        int num1 = 5;
//        int num2 = 10;
//        System.out.println("The sum is: " + (num1 + num2));
//
//        int result = num1 / num2;
//        System.out.println(result);
//
//        int num3 = 8;
//        System.out.println(num3++);
//        System.out.println(num3);
//        System.out.println(++num3);

        Scanner scanner = new Scanner(System.in);

        // Asking the user for first and last name for full name
//        System.out.println("Please enter your first name: ");
//        String first_name = scanner.nextLine();
//
//        System.out.println("Please enter your second name: ");
//        String second_name = scanner.nextLine();
//
//        System.out.println("Your name is: " + first_name + " " + second_name);

        // Asking the user to enter two numbers
        System.out.println("Please enter your first number: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Your sum is: " + (num1 + num2));
        scanner.close();
    }
}
