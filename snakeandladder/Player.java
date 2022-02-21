package snakeandladder;

public class Player {
    private String name;
    private int position;
    Player(String name){
        this.name=name;
        this.position=0;
    }
    public String getName(){
        return this.name;
    }
    public void setPosition(int i){
        this.position=i;
    }
    public int getPosition(){
        return this.position;
    }
}

