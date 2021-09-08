class Dheer {
    public static void main(String args[]) {
        try {
            int num1 = 30, num2 = 0;
            int output = num1 / num2;
            System.out.println("Result: " + output);
        } catch (ArithmeticException e) {
            System.out.println("You Shouldn't divide a number by zero");
        }
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception occurred");
        }
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException..");
        }
    }
}