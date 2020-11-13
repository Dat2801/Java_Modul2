public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint bi1 = new MoveablePoint(3, 4);
        bi1.setY(1);
        bi1.setX(2);
        System.out.print(bi1);
        bi1.move();
        System.out.print(bi1);
    }
}
