package p1;



import java.util.Scanner;

public class Game {
    private Player player;
    
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
    
    public void start() {
        player = new Player();
        System.out.println("Welcome to Lost in the Jungle!");
        System.out.println("You find yourself lost in a dense jungle.");
        System.out.println("Can you find your way back to civilization?");
        System.out.println();
        
        while (!player.isGameOver()) {
            Scenario currentScenario = new Scenario(player);
            currentScenario.play();
        }
        
        System.out.println("Game over. Thanks for playing!");
    }
    
    public static String getPlayerInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
