public class Number {
    private int firstNumber = 2;
    private int secondNumber = 3;

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int sum() {
        int value = this.firstNumber + this.secondNumber;
        return value;
    }

    public float divine() {
        float value1 = (float) this.firstNumber / this.secondNumber;
        return value1;
    }

    public int mutilfly() {
        int value2 = this.firstNumber * this.secondNumber;
        return value2;
    }

    public void minus() {
        int value3 = this.firstNumber - this.secondNumber;
    }
}
