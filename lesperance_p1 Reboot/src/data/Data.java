package data;
import java.util.Scanner;
class Data {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int userInput = 0;
// This is a test
    System.out.print("Welcome To My Secure Data Program!");
    System.out.print("\n\n***************************************\n\n");
    System.out.print("Please enter four digit data: ");
    userInput = scnr.nextInt();

    String [] str = Integer.toString(userInput).split("");
    int []encrypt = new int[str.length];

    for(int i = 0; i < str.length; i++){
      encrypt[i] = Integer.parseInt(str[i]);
      

      encrypt[i] += 7;


    }
    System.out.println();

    for (int i = 0; i < 1; i++){
      int temp = encrypt[i+2];
      encrypt[i+2] = encrypt[i];
      encrypt[i] = temp;

      int temp2 = encrypt[i+3];
      encrypt[i+3] = encrypt[i+1];
      encrypt[i+1] = temp2;
      System.out.print("\n\n***************************************\n\n");
      System.out.print("Your data was been encrypt as ");
      System.out.print(encrypt[i]);
      System.out.print(encrypt[i+1]);
      System.out.print(encrypt[i+2]);
      System.out.print(encrypt[i+3]);
    }
    System.out.println();

    for(int i = 0; i < 1; i++){
      int w;
      int x;
      int y;
      int z;
      int temp3 = encrypt[i];
      encrypt[i] = encrypt[i+2];
      encrypt[i+2] = temp3;

      int temp4 = encrypt[i+1];
      encrypt[i+1] = encrypt[i+3];
      encrypt[i+3] = temp4;



    w = encrypt[i] - 7;
    x = encrypt[i+1] - 7;
    y = encrypt[i+2] - 7;
    z = encrypt[i+3] - 7;
    
    System.out.print("\n\n***************************************\n\n");
    System.out.print("Your data was been decrypt as ");
    System.out.print(w);
    System.out.print(x);
    System.out.print(y);
    System.out.print(z);
    }








  }
}