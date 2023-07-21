package p1;



public class Scenario {
    private final Player player;
    
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
        System.out.println("\nYou decide to explore the jungle.");
        int randomEvent = (int) (Math.random() * 6) + 1;
        
        if (randomEvent == 1) {
            System.out.println("You encounter a river.");
            System.out.println("What do you want to do? (1) Swim across, (2) Look for a bridge");
            String choice = Game.getPlayerInput();
            
            if (choice.equals("1")) {
                System.out.println("You try to swim across the river...");
                System.out.println("You are attacked by a crocodile and lose 50 health.");
                player.decreaseHealth(50);
                System.out.println("Health : " + player.getHealth());
            } else if (choice.equals("2")) {
                System.out.println("You search for a bridge and find one.");
                System.out.println("You safely cross the river.");
            } else {
                System.out.println("Invalid choice. Please try again.");
                explore();
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

            }
        } else if (randomEvent == 3) {
            System.out.println("You come across a group of hostile monkeys.");
            System.out.println("What do you want to do? (1) Fight, (2) Run");
            String choice = Game.getPlayerInput();

            if (choice.equals("1")) {
                System.out.println("You try to fight the monkeys...");
                System.out.println("The monkeys overpower you and you lose 30 health.");
                player.decreaseHealth(30);
                System.out.println("Health : " + player.getHealth());
            } else if (choice.equals("2")) {
                System.out.println("You run away from the monkeys and find a safe spot.");
                System.out.println("You catch your breath and continue exploring.");
            } else {
                System.out.println("Invalid choice. Please try again.");
                explore();
            }
        } else if (randomEvent == 4) {
        System.out.println("You come across ancient ruins hidden in the jungle.");
        System.out.println("What do you want to do? (1) Investigate further, (2) Continue exploring");
        String choice = Game.getPlayerInput();

        if (choice.equals("1")) {
            System.out.println("You decide to explore the ancient ruins...");
        } else if (choice.equals("2")) {
            System.out.println("You choose to continue exploring the jungle.");
        } else {
            System.out.println("Invalid choice. Please try again.");
            explore();
        }
    } else if (randomEvent == 5) {
        System.out.println("A mysterious fog descends upon the jungle.");
        System.out.println("What do you want to do? (1) Wait for the fog to clear, (2) Proceed with caution");
        String choice = Game.getPlayerInput();

        if (choice.equals("1")) {
            System.out.println("You decide to wait for the fog to clear...");
        } else if (choice.equals("2")) {
            System.out.println("You cautiously proceed through the fog.");
        } else {
            System.out.println("Invalid choice. Please try again.");
            explore();
        }
    } else if (randomEvent == 6) {
        System.out.println("You encounter a friendly group of natives.");
        System.out.println("What do you want to do? (1) Accept their hospitality, (2) Politely decline");
        String choice = Game.getPlayerInput();

        if (choice.equals("1")) {
            System.out.println("You decide to accept their hospitality...");
        } else if (choice.equals("2")) {
            System.out.println("You politely decline their offer and continue exploring.");
        } else {
            System.out.println("Invalid choice. Please try again.");
            explore();
        }
    }

    }
    
    private void rest() {
        System.out.println("You decide to rest and regain your strength.");
        player.increaseHealth(20);
        System.out.println("Health :"+ player.getHealth());
        System.out.println("You feel refreshed and ready to continue your journey.");
    }
}
