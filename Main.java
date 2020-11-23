import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  //VAR
  Scanner input = new Scanner(System.in);
    String animalType;
    int intalAnimal; //The Intal Amount of Aminals
    int intalYear = 2020;
    int finalYear; //The Projected Year
    int finalAnimal; //The Projected Amount of Animals 
    int yearDiff; //The Amount of Years Between Intal and Final 

  //IMPUT SCREEN
  System.out.print("What type of animal was it? ");
   animalType = input.nextLine();
  System.out.print("How many did you see? ");
    intalAnimal = input.nextInt();
  System.out.print("What year do you want to see the project population for? ");
    finalYear = input.nextInt();
  
  //MATH
  yearDiff = finalYear - intalYear;
  finalAnimal = (yearDiff*intalAnimal)+intalAnimal;
  //OUTPUT SCREEN 
  System.out.println("Type of Animal: "+ animalType);
  System.out.println("Starting Amount: "+intalAnimal);
  System.out.println("Current year: "+ intalYear);
  System.out.println("Projection Year: "+finalYear );
  System.out.println("Projected Population: "+finalAnimal);
  }
}