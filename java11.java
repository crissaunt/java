import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Java11{
	public static void main(String[] args){

        try{
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        FileWriter filewriter = new FileWriter("jpe11.txt", true);
        PrintWriter writer = new PrintWriter(filewriter);
  

		int player1 , player2;
		String choose1 = "";
		String choose2 = "";

		String scissor,paper,rock,lizard,spock;

		scissor = "scissor";
		paper = "paper";
		rock = "rock";
		lizard = "lizard";
		spock = "spock";

		System.out.println("Rename or Customize the name of weapon");
	
		System.out.print("Scissor :  ");
		scissor = input.nextLine().toLowerCase() ;

		System.out.print("Paper :  ");
		paper = input.nextLine().toLowerCase() ;

		System.out.print("Rock :  ");
		rock = input.nextLine().toLowerCase() ;

		System.out.print("lizard :  ");
		lizard = input.nextLine().toLowerCase() ;

		System.out.print("spock :  ");
		spock = input.nextLine().toLowerCase() ;

		System.out.println();

		System.out.println("\n=============================");
		System.out.println("Player 1 VS Player 2");
		System.out.println("=============================\n");

		System.out.println("Player 1 Choose your Weapon");
		System.out.printf("[1]%s\t[2]%s\n[3]%s\t[4]%s\n[5]%s\n",scissor, paper, rock, lizard, spock);
		player1 = input.nextInt();

		switch(player1){
			case 1:
				choose1 = scissor;
				break;
			case 2:
				choose1 = paper;
				break;
			case 3:
				choose1 = rock;
				break;
			case 4:
				choose1 = lizard;
				break;
			case 5:
				choose1 = spock;	
				break;
			default:
				System.out.println("Not in option, Try again!!!");
				break;

		}

		System.out.println("Player 2 Choose your Weapon");
		System.out.printf("[1]%s\t[2]%s\n[3]%s\t[4]%s\n[5]%s\n",scissor, paper, rock, lizard, spock);
		player2 = input.nextInt();

		switch(player2){
			case 1:
				choose2 = scissor;
				break;
			case 2:
				choose2 = paper;
				break;
			case 3:
				choose2 = rock;
				break;
			case 4:
				choose2 = lizard;
				break;
			case 5:
				choose2 = spock;
				break;
			default:
				System.out.println("Not in option, Try again!!!");
				break;

		}

		System.out.println("\n=============================");
		System.out.printf("Player1 : %s\nPlayer2: %s\n\n", choose1 ,choose2);
		System.out.println("=============================\n");

        writer.println("Player1 = " + choose1);
        writer.println("Player2 = " + choose2);
      


		if( choose1.equals(choose2)){
			System.out.println("It's a tie!!");
              writer.println("Its a tie!!!");
		}else if (choose1.equals(scissor) && choose2.equals(paper) || choose1.equals(scissor) && choose2.equals(lizard)){
			System.out.println("Player 1 Wins!!!");
              writer.println("Player 1 Wins!!!");
		}else if (choose1.equals(paper) && choose2.equals(rock) || choose1.equals(paper) && choose2.equals(spock)){
			System.out.println("player 1 Wins !!!");
              writer.println("Player 1 Wins!!!");
		}else if (choose1.equals(rock) && choose2.equals(lizard) || choose1.equals(rock) && choose2.equals(scissor)){
			System.out.println("Player 1 Wins !!!!");
              writer.println("Player 1 Wins!!!");
		}else if(choose1.equals(lizard) && choose2.equals(spock) || choose1.equals(lizard) && choose2.equals(paper)){
			System.out.println("Player 1 Wins !!!");
              writer.println("Player 1 Wins!!!");
		}else if (choose1.equals(spock) && choose2.equals(scissor) || choose1.equals(spock) && choose2.equals(rock)){
			System.out.println("Player 1 Wins !!!");
              writer.println("Player 1 Wins!!!");
		}else{
			System.out.println("Player 2 Wins");
              writer.println("Player 2 Wins!!!");
		}

    writer.close();         // Flush and close writer
    filewriter.close();

    }catch (IOException e){
        System.out.println("Nothing");
    }

	}
}