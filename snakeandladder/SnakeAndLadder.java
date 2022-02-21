package snakeandladder;

import java.util.Scanner;

public class SnakeAndLadder {

    public static int getSpace(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Board board=new Board();
        Scanner sc=new Scanner(System.in);
        int noOfsnakes=sc.nextInt();
        String garbage=sc.nextLine();
        int countOfsnakes=0;
        int start;
        int end;

        while (countOfsnakes<noOfsnakes){
            String str=sc.nextLine();
            int space=getSpace(str);
            start=Integer.parseInt(str.substring(0,space));
            end=Integer.parseInt(str.substring(space+1));
            board.setSnake(start,end);
            countOfsnakes++;
        }
        int noOfLadders=sc.nextInt();
        garbage=sc.nextLine();
        int countOfLadders=0;
        while (countOfLadders<noOfLadders){
            String str=sc.nextLine();
            int space=getSpace(str);
            start=Integer.parseInt(str.substring(0,space));
            end=Integer.parseInt(str.substring(space+1));
            board.setLadder(start,end);
            countOfLadders++;
        }
        GamePlay gamePlay=new GamePlay(board);




    }
}
