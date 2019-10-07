package bmi;
import java.util.Scanner;
class BMI {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    double weight;
    double height;
    double BMI;
    int system;
    
    System.out.print("Welcome To My Body Mass Index Calculator!");
    System.out.print("\n\n***************************************\n\n");

    System.out.println("Press 0 for the calculation to be done in the metric system,");
    System.out.print("or press any other digit for the standard calculation: ");
    system = scnr.nextInt();
    if (system != 0){

      int feet;
      int inches;
      
      System.out.print("\n\n***************************************\n\n");
      System.out.println("Please enter height\n");
      System.out.print("feet: ");
      feet = scnr.nextInt();
      System.out.print("\ninches: ");
      inches = scnr.nextInt();
      height = (feet * 12) + inches;
      System.out.print("\nPlease enter weight(lb): ");
      weight = scnr.nextDouble();

      BMI = (703 * weight) / (height * height);
      System.out.print("\nYour BMI is ");
      System.out.printf("%.1f", BMI);
      System.out.print("\n\n***************************************\n\n");
      System.out.print("\n\nYour categorize as ");
      
    }
    else{
      System.out.print("\n\n***************************************\n\n");
      System.out.print("Please enter height(cm): ");
      height = scnr.nextDouble();
      System.out.print("\nPlease enter weight(kg): ");
      weight = scnr.nextDouble();

      BMI = (weight / (height * height)) * 10000;
      
      System.out.print("\nYour BMI is ");
      System.out.printf("%.1f\n", BMI);
      System.out.print("\n\n***************************************\n\n");
      System.out.print("\n\nYour categorize as ");

    }


    if (BMI <= 18.5){
      System.out.println("Underweight.");
    }
    if(BMI >= 18.6 && BMI <= 24.9){
      System.out.println("Normal weight.");
    }
    if(BMI >= 25 && BMI <= 29.9){
      System.out.println("Overweight.");
    }
    if(BMI >= 30){
      System.out.println("Obesity.");
    }


  }
}