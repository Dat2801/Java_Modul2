import java.util.Scanner;

public class PTBac2 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập hệ số bậc 2, a =");
        float a = input.nextFloat();
        System.out.println("Nhập hệ số bậc 1, b =");
        float b = input.nextFloat();
        System.out.println("Nhập hệ số tự do, c =");
        float c = input.nextFloat();
        PTBac2.giaiPTBac2(a,b,c);
    }
    public static void giaiPTBac2(float a, float b, float c){
        if (a==0) {
            if (b==0) {
                System.out.println("Phương trình vô nghiệm");
            }else {
                System.out.println("Phương trình có 1 nghiệm x =" + (-c / b) );
            }
            return;
        }

        float delta = b * b - 4 * a * c;
        float x1;
        float x2;

        if (delta>0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phương trình có 2 nghiệm: " + "x1 =" + x1 + "x2 =" + x2);
        }else if (delta == 0){
            x1 = (-b / 2 * a);
            System.out.println("Phương trình có nghiệm kép" + "x1 = x2" + x1);
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
