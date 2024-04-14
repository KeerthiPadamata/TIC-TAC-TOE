import java.util.Scanner;

import board.Board;
import game.Game;
import player.Player;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("First Project -> TIC TAC TOE");

        Board b = new Board(3, '-');
        b.printBoardConfig();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name of the first player");
        String name = sc.nextLine();
        System.out.println("Enter symbol");
        char symbol = sc.next().charAt(0);
        sc.nextLine();

        Player p1 = new Player();
        p1.setPlayerDetails(name,symbol,"Karnataka","9028172973","ravi@gmail.com",21);
        p1.getPlayerNameAndSymbol();

        System.out.println("Enter name of the second player");
        name = sc.nextLine();
        System.out.println("Enter symbol");
        symbol = sc.next().charAt(0);

        Player p2 = new Player();
        p2.setPlayerDetails(name,symbol,"Andhra Pradesh","6301697629","ram@gmail.com",20);
        p2.getPlayerNameAndSymbol();

        Game g = new Game(new Player[] {p1,p2}, b);
        g.play();
        sc.close();
    }
}