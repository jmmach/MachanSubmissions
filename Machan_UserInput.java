import java.util.Scanner;

public class Machan_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
 
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your height in centimeters: ");
        int height = scanner.nextInt();
 
        System.out.print("Enter your favorite number: ");
        int favoriteNumber = scanner.nextInt();
 
        int result = favoriteNumber * 2;
 
        System.out.println("Hello, " + name + "! You are " + age + " years old and " + height + " centimeters tall");
        System.out.println("Your favorite number multiplied by 2 is: " + result);
    }
}