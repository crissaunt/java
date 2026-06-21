import java.util.Scanner;
import java.util.Random;

public class Jpe10{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int user;
        String confirm;

        while(true){
        System.out.print("Menu\n[1]Problem9\n[2]Problem6\n[3]Problem8\n[4]Exit");
        user = input.nextInt();
 
        input.nextLine(); // <-- consume the leftover newline!

        switch(user){
            case 1:
                problem9();
                System.out.println("Enter or type anything to continue");
                confirm = input.nextLine();
                confirm = "";
                break;
            case 2:
                problem6();
                System.out.println("Enter or type anything to continue");
                confirm = input.nextLine();
                confirm = "";
                break;

            case 3:
                problem8();
                System.out.println("Enter or type anything to continue");
                confirm = input.nextLine();
                confirm = "";
                break;
                
            default:
                System.out.println("not in options");
                break;    

        }
        }
     

        
     
    }



    public static void problem9() {
        Random rand = new Random();

        int[] player1 = new int[3];
        int[] player2 = new int[3];
        int player1_sum = 0;
        int player2_sum = 0;

        String[] cards = {
            "Alas",
            "2nd Card",
            "3rd Card",
            "4th Card",
            "5th Card", 
            "6th Card",
            "7th Card",
            "8th Card",
            "9th Card", 
            "10th Card", 
            "Jack", 
            "Queen",
            "King"
        };

        System.out.println("Let's Start the Game!\n");

        // give cards
        for (int i = 0; i < 3; i++) {
            player1[i] = rand.nextInt(cards.length);
            player2[i] = rand.nextInt(cards.length);
        }

        System.out.println("Player 1 Cards:");
        for (int i = 0; i < 3; i++) {
            System.out.println("- " + cards[player1[i]]);
        }

        System.out.println("\nPlayer 2 Cards:");
        for (int i = 0; i < 3; i++) {
            System.out.println("- " + cards[player2[i]]);
        }



        System.out.println();



        boolean player1_hasPair = false;
        boolean player2_hasPair = false;
        boolean player1_hasAlas = false;
        boolean player2_hasAlas = false;
        int player1_pairValue = -1;
        int player2_pairValue = -1;





        for (int i = 0; i < 3; i++) {
            if (player1[i] == 0){
                player1_hasAlas = true;
            }
            if (player2[i] == 0){
                player2_hasAlas = true;
            }

            for (int j = i + 1; j < 3; j++) {
                if (player1[i] == player1[j]) {
                    player1_hasPair = true;
                    player1_pairValue = player1[i];
                }
                if (player2[i] == player2[j]) {
                    player2_hasPair = true;
                    player2_pairValue = player2[i];
                }
            }
        }



        if (player1_hasAlas && !player2_hasAlas) {
            System.out.println("Player 1 wins with an Alas!");
        } else if (!player1_hasAlas && player2_hasAlas) {
            System.out.println("Player 2 wins with an Alas!");
        } else if (player1_hasPair && !player2_hasPair) {
            System.out.println("Player 1 wins with a pair!");
        } else if (!player1_hasPair && player1_hasPair) {
            System.out.println("Player 2 wins with a pair!");
        } else if (player1_hasPair && player2_hasPair) {
            if (player1_pairValue > player2_pairValue) {
                System.out.println("Player 1 wins with a higher pair!");
            } else if (player2_pairValue > player1_pairValue) {
                System.out.println("Player 2 wins with a higher pair!");
            } else {
                System.out.println("It's a tie! Same pair value.");
            }
        } else {
           
            for (int i = 0; i < 3; i++) {
                player1_sum += player1[i];
                player2_sum += player2[i];
            }

            if (player1_sum > player2_sum) {
                System.out.println("Player 1 wins with higher total value!");
            } else if (player2_sum > player1_sum) {
                System.out.println("Player 2 wins with higher total value!");
            } else {
                System.out.println("It's a tie based on total value!");
            }
        }

    
        System.out.println("\nPlayer 1 total value: " + player1_sum);
        System.out.println("Player 2 total value: " + player2_sum);
    }



        //jpe06
    public static void problem6(){
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
		input.nextLine(); 

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
    
    input.close();
	}
	
	

	}


     public static void problem8(){

        int[] numbers = {5, -5, 15, -15, -20, 6, -2, -3, -10, -100};
        int oldSum = 0;

        // int oldSum1= numbers[0] +  numbers[1] +  +  numbers[2] +  numbers[3] +  numbers[4] +  numbers[5] +  numbers[6] +  numbers[7] +  numbers[8] + numbers[9];
        // System.out.println("old  "+oldSum1);

        System.out.print("Old Numbers: ");

        for (int oldNumber: numbers){
            oldSum  += oldNumber;
            System.out.printf("%d ," ,oldNumber);
        }
        System.out.printf("Sum: %d\n\n", oldSum);

        int[] newArray = new int[10];
        int newSum = 0;
        for (int i = 0 ; i < (numbers.length -1); i++){
            if (numbers[i] < 0){
                numbers[i] = 0;
            }else{
                newArray[i] = numbers[i];
                newSum+=numbers[i];
            }
           
        }
                    System.out.print("New Numbers: ");

        for(int newNumber: numbers){
            System.out.printf(" %d,",newNumber);
        }
        System.out.printf("Sum: %d", newSum);

        System.out.println();

      
        // for(int newNumber : numbers){
        //     System.out.println(newNumber);
        // }

    }

}




