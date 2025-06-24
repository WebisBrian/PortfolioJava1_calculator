public enum OperationType {
    ADD('+') {
        public double apply(double a, double b) { return a + b; }
    },
    SUBTRACT('-') {
        public double apply(double a, double b) { return a -b; }
    },
    MULTIPLY('*') {
        public double apply(double a, double b) { return a * b; }
    },
    DIVIDE('/') {
        public double apply(double a, double b) {
            if (b == 0) throw new ArithmeticException("Division par zéro interdite.");
            return a / b;
        }
    };

    private final char symbol;

    OperationType(char symbol) {
        this.symbol = symbol;
    }

    public abstract double apply(double a, double b);

    public static OperationType fromChar(char c) {
        for (OperationType op : values()) {
            if (op.symbol == c) return op;
        }
        throw new IllegalArgumentException("Opération inconnue: " + c);
    }
}
