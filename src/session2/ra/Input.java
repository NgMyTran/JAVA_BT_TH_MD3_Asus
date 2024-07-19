package session2.ra;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Input {

    private static String getInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static String getString() {
        while (true) {
            String result = getInput();
            return result;
        }
    }

    public static char getChar() {
        return getString().charAt(0);
    }

    public static byte getByte() {
        while (true) {
            try {
                return Byte.parseByte(getInput());
            } catch (NumberFormatException errException) {
                System.err.println("Định dạng không hợp lệ");
            }
        }
    }

    public static int getInt() {
        while (true) {
            try {
                return Integer.parseInt(getString());
            } catch (NumberFormatException errException) {
                System.err.println("Định dạng không hợp lệ");
            }
        }
    }

    public static long getLong() {
        while (true) {
            try {
                return Long.parseLong(getString());
            } catch (NumberFormatException errException) {
                System.err.println("Định dạng không hợp lệ");
            }
        }
    }

    public static float getFloat() {
        while (true) {
            try {
                return Float.parseFloat(getString());
            } catch (NumberFormatException errException) {
                System.err.println("Định dạng không hợp lệ");
            }
        }
    }

    public static double getDouble() {
        while (true) {
            try {
                return Double.parseDouble(getString());
            } catch (NumberFormatException errException) {
                System.err.println("Định dạng không hợp lệ");
            }
        }
    }

    public static LocalDate getLocalDate() {
        while (true) {
            try {
                return LocalDate.parse(getInput(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            } catch (DateTimeParseException errException) {
                System.err.println("Định dạng không hợp lệ (dd/MM/yyyy)");
            }
        }
    }
}
