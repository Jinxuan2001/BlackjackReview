import java. util. Scanner;


public class Blackjack {
    public static class P1Random
    {
        private long next;

        public P1Random()
        {
            next = 0;
        }

        private short nextShort()
        {
            return nextShort(Short.MAX_VALUE);
        }

        private short nextShort(short limit)
        {
            next = next * 1103515245 + 12345;
            return (short) Math.abs(((next / 65536) % limit));
        }

        private int nextInt()
        {
            return nextInt(Integer.MAX_VALUE);
        }

        public int nextInt(int limit)
        {
            return ((((int) nextShort()) << 16) | ((int) nextShort())) % limit;
        }

        private double nextDouble()
        {
            return (double) nextInt() / (double) Integer.MAX_VALUE;
        }
    }
    public static void main (String args[]){
        int numGames = 1;
        int games = 0;
        System. out. println("START GAME #" + numGames);
        P1Random rng = new P1Random();
        int handNum = 0;

        int cardNum01 = rng.nextInt(13) + 1;
        if (cardNum01 > 10 || cardNum01 == 1){
            String faceCard = "";
            if (cardNum01 == 11){
                faceCard = "JACK";
                cardNum01 = 10;
            }
            if (cardNum01 == 12){
                faceCard = "QUEEN";
                cardNum01 = 10;
            }
            if (cardNum01 == 13){
                faceCard = "KING";
                cardNum01 = 10;
            }
            if (cardNum01 == 1){
                faceCard = "ACE";
            }
            System. out. println("\nYour card is a " + faceCard + "!");
        }
        else {
            System. out. println("\nYour card is a " + cardNum01 + "!");
        }
        handNum += cardNum01;
        System. out. println("Your hand is: " + handNum);

        System. out. print("\n1. Get another card\n2. Hold hand\n3. Print statistics\n4. Exit\n\nChoose an option: ");
        int playOpt;
        int numWins = 0;
        int numTies = 0;
        int dealerWins = 0;

        Scanner scnr = new Scanner(System. in);



        while (numGames != 0){
            playOpt = scnr.nextInt();
            if (playOpt == 1){
                int cardNum = rng.nextInt(13) + 1;
                if (cardNum > 10 || cardNum == 1){
                    String faceCard = "";
                    if (cardNum == 11){
                        faceCard = "JACK";
                        cardNum = 10;
                    }
                    if (cardNum == 12){
                        faceCard = "QUEEN";
                        cardNum = 10;
                    }
                    if (cardNum == 13){
                        faceCard = "KING";
                        cardNum = 10;
                    }
                    if (cardNum == 1){
                        faceCard = "ACE";
                    }
                    System. out. println("\nYour card is a " + faceCard + "!");
                }
                else {
                    System. out. println("\nYour card is a " + cardNum + "!");
                }
                handNum += cardNum;
                System. out. println("Your hand is: " + handNum);
            }
            if (playOpt == 2){
                int dealerNum = rng.nextInt(11) + 16;
                System. out. println("\nDealer's hand: " + dealerNum);
                System. out. println("Your hand is: " + handNum);
                if (dealerNum > 21){                                                                                    //result 1!
                    System. out. println("\nYou win!");
                    numWins += 1;
                    numGames += 1;
                        handNum = 0;
                        dealerNum = 0;
                        games += 1;
                        System. out. println("\nSTART GAME #" + numGames);
                        int cardNum = rng.nextInt(13) + 1;
                        if (cardNum > 10 || cardNum == 1) {
                            String faceCard = "";
                            if (cardNum == 11) {
                                faceCard = "JACK";
                                cardNum = 10;
                            }
                            if (cardNum == 12) {
                                faceCard = "QUEEN";
                                cardNum = 10;
                            }
                            if (cardNum == 13) {
                                faceCard = "KING";
                                cardNum = 10;
                            }
                            if (cardNum == 1) {
                                faceCard = "ACE";
                            }
                            System.out.println("\nYour card is a " + faceCard + "!");

                    }
                        else {
                            System. out. println("\nYour card is a " + cardNum + "!");
                        }
                    handNum += cardNum;
                    System. out. println("Your hand is: " + handNum);
                }
                else {
                    if (dealerNum > handNum){                                                                           //result 2!
                        System. out. println("\nDealer wins!");
                        dealerWins += 1;
                        numGames += 1;
                        handNum = 0;
                        dealerNum = 0;
                        games += 1;
                        System. out. println("\nSTART GAME #" + numGames);
                        int cardNum = rng.nextInt(13) + 1;
                        if (cardNum > 10 || cardNum == 1) {
                            String faceCard = "";
                            if (cardNum == 11) {
                                faceCard = "JACK";
                                cardNum = 10;
                            }
                            if (cardNum == 12) {
                                faceCard = "QUEEN";
                                cardNum = 10;
                            }
                            if (cardNum == 13) {
                                faceCard = "KING";
                                cardNum = 10;
                            }
                            if (cardNum == 1) {
                                faceCard = "ACE";
                            }
                            System.out.println("\nYour card is a " + faceCard + "!");
                        }
                        else {
                            System. out. println("\nYour card is a " + cardNum + "!");
                        }
                        handNum += cardNum;
                        System. out. println("Your hand is: " + handNum);
                    }
                    else if(dealerNum < handNum){                                                                            //result 3!
                        System. out. println("\nYou win!");
                        numWins += 1;
                        numGames += 1;
                        handNum = 0;
                        dealerNum = 0;
                        games += 1;
                        System. out. println("\nSTART GAME #" + numGames);
                        int cardNum = rng.nextInt(13) + 1;
                        if (cardNum > 10 || cardNum == 1) {
                            String faceCard = "";
                            if (cardNum == 11) {
                                faceCard = "JACK";
                                cardNum = 10;
                            }
                            if (cardNum == 12) {
                                faceCard = "QUEEN";
                                cardNum = 10;
                            }
                            if (cardNum == 13) {
                                faceCard = "KING";
                                cardNum = 10;
                            }
                            if (cardNum == 1) {
                                faceCard = "ACE";
                            }
                            System.out.println("\nYour card is a " + faceCard + "!");
                        }
                        else {
                            System. out. println("\nYour card is a " + cardNum + "!");
                        }
                        handNum += cardNum;
                        System. out. println("Your hand is: " + handNum);
                    }
                    else if (dealerNum == handNum){                                                                          //result 4!
                        System. out. println("\nIt's a tie! No one wins!");
                        numGames += 1;
                        numTies +=1;
                        handNum = 0;
                        dealerNum = 0;
                        games += 1;
                        System. out. println("\nSTART GAME #" + numGames);
                        int cardNum = rng.nextInt(13) + 1;
                        if (cardNum > 10 || cardNum == 1) {
                            String faceCard = "";
                            if (cardNum == 11) {
                                faceCard = "JACK";
                                cardNum = 10;
                            }
                            if (cardNum == 12) {
                                faceCard = "QUEEN";
                                cardNum = 10;
                            }
                            if (cardNum == 13) {
                                faceCard = "KING";
                                cardNum = 10;
                            }
                            if (cardNum == 1) {
                                faceCard = "ACE";
                            }
                            System.out.println("\nYour card is a " + faceCard + "!");
                        }
                        else {
                            System. out. println("\nYour card is a " + cardNum + "!");
                        }
                        handNum += cardNum;
                        System. out. println("Your hand is: " + handNum);
                    }
                }
            }

            if (handNum == 21){                                                                                         //result 5!
                System. out. println("\nBLACKJACK! You win!");
                numWins += 1;
                numGames += 1;
                handNum = 0;
                games += 1;
                System. out. println("\nSTART GAME #" + numGames);
                int cardNum = rng.nextInt(13) + 1;
                if (cardNum > 10 || cardNum == 1) {
                    String faceCard = "";
                    if (cardNum == 11) {
                        faceCard = "JACK";
                        cardNum = 10;
                    }
                    if (cardNum == 12) {
                        faceCard = "QUEEN";
                        cardNum = 10;
                    }
                    if (cardNum == 13) {
                        faceCard = "KING";
                        cardNum = 10;
                    }
                    if (cardNum == 1) {
                        faceCard = "ACE";
                    }
                    System.out.println("\nYour card is a " + faceCard + "!");
                }
                else {
                    System. out. println("\nYour card is a " + cardNum + "!");
                }
                handNum += cardNum;
                System. out. println("Your hand is: " + handNum);

            }
            if (handNum > 21){                                                                                          //result 6!
                System. out. println("\nYou exceeded 21! You lose.");
                dealerWins += 1;
                numGames += 1;
                handNum = 0;
                games += 1;
                System. out. println("\nSTART GAME #" + numGames);
                int cardNum = rng.nextInt(13) + 1;
                if (cardNum > 10 || cardNum == 1) {
                    String faceCard = "";
                    if (cardNum == 11) {
                        faceCard = "JACK";
                        cardNum = 10;
                    }
                    if (cardNum == 12) {
                        faceCard = "QUEEN";
                        cardNum = 10;
                    }
                    if (cardNum == 13) {
                        faceCard = "KING";
                        cardNum = 10;
                    }
                    if (cardNum == 1) {
                        faceCard = "ACE";
                    }
                    System.out.println("\nYour card is a " + faceCard + "!");
                }
                else {
                    System. out. println("\nYour card is a " + cardNum + "!");
                }
                handNum += cardNum;
                System. out. println("Your hand is: " + handNum);
            }
            if (playOpt == 3){
                System. out. println("\nNumber of Player wins: " + numWins + "\nNumber of Dealer wins: " + dealerWins);
                System. out. println("Number of tie games: " + numTies + "\nTotal # of games played is: " + games);
                double numWinsR = numWins + 0.0;
                double gamesR = games + 0.0;
                double winRate = numWinsR / gamesR;
                System. out. println("Percentage of Player wins: " + winRate * 100 + "%");

            }
            if (playOpt == 4){
                break;
            }
            if (playOpt != 1 && playOpt != 2 && playOpt != 3){
                System. out. println("\nInvalid input!\nPlease enter an integer value between 1 and 4.");
            }




            System. out. print("\n1. Get another card\n2. Hold hand\n3. Print statistics\n4. Exit\n\nChoose an option: ");



        }






    }
}
