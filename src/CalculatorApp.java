import java.util.Scanner;

public class CalculatorApp {
    public static void run(Scanner scanner) {
        displayWelcomeMessage();
        boolean continuer = true;

        while (continuer) {
            double a = getOperand(scanner, "Renseignez le premier nombre: ");
            double b = getOperand(scanner, "Renseignez le second nombre: ");
            char operation = getOperation(scanner);

            try {
                displayResult(a, b, operation, Calculator.calculate(a, b, operation));
            } catch (ArithmeticException e) {
                System.out.println("Erreur: " + e.getMessage());
            }

            continuer = (getOpinionForContinue(scanner) == 'o');
        }
    }

    private static void displayWelcomeMessage() {
        System.out.println("Bonjour et bienvenue sur l'application de Calculatrice de Brian !");
    }

    private static double getOperand(Scanner scanner, String message) {
        return InputHelper.askForDouble(scanner, message);
    }

    private static char getOperation(Scanner scanner) {
        return InputHelper.askForOperation(scanner, "Renseignez l'opération (+, -, *, /): ");
    }

    private static char getOpinionForContinue(Scanner scanner) {
        return InputHelper.askForContinue(scanner, "Souhaitez-vous effectuer un autre calcul ? (o/n) ");
    }

    private static void displayResult(double a, double b, char operation, double result) {
        System.out.println(formatResult(a, b, operation, result));
    }

    private static String formatResult(double a, double b, char operation, double result) {
        return a + " " + operation + " " + b + " = " + result;
    }
}
