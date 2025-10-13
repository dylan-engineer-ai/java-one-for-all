package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain;

public class Calculator {
    public void sumTwoNumbers(){
        System.out.println(10+10);
    }


    public void multiplyTwoNumbers(int num1, int num2){
        System.out.println(num1*num2);
    }

    public double divideTwoNumbers(double num1, double num2){
        double result = num1 / num2;
        System.out.println(result);
        return result;
    }

    public void sumArray(int[] numbers){
        int sum = 0;
        for (int num: numbers
             ) {
            sum += num;
        }
        System.out.println(sum);
    }

    public void sumVarArgs(int... numbers){
        int sum = 0;
        for (int num: numbers
        ) {
            sum += num;
        }
        System.out.println(sum);
    }
}
