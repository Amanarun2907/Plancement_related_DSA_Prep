import java.util.Scanner;

public class largest_of_4_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input four numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        System.out.print("Enter the fourth number: ");
        int num4 = scanner.nextInt();

        int largest, secondLargest, smallest;

        // Initialize largest and smallest
        if (num1 > num2) {
            largest = num1;
            smallest = num2;
        } else {
            largest = num2;
            smallest = num1;
        }
        secondLargest = smallest; // Initialize secondLargest with smallest

        // Compare with third number
        if (num3 > largest) {
            secondLargest = largest;
            largest = num3;
        } else if (num3 > secondLargest) {
            secondLargest = num3;
        } else if (num3 < smallest) {
            secondLargest = smallest;
            smallest = num3;
        }

        // Compare with fourth number
        if (num4 > largest) {
            secondLargest = largest;
            largest = num4;
        } else if (num4 > secondLargest) {
            secondLargest = num4;
        } else if (num4 < smallest) {
            smallest = num4;
        }

        // Print the results
        System.out.println("Largest number: " + largest);
        System.out.println("Second largest number: " + secondLargest);
        System.out.println("Smallest number: " + smallest);

        // Close the scanner
        scanner.close();
    }
}


