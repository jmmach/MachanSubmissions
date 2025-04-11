public class MachanStudent {
    // Attributes
    String name;
    int age;
    double grade;
 
    // Constructor
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
 
    // Method to display student details
    void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
 
    // Overloaded methods to update grade
    void setGrade(int newGrade) {
        this.grade = newGrade;
        System.out.println("Updating grade (int)... New Grade: " + grade);
    }
 
    void setGrade(double newGrade) {
        this.grade = newGrade;
        System.out.println("Updating grade (double)... New Grade: " + grade);
    }
}
 
// Main Class
public class MachanStudent {
    public static void main(String[] args) {
        // Creating a student object
        Student student1 = new Student("John Doe", 18, 90.0);
 
        // Displaying initial details
        student1.displayStudent();
 
        // Updating grades using method overloading
        student1.setGrade(95);
        student1.setGrade(95.5);
 
        // Display updated details
        student1.displayStudent();
    }
}