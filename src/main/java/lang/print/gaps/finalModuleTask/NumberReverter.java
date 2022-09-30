package lang.print.gaps.finalModuleTask;

import java.util.Scanner;

public class NumberReverter {
    int revertNumber;
    public void revert(int number) {
        while (number!=0){
            revertNumber=revertNumber*10+number%10;
            number=number/10;
    }
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number ");
        int number=input.nextInt();

        NumberReverter numberReverter=new NumberReverter();
        numberReverter.revert(number);
        System.out.println("Reverted number "+numberReverter.revertNumber);
    }
}
