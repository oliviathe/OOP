public class Main {
    public Main(){
        int moves = 9, turn = 0;
        boolean won = false;
        Player curr = null;
        Player players[] = {
            new Player(0,'O'), new Player(1, 'X')
        }; // insert sesuai jumlah player
        Board board = new Board();

        do{
            for (Player player : players){
                if(player.getId() == turn) curr = player;
            }
            board.input(turn, curr.getSymbol());
            board.print();
            moves--;
            won = board.check(curr.getSymbol());
            if(won) System.out.println("Player " + (turn+1) + " won!");
            if(moves == 0) System.out.println("Draw...");
            turn = (turn+1) % 2; // jumlah player fleksibel
        } while(!won && moves > 0);
    }

    public static void main(String[] args) {
        new Main();
    }
}