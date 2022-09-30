package lang.print.gaps.finalModuleTask;

import java.util.Scanner;

public class DigitsSumCalculator {
    int sum;
    public void calculateSum(int number) {
        while(number!=0){
            sum+=number%10;
            number=number/10;
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number ");
        int number=input.nextInt();

        DigitsSumCalculator digitsSumCalculator=new DigitsSumCalculator();
        digitsSumCalculator.calculateSum(number);
        System.out.println("Sum of the number digits "+digitsSumCalculator.sum);
    }
}
