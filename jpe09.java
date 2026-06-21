import java.util.Random;

public class Jpe09 {
    public static void main(String[] args) {
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
}
