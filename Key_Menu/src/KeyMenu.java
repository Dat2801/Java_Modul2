import java.util.Scanner;

public class KeyMenu {
    public static void main(String[] args) {
        System.out.println("Nhập sôs lẻ dương: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 2 > 0)
            System.out.println(number + "là số lẻ dương");
        else
            System.out.println(number + "Không phải là số lẻ dương");


    }

    public static void main1(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number < 2)
            System.out.println(number + "is not prime");
        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + "is a prime");
            else
                System.out.println(number + "is not prime");
        }

    }

    public static void main2(String[] args) {
        System.out.println("Nhập N SNT đầu tiên là: ");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int num = 1; num < N; num++) {
            int count = 0;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 0 && num > 1)
                System.out.printf("%d\t", num);
        }
    }

    public static void main3(String[] args) {
        int [] N = {};
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
    }
}

