public class SNTnhohon100 {
    public static void main(String[] args) {
        System.out.println("SNT nhỏ hơn 100 là: ");
        for (int num = 1; num < 100; num++) {
            int count = 0;
            for (int i = 2; i <= Math.sqrt(num) ; i++) {
                if (num%i == 0){
                    count++;
                }
            }
            if (count == 0 && num >1)
                System.out.printf("%d\t", num);
        }
    }
}
