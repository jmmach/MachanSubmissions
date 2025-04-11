 
import java.util.Scanner;
 
public class MachanStudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Asking user for number of grades
        System.out.print("How many grades do you want to enter? ");
        int n = scanner.nextInt();
 
        int[] grades = new int[n];
 
        // Getting grades from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }
 
        // Display grades
        System.out.print("\nStudent Grades: ");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
 
        // Finding highest and lowest grades
        int max = grades[0], min = grades[0], sum = 0;
        for (int grade : grades) {
            if (grade > max) max = grade;
            if (grade < min) min = grade;
            sum += grade;
        }
 
        // Calculating average
        double avg = (double) sum / n;
 
        System.out.println("\nHighest Grade: " + max);
        System.out.println("Lowest Grade: " + min);
        System.out.println("Average Grade: " + avg);
    }
}