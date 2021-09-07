import java.util.Scanner;

public class StonePaperScissorGame {
    public static void main(String[] args) {
        Scanner inpChar = new Scanner(System.in);
        System.out.println("\t\t\t\tROCK PAPER SCISSOR GAME");
        int player1Score = 0;
        int player2Score = 0;
        System.out.println("Enter name of player 1:");
        String name1 = inpChar.nextLine();
        System.out.println("Enter name of player 2");
        String name2 = inpChar.nextLine();

        System.out.println(name1+" Enter:\n1 for Rock \n2 for paper \n3 for scissor: ");
        int player1 = inpChar.nextInt();
        System.out.println(name2 +" Enter:\n1 for Rock \n2 for paper  \n3 for scissor: ");
        int player2 = inpChar.nextInt();
        if (player1==player2){
            System.out.println("The game is tie");
        }
        else{
            switch (player1){
                case 1 :
                    if(player2==2){
                        System.out.println(name1+" got 1 point");
                        player1Score +=1;
                    }
                    else if(player2==3){
                        System.out.println(name1+" got 1 point");
                        player1Score +=1;
                    }
                    break;
                case 2:
                    if (player2==3){
                        System.out.println(name2+" got 1 point");
                        player2Score +=1;
                    }
                    else if (player2==1){
                        System.out.println(name2+" got 1 point");
                        player2Score +=1;
                    }
                    break;
                case 3:
                    if (player2==1){
                        System.out.println(name2+" get 1 point");
                        player2Score +=1;
                    }
                    else if (player2==2){
                        System.out.println(name1+" get 1 point");
                        player1Score +=1;
                    }
                    break;
                default:
                    System.out.println("invalid input");
            }
            System.out.println("game over");
        }
        if (player1Score==player2Score){
            System.out.println("the game is tie");
        }
        else if (player1Score>player2Score){
            System.out.println(name1 +" won by " +player1Score+ " point");
        }
        else if(player1Score<player2Score){
            System.out.println(name2 + " won by " +player2Score+" point");
        }

    }
}
