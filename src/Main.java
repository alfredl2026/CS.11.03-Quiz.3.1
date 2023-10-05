public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int num){
        if (num >= 90) {
            return 'A';
        }
        else if (num >= 80 && num <= 89) {
            return 'B';
        }
        else if (num >= 70 && num <= 79) {
            return 'C';
        }
        else if (num >= 60 && num <= 69) {
            return 'D';
        }
        else if (num >= 50 && num <= 59) {
            return 'E';
        }
        else if (num <= 49) {
            return 'F';
        }
        return 0;
    }
    // Question 2 - fizzBuzz
    public static String fizzBuzz(int num){
        if(num % 3 == 0 && num % 5 == 0){
            return "fizzbuzz";
        }
        else if(num % 3 == 0){
            return "fizz";
        }
        else if(num % 5 == 0){
            return "buzz";
        }
        else{
            return "unlucky";
        }
    }
    // Question 3 - frontBack
    public static String frontBack(String a) {
        if (a.length() < 2) {
            return a;
        }
        else {
            String newString = a.substring(0, 2);
            return newString + a + newString;
        }
    }
    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c){
        return a + b == c || a + c == b || b + c == a;
    }
    // Question 5 - endUp
    public static String endUp(String a){
        if(a.length() < 3){
            return a.toUpperCase();
        }
        else {
            String back = a.substring(a.length()-3).toUpperCase();
            String front = a.substring(0, a.length()-3);
            return front + back;
        }
    }
}
