import java.util.Scanner;

public class Main {
    public static String reverseString(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Опаньки! Щось почалося,введіть рядочок: ");
        String original = scanner.nextLine();
        String reversed = reverseString(original);
        System.out.println("Оригінальчик тутоньки: " + original);
        System.out.println("Змінений рядочок ось тутоньки: " + reversed);
        scanner.close();
    }
}
