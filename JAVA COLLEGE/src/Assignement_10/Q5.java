package Assignement_10;

public class Q5 {
    public String USN;

    Q5(String str) {
        USN = str;
    }

    void checkUSN() {
        //rule 1
        if (USN.length() != 10) {
            System.out.println("FAILURE");
            return;
        }
        for (int i = 0; i < USN.length(); i++) {
            if (Character.isLetter(USN.charAt(i))) {
                if (!Character.isUpperCase(USN.charAt(i))) {
                    System.out.println("FAILURE");
                    return;
                }
            }
        }
        //rule 2
        if (USN.charAt(0) != '1' && USN.charAt(0) != '2') {
            System.out.println("FAILURE");
            return;
        }
        //rule 3
        if (!Character.isUpperCase(USN.charAt(1)) || !Character.isUpperCase(USN.charAt(2))) {
            System.out.println("FAILURE");
            return;
        }
        //rule 4
        if (!Character.isDigit(USN.charAt(3)) || !Character.isDigit(USN.charAt(4))) {
            System.out.println("FAILURE");
            return;
        }
        //rule 5
        String r3 = USN.charAt(5) + "" + USN.charAt(6);
        if (!r3.equals("CS") && !r3.equals("EC") && !r3.equals("IS") && !r3.equals("ME")) {
            System.out.println("FAILURE");
            return;
        }
        //rule 6
        if (!Character.isDigit(USN.charAt(7)) || !Character.isDigit(USN.charAt(8)) || !Character.isDigit(USN.charAt(9))) {
            System.out.println("FAILURE");
            return;
        }
        // IF NOT RETURNED YET
        System.out.println("SUCCESS");
    }
}


class TestUSN {
    public static void main(String[] args) {
        Q5 obj = new Q5("1DS09CS010");
        obj.checkUSN();
    }
}
