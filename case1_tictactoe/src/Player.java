public class Player {
    private int id;
    private char symbol;

    public Player(int id, char symbol){
        this.id = id;
        this.symbol = symbol;
    }

    public int getId(){
        return id;
    }

    public char getSymbol(){
        return symbol;
    }
}
