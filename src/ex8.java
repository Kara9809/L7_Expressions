import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter weight in kilograms:");
            int kilograms = scanner.nextInt();
            System.out.println("Please enter height in centimeters:");
            float centimeters = scanner.nextInt() / 100F;
            double heightSquare = Math.pow(centimeters, 2);
            System.out.println(kilograms / heightSquare);
        }
    }
}

