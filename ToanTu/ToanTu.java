import java.util.Scanner;
public class ToanTu {
    public static void main(String[] args) {
        float weight;
        float height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight: ");
        weight = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        float area = height * weight;
        System.out.println("Area: " + area);
    }
}
