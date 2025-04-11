public class MachanPractice2 {
    String name;
    int age;
    String city;

    public MachanPractice2(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }

    public static void main(String[] args) {
        MachanPractice2 person1 = new MachanPractice2("Jasmine", 17, "Davao City");
        MachanPractice2 person2 = new MachanPractice2("Jas", 17, "Koronadal");

        System.out.println("Person 1 Details:");
        person1.displayDetails();

        System.out.println("\nPerson 2 Details:");
        person2.displayDetails();
    }
}