import java.util.Scanner;

public class DistanceFromAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int MAX = 15;
        final double SENTINEL = 99999;

        double[] values = new double[MAX];
        int count = 0;
        double sum = 0;

        System.out.println("=== Distance From Average ===");
        System.out.println("Enter up to " + MAX + " double values.");
        System.out.println("Type " + (int)SENTINEL + " to stop.\n");

        // TODO 1: Loop while count < MAX
        // - prompt user each time
        // - read double
        // - if value == SENTINEL -> stop loop
        // - else store and increment count

        while (count < MAX) {
            System.out.println("Enter double: ");
            double num = input.nextDouble();

            if (num == SENTINEL) {
                input.close();
                break;
            } else {
                values[count] = num;
                sum =+ num;
                count++;
            }

        }

        // TODO 2: If count == 0, print:
        // "Error: No numbers entered."
        // and exit

        if (count == 0) {
            System.out.println("No numbers entered.");
            return;
        }

        // TODO 3: Compute average (sum / count)

        double average = sum / count;

        // TODO 4: Display:
        // - count
        // - average
        // - each entered value and its distance from average (value - average)
        // Tip: use printf for formatting

        System.out.println("=== FINAL OUTPUT === ");
        System.out.println("Count: " + count);
        System.out.printf("Average: %.2f%n", average);
        for (int i = 0; i < count; i++) {
            double distance = values[i] - average;
            System.out.printf("Number:  %.2f%n | Distance from Average: %.2f%n", values[i],  distance);
        }

        input.close();
    }
}
