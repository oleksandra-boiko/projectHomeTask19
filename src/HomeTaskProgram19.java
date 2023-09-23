public class HomeTaskProgram19 {
    // + - / *
    private static void calcWithIfThen(double numA, int numB, char operation) {
        double result = 0;
        if (operation == '+') {
            result = numA + numB;
        } else if (operation == '-') {
            result = numA - numB;
        } else if (operation == '*') {
            result = numA * numB;
        } else if (operation == '/') {
            result = numA / numB;
        } else {
            System.out.println("Oops, it's incorrect operation");
        }
        if (result != 0) System.out.println("Result of " + operation + "is = " + result);
    }

    private static void calcWithSwitchCase(double numA, int numB, char operation) {
        double result = 0;
        switch (operation) {
            case '+':
                result = numA + numB;
                break;
            case '-':
                result = numA - numB;
                break;
            case '*':
                result = numA * numB;
                break;
            case '/':
                result = numA / numB;
                break;
            default:
                System.out.println("Oops, it's incorrect operation");
        }

        if (result != 0) System.out.println("Result of " + operation + "is = " + result);
    }

    public static void main(String[] args) {
        System.out.println("--- Calculation with calcWithIfThen method ---");
        calcWithIfThen(3, 9, '+');
        calcWithIfThen(3, 9, '-');
        calcWithIfThen(3, 9, '*');
        calcWithIfThen(3, 9, '/');
        calcWithIfThen(3, 9, '@');

        System.out.println("\n--- Calculation with calcWithSwitchCase method ---");
        calcWithSwitchCase(3, 9, '+');
        calcWithSwitchCase(3, 9, '-');
        calcWithSwitchCase(3, 9, '*');
        calcWithSwitchCase(3, 9, '/');
        calcWithSwitchCase(3, 9, '@');
    }
}
