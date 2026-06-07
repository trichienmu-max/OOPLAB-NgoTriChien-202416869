import javax.swing.JOptionPane;

public class bai225 {
    public static void main(String[] args) {

        // Input
        String strNum1 = JOptionPane.showInputDialog("Enter first number:");
        String strNum2 = JOptionPane.showInputDialog("Enter second number:");

        // Convert String → double
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        // Calculate
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        String result;

        // Check division by zero
        if (num2 != 0) {
            double quotient = num1 / num2;
            result = "Sum: " + sum +
                     "\nDifference: " + difference +
                     "\nProduct: " + product +
                     "\nQuotient: " + quotient;
        } else {
            result = "Sum: " + sum +
                     "\nDifference: " + difference +
                     "\nProduct: " + product +
                     "\nQuotient: Cannot divide by zero!";
        }

        // Output
        JOptionPane.showMessageDialog(null, result);
    }
}