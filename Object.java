public class Object {
    public static int addNumbers(int Num1, int Num2){
        return Num1 + Num2;
    }
    public static void main(String args[]){
        int number1 = 5;
        int number2 = 7;

        int result = addNumbers(number1, number2);
        System.out.println("The sum of " +" " +number1 + "and "+" "+number2+"is"+" "+result);
    }
}
