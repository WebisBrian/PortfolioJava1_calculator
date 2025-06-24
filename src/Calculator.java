public class Calculator {
    public static double calculate(double a, double b, char operation) {
        return OperationType.fromChar(operation).apply(a, b);
    }
}


