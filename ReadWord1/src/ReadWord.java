import java.util.Scanner;

public class ReadWord {
    public ReadWord() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number is read: ");
        int number = scanner.nextInt();
        String readWord;
        switch(number) {
            case 0:
                readWord = "Zero";
                break;
            case 1:
                readWord = "One";
                break;
            case 2:
                readWord = "Two";
                break;
            case 3:
                readWord = "Three";
                break;
            case 4:
                readWord = "Four";
                break;
            case 5:
                readWord = "Five";
                break;
            case 6:
                readWord = "Six";
                break;
            case 7:
                readWord = "Seven";
                break;
            case 8:
                readWord = "Eight";
                break;
            case 9:
                readWord = "Nine";
                break;
            default:
                readWord = " out of ability";
        }

        if (readWord != "") {
            System.out.printf("The '%d' read is '%s'", number, readWord);
        } else {
            System.out.print("Invite input");
        }

    }
}