package lesperance_p3;
import java.util.Scanner;
class Poll {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    String topics[] = {"Jordans" ,"Lebrons" ,"Vans", "Adidas" ,"Nike" };
    
    System.out.print("Welcome To The Poll For Shoes!!");
    System.out.print("\n\n***************************************\n\n");

    int [][]twoDem = new int[topics.length][];
    

    int user;
    int m;
    int n;
    int rating;
    int avg[] = new int[topics.length];
    int highest = 0;
    int lowest = 0;
    String high = "";
    String low = "";

    for(m = 0; m < twoDem.length; m++){
      twoDem[m] = new int[10];
      for(n = 0; n < twoDem[m].length; n++){
        twoDem[m][n] = 0;
      }
    }
    System.out.println("Rate each shoe from 1 - 10.");
    System.out.print("First, how many people are surveying? --> ");
    user = scnr.nextInt();

    for(m = 0; m < user; m++){
      for(n = 0; n <topics.length; n++){
        System.out.println("Enter your rate for " + topics[n] + ": ");
        rating = scnr.nextInt();
        twoDem[n][rating - 1]++;
      }
    }

    for(m = 0; m < twoDem.length; m++){
      avg[m] = 0;
      for(n = 0; n < twoDem[m].length; n++){
        avg[m] = avg[m] + (twoDem[m][n] * (n + 1));

        if(m == 0){
          highest = avg[m];
          lowest = avg[m];
          high = topics[m];
          low = topics[m];
        }
        else{
          if(avg[m] > highest){
            high = topics[m];
            highest = avg[m];
          }
          if(avg[m] < lowest){
            low = topics[m];
            lowest = avg[m];
          }
        }
        avg[m] = avg[m] / user;
      }
    }

    System.out.printf("\n%-20s","");
    for(m=0;m<10;m++)
       System.out.printf("%-10d",(m+1));
       System.out.printf("%20s","The Average Rating For Shoe");
       System.out.println();
        for(m=0;m<twoDem.length;m++)
          {
            System.out.printf("\n%-20s",topics[m]);
             for(n=0;n<twoDem[m].length;n++)
                System.out.printf("%-10d",twoDem[m][n]);
               System.out.printf("%20d",avg[m]);
             }


    System.out.println("\nThe highest points were "+ highest +" from "+ high + ".");
    System.out.println("\nThe lowest points were "+ lowest  +" from "+ low + ".");

    scnr.close();
    

  }
}