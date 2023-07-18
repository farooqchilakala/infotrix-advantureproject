package p1;



public class Scenario {
    private Player player;
    
    public Scenario(Player player) {
        this.player = player;
    }
    
    public void play() {
        System.out.println("What do you want to do? (1) Explore, (2) Rest");
        String choice = Game.getPlayerInput();
        
        if (choice.equals("1")) {
            explore();
        } else if (choice.equals("2")) {
            rest();
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }
    
    private void explore() {
        System.out.println("You decide to explore the jungle.");
        int randomEvent = (int) (Math.random() * 3) + 1;
        
        if (randomEvent == 1) {
            System.out.println("You encounter a river.");
            System.out.println("What do you want to do? (1) Swim across, (2) Look for a bridge");
            String choice = Game.getPlayerInput();
            
            if (choice.equals("1")) {
                System.out.println("You try to swim across the river...");
                System.out.println("You are attacked by a crocodile and lose 50 health.");
                player.decreaseHealth(50);
            } else if (choice.equals("2")) {
                System.out.println("You search for a bridge and find one.");
                System.out.println("You safely cross the river.");
            } else {
                System.out.println("Invalid choice. Please try again.");
                explore();
                return;
            }
        } else if (randomEvent == 2) {
            System.out.println("You find a hidden treasure chest.");
            System.out.println("Do you want to open it? (1) Yes, (2) No");
            String choice = Game.getPlayerInput();
            
            if (choice.equals("1")) {
                System.out.println("You open the chest and find a valuable gem.");
                System.out.println("Congratulations! You win the game!");
                player.setGameOver(true);
            } else if (choice.equals("2")) {
                System.out.println("You decide not to open the chest.");
                System.out.println("You continue exploring the jungle.");
            } else {
                System.out.println("Invalid choice. Please try again.");
                explore();
                return;
            }
        } else if (randomEvent == 3) {
            System.out.println("You come across a group of hostile monkeys.");
            System.out.println("What do you want to do? (1) Fight, (2) Run");
            String choice = null;
			try {
				choice = Game.getPlayerInput();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            if (choice.equals("1")) {
                System.out.println("You try to fight the monkeys...");
                System.out.println("The monkeys overpower you and you lose 30 health.");
                player.decreaseHealth(30);
            } else if (choice.equals("2")) {
                System.out.println("You run away from the monkeys and find a safe spot.");
                System.out.println("You catch your breath and continue exploring.");
            } else {
                System.out.println("Invalid choice. Please try again.");
                explore();
                return;
            }
        }
    }
    
    private void rest() {
        System.out.println("You decide to rest and regain your strength.");
        player.increaseHealth(20);
        System.out.println("You feel refreshed and ready to continue your journey.");
    }
}
