import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter player name:");
            String namePlayer = scanner.next();
            System.out.println("Please enter team name:");
            String nameTeam = scanner.next();
            System.out.println("Please enter age");
            float age = scanner.nextFloat();
            int goalsNumber = randomWithRange(150, 1000);
            System.out.println("Goals: " + goalsNumber);
            if (goalsNumber > 600) {
                System.out.println(" WOW");
            }
            System.out.printf("%s, %s, %s", namePlayer, nameTeam, age);

        }
    }

    public static int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }
}