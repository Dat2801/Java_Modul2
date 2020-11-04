import java.util.Scanner;

public class PTbacNhat {
    public static class PtBacNhat {
        public static void main(String[] args) {
            System.out.println("Linear Equation Resolver");
            System.out.println("Give a equation as 'a * x + b = c, please Enter constants: ");

            Scanner scanner = new Scanner(System.in);
            System.out.println("a: ");
            double a = scanner.nextDouble();

            System.out.println("b: ");
            double b = scanner.nextDouble();

            System.out.println("c: ");
            double c = scanner.nextDouble();

            if (a != 0) {
                double solution = -b/a;
                System.out.printf("This solution is: %f!\n", solution);
            }
            if (a != 0) {
                double answer = (c - a) / b;
                System.out.printf("Equation pass with x = %f!\n", answer);
            }else {
                if (b == 0) {
                    System.out.print("The solution is all x!");
                }else {
                    System.out.print("No solution!");
                }
            }
        }
    }
}
