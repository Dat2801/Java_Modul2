import java.sql.SQLOutput;
import java.util.Scanner;

public class USD_VND {
    public static void main(String[] args) {
        double  vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền USD: ");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Giá trị VND: " + quydoi);
    }
}
