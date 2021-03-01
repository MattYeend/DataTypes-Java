/*
Data Types
 */
package datatypes;

/**
 *
 * @author Matt
 */
import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {
        //Fahrenheit to Celsius
        System.out.println("Converts Fahrenheit to Cenlsius");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = ((5*(fahrenheit - 32.0))/9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius. \n");
        
        //Reads numbers in inches and converts to meters
        System.out.println("Converts inches to meters");
        System.out.println("Input a value in inches: ");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inches is " + meters + " in meters. \n");
        
        //Reads an integer between 0 and 1000 and adds all the digits in an integer
        System.out.println("Reads an integer between 0 and 1000 and adds them together");
        System.out.println("Input an integer between 0 and 1000: ");
        int num = input.nextInt();
        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int secondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        int sum = thirdDigit + secondDigit + firstDigit;
        System.out.println("The sum of all digits in " + num + " is " + sum + "\n");
        
        //Convert minutes into a number of years and days
        System.out.println("Converts minutes to a number of years and days");
        double minutesInYear = 60*24*365;
        System.out.println("Input a number of minutes: ");
        double min = input.nextDouble();
        long years = (long)(min/minutesInYear);
        int days = (int)(min/60/24)%365;
        System.out.println((int)min + " minutes is apporximately " + years + " years and " + days + " days. \n");
        
        //Print the current time in GMT
        System.out.println("Print the current time in GMT");
        System.out.println("Input the timezone offset to GMT: ");
        long timeZoneChange = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes /60;
        long currentHour = ((totalHours + timeZoneChange)%24);
        System.out.println("Current time is: " + currentHour + ":" + currentMinute + ":" + currentSecond  + "\n");
        
        //Cumpute BMI
        System.out.println("Computes the BMI");
        System.out.println("Input weight in pounds: ");
        double weight = input.nextDouble();
        System.out.println("Input height in inches: ");
        double inches = input.nextDouble();
        double bmi = weight * 0.45359237/(inches * 0.0254 * inches * 0.0254);
        System.out.println("Body Mass Index is: " + bmi + "\n");
        
        //Calculate speed in meters per second, kilometers and miles per hour
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculates speed in meters per second, kilometers and miles per hour");
        float timeSeconds;
        float mps,kph,mph;
        System.out.println("Input a distance in meters: ");
        float distance = scanner.nextFloat();
        System.out.println("Input hour: ");
        float hour = scanner.nextFloat();
        System.out.println("Input minutes: ");
        float minute = scanner.nextFloat();
        System.out.println("Input seconds: ");
        float seconds = scanner.nextFloat();
        timeSeconds = (hour*3600) + (minute*60) + seconds;
        mps = distance / timeSeconds;
        kph = (distance/1000.0f)/(timeSeconds/3600.0f);
        mph = kph / 1.609f;
        System.out.println("Your speed in meters per second: " + mps);
        System.out.println("Your speed in kilometers per hour: " + kph);
        System.out.println("Your speed in miles per hour: " + mph + "\n");
        
        //Reads number and displays square, cube, and forth power
        Scanner in = new Scanner(System.in);
        System.out.println("Displays square, cube and forth power of a number");
        System.out.println("Input a side length value: ");
        double val = in.nextDouble();
        System.out.printf("Square: %12.2f\n", val*val);
        System.out.printf("Cube: %14.2f\n", val*val*val);
        System.out.printf("Forth power: %6.2f\n", Math.pow(val, 4));
        System.out.println("");
        
        //prints sum, difference, product, average, distance, max and min
        System.out.println("Prints sum, difference, product, average, distance, max, and min");
        System.out.println("Input the first integer: ");
        int firstInt = in.nextInt();
        System.out.println("Inpute the second integer: ");
        int secondInt = in.nextInt();
        System.out.printf("Sum of the two numbers: %d%n", firstInt, secondInt);
        System.out.printf("Different of the two numbers: %d%n", firstInt - secondInt);
        System.out.printf("Product of the two numbers: %d%n", firstInt * secondInt);
        System.out.printf("Average of the two numbers: %.2f%n", (double)(firstInt + secondInt)/2);
        System.out.printf("Distence of the two numbers: %d%n", Math.abs(firstInt - secondInt));
        System.out.printf("Max number: %d%n", Math.max(firstInt, secondInt));
        System.out.printf("Min number: %d%n", Math.min(firstInt, secondInt));
        System.out.println("");
        
        //Breaks an integer into squence of individual digits
        /*System.out.println("Breaks an integer into squence of individual digits");
        System.out.print("Input six non-negative digits: ");
        int n1 = input / 100000 % 10;
        int n2 = input / 10000 % 10;
        int n3 = input / 1000 % 10;
        int n4 = input / 100 % 10;
        int n5 = input / 10 % 10;
        int n6 = input % 10;
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);*/
    }
}
