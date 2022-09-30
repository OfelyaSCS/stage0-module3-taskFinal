package lang.print.gaps.finalModuleTask;

import java.util.Scanner;

public class TemperatureConverter {
    float fahrenheit;
    public void toFahrenheit(int temperatureCelsius){
        fahrenheit=temperatureCelsius*(9/5)+32;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Celsius ");
        int celsius=input.nextInt();

        TemperatureConverter temperatureConverter=new TemperatureConverter();
        temperatureConverter.toFahrenheit(celsius);
        System.out.println("Temperature in Fahrenheit "+temperatureConverter.fahrenheit);

    }
}
