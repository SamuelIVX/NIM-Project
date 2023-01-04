import java.util.Scanner;

public class Nim {
  public static void main(String[] args){

	//1. declare variables to store the names of the players (String), the number of stones left (int), and the number of stones taken each round (int),  
    String playerOne;
    String playerTwo;
    String currentPlayer = "one";
    int stonesLeft = 7;
    int stonesTaken = 0;
    
	//2. Set up a Scanner object to take in user inputs, and use it to get the player names (see the table below)
    Scanner input = new Scanner(System.in);
    System.out.println("Player One enter your name:");
    playerOne = input.nextLine();

    System.out.println("Player Two enter your name:");
    playerTwo = input.nextLine();

//3. Print out a welcome message with the purpose of the game, and the number of stones you are starting with.
    System.out.println("Hello " + playerOne + " and " + playerTwo + ".");
    System.out.println("In this version of the ancient Game of Nim, you have a heap of “good stones”, plus one bad one.  Each  turn, you may take ONE OR TWO stones away from the pile, with the goal of leaving the bad one to your opponent on your last turn.");

	//4. Set up a “while” loop that runs until the stones are all taken (you can decide if that’s zero stones, or just the “odd one” left.)  This loop should alternately ask each player to choose 1 or 2 stones, and then display how many are left.  When the stones are used up, it should display a congratulatory message. You should eventually include a check for bad inputs, like 0 or 3 stones, but get the other stuff working first.
    for (int i = 1; i < stonesLeft; i++){
      System.out.print("0  ");
    }
    System.out.println("X ");
    
    while (stonesLeft > 0 ){
// Current Player is set to Player One
      currentPlayer = playerOne;
      System.out.println(currentPlayer + ". How many stones would you like to take? You can only take 1 or 2 stones.");
      stonesTaken = input.nextInt();
      
      if (stonesTaken == 1 || stonesTaken == 2){
        stonesLeft = stonesLeft - stonesTaken;
        for (int i = 1; i < stonesLeft; i++){
      System.out.print("0  ");
        }
    System.out.println("X ");
        System.out.println("Now there are " + stonesLeft + " stones left, plus the odd one.");
      } else if (stonesLeft < 2) {
        System.out.println("Can only take 1 stone since there is only 1 stone left!");
      } else {
  System.out.println("You can only take 1 or 2 stones. Try again.");
      }
      
//Current Player is set to Player 2
      currentPlayer = playerTwo;
      System.out.println( currentPlayer + ". How many stones would you like to take? You can only take 1 or 2 stones.");
      stonesTaken = input.nextInt();
      
      if (stonesTaken == 1 || stonesTaken == 2){
        stonesLeft = stonesLeft - stonesTaken;
        for (int i = 1; i < stonesLeft; i++){
      System.out.print("0  "); 
        }
    System.out.println("X ");
        System.out.println("Now there are " + stonesLeft + " stones left, plus the odd one.");
// While Loop repeats until stones are less than 1
      } else if (stonesLeft < 2) {
        System.out.println("Can only take 1 stone since there is only 1 stone left!");
      } else {
        System.out.println("You can only take 1 or 2 stones. Try again.");
        continue;
      }
    }//end while
    System.out.println("Congratulations " + currentPlayer + ", you have won the Nim Game!");
  }// ENDS MAIN
}// ENDS CLASS