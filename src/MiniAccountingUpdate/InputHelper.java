package MiniAccountingUpdate;

import java.time.LocalDate;
import java.util.Scanner;

public class InputHelper {
    private final Scanner scanner;

    public InputHelper(Scanner scanner) {

        this.scanner = scanner;
    }

    public int readInt(int lowerBound, int upperBound, String errorMessage) throws Exception {
        int value = scanner.nextInt();
        if (value < lowerBound || value > upperBound) {
            throw new Exception(errorMessage);
        }
        scanner.nextLine();
        return value;
    }

    public double readDouble() {
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }

    public String readString(String errorMessage) throws Exception {
        String value = scanner.nextLine();
        if (value.isEmpty() || value.equals(" ")) {
            throw new Exception(errorMessage);
        }
        return value;
    }

    public LocalDate readDate(String dateName) throws Exception {
        System.out.println("Enter Day: ");
        int day = readInt(1, 31, "Unsuccessful. Invalid " + dateName);
        System.out.println("Enter Month: ");
        int month = readInt(1, 12, "Unsuccessful. Invalid " + dateName);
        System.out.println("Enter Year: ");
        int year = readInt(2000, 2100, "Unsuccessful. Invalid " + dateName);
        return LocalDate.of(year, month, day);
    }
}
