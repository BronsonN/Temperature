import java.util.Scanner;

public class Temperature {

  public static void main(String [] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter City Name: ");
    String cityName = keyboard.nextLine();

    System.out.print("Enter Date: ");
    String date = keyboard.nextLine();

    System.out.print("Min temp: ");
    int minTemp = keyboard.nextInt();

    System.out.print("Max temp: ");
    int maxTemp = keyboard.nextInt();

    double difference = maxTemp - minTemp;
    double average = (double)(maxTemp+minTemp) /2;

    System.out.println("Temperature statistics for " +cityName);
    System.out.println("For: " +date);
    System.out.println("Min: " +minTemp);
    System.out.println("Max: " +maxTemp);
    System.out.println("Difference: " +difference);
    System.out.print("Average: " +average);

  }


}
