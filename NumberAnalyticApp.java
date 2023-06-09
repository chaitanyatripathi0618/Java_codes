import java.util.Scanner;
public class NumberAnalyticApp {
    public static void main(String[] args) {
        NumericAnalytic na = new NumericAnalytic();
        System.out.println("check number is even or not");
        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();
        if(na.isEven(num1)){
            System.out.println(num1+ " Even");
        }
        else{
            System.out.println(num1+" odd");
        }
        System.out.println("check number is prime or not");
        int num2= sc.nextInt();
        if(na.isPrime(num2)){
            System.out.println(num2+"prime");
        }
        else{
            System.out.println("not prime");
        }
        System.out.println("find number of digits" +num2 + "is" +na.findNumDigits(num2));
        System.out.println("sum of digits of" +num2 + "is" +na.sumDigit(num2));

    }
}
