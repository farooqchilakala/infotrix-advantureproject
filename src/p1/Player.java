package p1;


public class Player {
    private int health;
    private boolean gameOver;
    
    public Player() {
        health = 100;
        gameOver = false;
    }
    
    public int getHealth() {
        return health;
    }
    
    public void decreaseHealth(int amount) {
        if((health-amount)>0){
            health=-amount;
        }

        
        if (health <= 0) {
            health=0;
            gameOver = true;
        }

    }
    
    public boolean isGameOver() {
        return gameOver;
    }

	public void setGameOver(boolean b) {
        gameOver=b;
		// TODO Auto-generated method stub
		
	}

	public void increaseHealth(int i) {
		// TODO Auto-generated method stub
		if((health + i)<=100){
            health+=i;
        }else{
            health=100;
        }

	}
}
