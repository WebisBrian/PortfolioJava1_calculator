import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class InputHelper {
    private static final Set<Character> OPERATORS = Set.of('+', '-', '*', '/');

    public static double askForDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Erreur : champ vide. Veuillez entrer un nombre valide.");
                continue;
            }

            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Erreur : entrée invalide. Veuillez entrer un nombre (ex : 3.14).");
            }
        }
    }

    public static char askForOperation(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            if (input.length() != 1) {
                System.out.println("Erreur : veuillez entrer un seul caractère pour l'opération (+, -, *, /).");
                continue;
            }
            char operation = input.charAt(0);
            if (OPERATORS.contains(operation)) {
                return operation;
            } else {
                System.out.println("Erreur : opération invalide. Utilisez uniquement (+, -, *, /).");
            }
        }
    }

    public static char askForContinue(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.length() != 1) {
                System.out.println("Erreur : veuillez entrer un seul caractère pour continuer ou arrêter (o/n).");
                continue;
            }

            char opinion = input.charAt(0);
            if (opinion == 'o' || opinion == 'n') {
                return opinion;
            } else {
                System.out.println("Erreur : opinion invalide. Utilisez uniquement (o/n).");
            }
        }
    }
}
