package snakeandladder;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private int size;
    private Map<Integer,Integer> snake;
    private Map<Integer,Integer> ladder;
    Board(){
        this.size=100;
        this.snake=new HashMap<>();
        this.ladder=new HashMap<>();
    }
    public void setSnake(int head,int tail){
        //System.out.println("Snake born");
        snake.put(head,tail);
    }
    public void setLadder(int start,int end){
        //System.out.println("Ladder Placed");
        ladder.put(start,end);
    }
    public boolean hasSnake(int pos){
        if(snake.containsKey(pos))
            return true;
        return false;

    }
    public boolean hasLadder(int pos){
        if(ladder.containsKey(pos))
            return true;
        return false;
    }
    public int getSnakeTail(int head){
        return snake.get(head);
    }
    public int getLadderEnd(int start){
        return ladder.get(start);
    }

}
