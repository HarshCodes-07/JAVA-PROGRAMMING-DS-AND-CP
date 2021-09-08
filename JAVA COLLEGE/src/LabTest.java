import java.util.Scanner;

class WrongMarkException extends Exception {
    public WrongMarkException(String str) {
        System.out.println(str);
    }
}

public class LabTest {
    static void ProcessInput() throws WrongMarkException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 number for the array : ");
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 0 || arr[i] > 100) {
                throw new WrongMarkException("WrongMarks Exception has Occured.");
            }
        }
    }

    public static void main(String[] args) throws WrongMarkException {
        ProcessInput();
    }
}
