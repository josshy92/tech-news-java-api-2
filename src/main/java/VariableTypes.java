public class VariableTypes {
    public static void main(String[] args) {
        int number1 = 13;
        double number2 = 13.7;
        double sum1 = number1 + number2;
        String text1 = "Kurumi";

        System.out.println(sum1); // this creates a double because the sum is a decimal
        System.out.println(number1 + text1); //this creates a String because the end product is a word with a number, and int can't hold anything other than numbers
    }
}
