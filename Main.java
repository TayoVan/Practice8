import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String validInput = getValidUserInput();
        System.out.println("Опаньки перемога! Ви ввели коректний рядок: " + validInput);
    }

    public static String getValidUserInput() {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Введіть рядок (мінімум 2 слова, кожне мінімум 3 символи): ");
            input = scanner.nextLine().trim();

            if (isValid(input)) {
                return input;
            } else {
                System.out.println("Опаньки помилка! Я ж пишу що рядок має містити мінімум два слова по 3 символи! Спробуйте ще раз.");
            }
        }
    }

    private static boolean isValid(String input) {
        String[] words = input.split("\\s+");
        int validWordCount = 0;

        for (String word : words) {
            if (word.length() >= 3) {
                validWordCount++;
            }
        }

        return validWordCount >= 2;
    }
}