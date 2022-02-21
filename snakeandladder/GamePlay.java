package snakeandladder;

import java.util.Random;
import java.util.Scanner;

public class GamePlay {
    private Player[]players;
    private int noOfPlayers;
    private Board board;
    private Random random;
    GamePlay(Board board){
        this.board=board;
        this.random=new Random();
        Scanner sc=new Scanner(System.in);
        noOfPlayers=sc.nextInt();
        //System.out.println("noOfplayers "+noOfPlayers);
        String garbage=sc.nextLine();
        int countOfPlayers=0;
        players=new Player[noOfPlayers];
        while (countOfPlayers<noOfPlayers){
            String name=sc.nextLine();
            players[countOfPlayers]=new Player(name);
            countOfPlayers++;
        }
        startGame();
    }
    public void startGame() {
        //System.out.println("Game Started");
        int turn = 0;
        while (true) {
            System.out.println(turn);
            int id = turn % noOfPlayers;
            int diceFace = rollDice();
            int currentPosition = players[id].getPosition();
            int nextPosition = currentPosition + diceFace;
            if (nextPosition <= 100) {
                if (board.hasSnake(nextPosition)) {
                    nextPosition = board.getSnakeTail(nextPosition);
                }
                if (board.hasLadder(nextPosition)) {
                    nextPosition = board.getLadderEnd(nextPosition);
                }
                players[id].setPosition(nextPosition);
            } else {
                nextPosition = currentPosition;
            }
            System.out.println(players[id].getName() + " rolled a " + diceFace + " and moved from " + currentPosition + " to " + nextPosition);
            if(nextPosition==100){
                System.out.println(players[id].getName()+" wins the game");
                break;
            }
            turn++;
        }
    }
    public int rollDice(){
            int diceFace=random.nextInt(6)+1;
            return diceFace;
    }

}
