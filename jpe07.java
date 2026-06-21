import java.util.Scanner;
import java.util.Random;

public class Jpe07{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	Random random = new Random();

	int bot;
	int player1,player2;
	int menu;
	String choose1 = "";
	String choose2= "";

	String scissor1 = "scissor";
	String paper1 = "paper";
	String rock1 = "rock";
	String lizard1 = "lizard";
	String spock1 = "spock";

	String scissor2 = "scissor";
	String paper2 = "paper";
	String rock2 = "rock";
	String lizard2 = "lizard";
	String spock2 = "spock";

	while(true){
		System.out.println("Get Ready");
		System.out.println("Menu Option");
		System.out.println("[1]Player VS player\n[2]Player VS Bot\n[3]Exit");
		menu = input.nextInt();
		System.out.println();
		input.nextLine(); // <-- fixes the rename input problem

		if (menu == 1){
			int score1= 0;
			int score2 = 0;
			int best_of_five =1;
		
			System.out.println("====================");
			System.out.println("  Player VS Player");
			System.out.println("====================\n\n");

					// player 1
			System.out.println("==============================");
			System.out.println("Player 1(one)  Customize the name of your weapon");
			
			System.out.print("Scissor :  ");
			scissor1 = input.nextLine().toLowerCase() ;
			System.out.println();

			System.out.print("Paper :  ");
			paper1 = input.nextLine().toLowerCase() ;
			System.out.println();

			System.out.print("Rock :  ");
			rock1 = input.nextLine().toLowerCase() ;
			System.out.println();

			System.out.print("lizard :  ");
			lizard1 = input.nextLine().toLowerCase() ;
			System.out.println();

			System.out.print("spock :  ");
			spock1 = input.nextLine().toLowerCase() ;
			System.out.println();

			System.out.println("Your done naming weapon");
			System.out.println("==============================\n\n");

				// player2
			System.out.println("==============================");
			System.out.println("Player 2(one)  Customize the name of your weapon");

			System.out.print("Scissor :  ");
			scissor2 = input.nextLine().toLowerCase() ;
			System.out.println();

			System.out.print("Paper :  ");
			paper2 = input.nextLine().toLowerCase() ;
			System.out.println();

			System.out.print("Rock :  ");
			rock2 = input.nextLine().toLowerCase() ;
			System.out.println();

			System.out.print("lizard :  ");
			lizard2 = input.nextLine().toLowerCase() ;
			System.out.println();

			System.out.print("spock :  ");
			spock2 = input.nextLine().toLowerCase() ;
			System.out.println();

			System.out.println("Your done naming weapon");
			System.out.println("==============================\n\n");

				//palyer1
			while(best_of_five < 5){
			System.out.println("Best of 5(five)");	
			System.out.printf("Game %s\n", best_of_five);
			System.out.println("Let the Game Begin!!!!!\n");
			System.out.println("========================");
			System.out.println("Player 1 choose your weapon");
			System.out.printf("[1]%s\n[2]%s\n[3]%s\n[4]%s\n[5]%s",scissor1,paper1,rock1,lizard1,spock1);
			player1 = input.nextInt();

			switch(player1){
				case 1:
					choose1 = scissor1;
					break;
				case 2:
					choose1 = paper1;
					break;
				case 3:
					choose1 = rock1;
					break;
				case 4:
					choose1 = lizard1;
					break;
				case 5:
					choose1 = spock1;
					break;
				default:
					System.out.println("Not in the option, Try again!!!");
					break;			

			}

				//player2
			System.out.println("========================");
			System.out.println("Player 2 choose your weapon");
			System.out.printf("[1]%s\n[2]%s\n[3]%s\n[4]%s\n[5]%s",scissor2,paper2,rock2,lizard2,spock2);
			player2 = input.nextInt();

			switch(player2){
				case 1:
					choose2 = scissor2;
					break;
				case 2:
					choose2 = paper2;
					break;
				case 3:
					choose2 = rock2;
					break;
				case 4:
					choose2 = lizard2;
					break;
				case 5:
					choose2 = spock2;
					break;
				default:
					System.out.println("Not in the option, Try again!!!");
					break;			

			}


			//String choose1,choose2;
			System.out.println("\n=============================");
			System.out.printf("Player1 : %s\nPlayer2: %s\n\n", choose1 ,choose2);
			System.out.println("=============================\n");


			if( choose1.equals(choose2)){
				System.out.println("It's a tie!!");
			}else if (choose1.equals(scissor1) && choose2.equals(paper2) || choose1.equals(scissor1) && choose2.equals(lizard2)){
				score1 +=1;
				System.out.println("Player 1 Wins!!!");
			}else if (choose1.equals(paper1) && choose2.equals(rock2) || choose1.equals(paper1) && choose2.equals(spock2)){
				score1 +=1;
				System.out.println("player 1 Wins !!!");
			}else if (choose1.equals(rock1) && choose2.equals(lizard2) || choose1.equals(rock1) && choose2.equals(scissor2)){
				score1 +=1;
				System.out.println("Player 1 Wins !!!!");
			}else if(choose1.equals(lizard1) && choose2.equals(spock2) || choose1.equals(lizard1) && choose2.equals(paper2)){
				score1 +=1;
				System.out.println("Player 1 Wins !!!");
			}else if (choose1.equals(spock1) && choose2.equals(scissor2) || choose1.equals(spock1) && choose2.equals(rock2)){
				score1 +=1;
				System.out.println("Player 1 Wins !!!");
			}else{
				score2 +=1;
				System.out.println("Player 2 Wins");
			}
			
			System.out.printf("Score\n[1]Player1 : %s\n[2]Player2 : %s\n\n", score1, score2);			
			best_of_five+=1;


			}
			System.out.println("Game is Done");
			
		}
		else if (menu == 2){
			int score1= 0;
			int score2 = 0;
			int best_of_five =1;
		
			System.out.println("====================");
			System.out.println("  Player VS Bot");
			System.out.println("====================\n\n");

					// player 1
			System.out.println("==============================");
			System.out.println("Player 1(one)  Customize the name of your weapon");
			
			System.out.print("Scissor :  ");
			scissor1 = input.nextLine().toLowerCase() ;
			System.out.println();

			System.out.print("Paper :  ");
			paper1 = input.nextLine().toLowerCase() ;
			System.out.println();

			System.out.print("Rock :  ");
			rock1 = input.nextLine().toLowerCase() ;
			System.out.println();

			System.out.print("lizard :  ");
			lizard1 = input.nextLine().toLowerCase() ;
			System.out.println();

			System.out.print("spock :  ");
			spock1 = input.nextLine().toLowerCase() ;
			System.out.println();

			System.out.println("Your done naming weapon");
			System.out.println("==============================\n\n");

				// player2
			

				//palyer1
			while(best_of_five <= 5){
			System.out.println("Best of 5(five)");	
			System.out.printf("Game %s\n", best_of_five);
			System.out.println("Let the Game Begin!!!!!\n");
			System.out.println("========================");
			System.out.println("Player 1 choose your weapon");
			System.out.printf("[1]%s\n[2]%s\n[3]%s\n[4]%s\n[5]%s",scissor1,paper1,rock1,lizard1,spock1);
			player1 = input.nextInt();

			switch(player1){
				case 1:
					choose1 = scissor1;
					break;
				case 2:
					choose1 = paper1;
					break;
				case 3:
					choose1 = rock1;
					break;
				case 4:
					choose1 = lizard1;
					break;
				case 5:
					choose1 = spock1;
					break;
				default:
					System.out.println("Not in the option, Try again!!!");
					break;			

			}

				//bot
			System.out.println("========================");
			System.out.println("BOt choose  weapon");
			System.out.printf("[1]%s\n[2]%s\n[3]%s\n[4]%s\n[5]%s",scissor2,paper2,rock2,lizard2,spock2);
			bot = random.nextInt(1,6);

			switch(bot){
				case 1:
					choose2 = scissor2;
					break;
				case 2:
					choose2 = paper2;
					break;
				case 3:
					choose2 = rock2;
					break;
				case 4:
					choose2 = lizard2;
					break;
				case 5:
					choose2 = spock2;
					break;
				default:
					System.out.println("Not in the option, Try again!!!");
					break;			

			}


			//String choose1,choose2;
			System.out.println("\n=============================");
			System.out.printf("Player1 : %s\n Bot: %s\n\n", choose1 ,choose2);
			System.out.println("=============================\n");


			if( choose1.equals(choose2)){
				System.out.println("It's a tie!!");
			}else if (choose1.equals(scissor1) && choose2.equals(paper2) || choose1.equals(scissor1) && choose2.equals(lizard2)){
				score1 +=1;
				System.out.println("Player 1 Wins!!!");
			}else if (choose1.equals(paper1) && choose2.equals(rock2) || choose1.equals(paper1) && choose2.equals(spock2)){
				score1 +=1;
				System.out.println("player 1 Wins !!!");
			}else if (choose1.equals(rock1) && choose2.equals(lizard2) || choose1.equals(rock1) && choose2.equals(scissor2)){
				score1 +=1;
				System.out.println("Player 1 Wins !!!!");
			}else if(choose1.equals(lizard1) && choose2.equals(spock2) || choose1.equals(lizard1) && choose2.equals(paper2)){
				score1 +=1;
				System.out.println("Player 1 Wins !!!");
			}else if (choose1.equals(spock1) && choose2.equals(scissor2) || choose1.equals(spock1) && choose2.equals(rock2)){
				score1 +=1;
				System.out.println("Player 1 Wins !!!");
			}else{
				score2 +=1;
				System.out.println("Bot Wins");
			}
			
			System.out.printf("Score\n[1]Player1 : %s\n[2]Player2 : %s\n\n", score1, score2);			
			best_of_five+=1;

			}
			System.out.println("Game is Done");
			
		}

		if (menu == 3){
			System.out.println("Thank you for playing  Game");
			break;
		}
		

	}
	
	

	}
}