public class MachanPractice {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        
        System.out.println("Names in the array:");
        for (String name : names) {
            System.out.println(name);
        }
        int[] numbers = {10, 20, 30, 40, 50};
        
        numbers[1] = 100;
        
        System.out.println("\nUpdated array after modifying the second element:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] moreNumbers = {5, 8, 2, 19, 13};
        
        int max = moreNumbers[0];
        for (int i = 1; i < moreNumbers.length; i++) {
            if (moreNumbers[i] > max) {
                max = moreNumbers[i];
            }
        }
        
        System.out.println("\nThe maximum value in the array is: " + max);
    }
}