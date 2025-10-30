package src;

import java.util.ArrayList;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Player> igraci = new ArrayList<>();
		Player player = new Player(2,10,5,32,"Batman",85);
		igraci.add(player);
		

		ArrayList<Enemy> protivnik = new ArrayList<>();
		Enemy enemy = new Enemy(22,12,5,45,"Goblin",56,234);
		protivnik.add(enemy);
		
		
		Enemy newEnemy = new Enemy(33,44,6,88,"Slumberjack",22,33);
		enemy.addTheEnemy(newEnemy);

        protivnik.add(newEnemy);
		
		
		
		
	    System.out.println("the list of players:");
	    for (Player players : igraci) {
            System.out.println(players);
        }

        System.out.println(" Enemies ");
        for (Enemy enemies : protivnik) {
            System.out.println(enemies);
            
            
           
            
        }
        System.out.println(" Collision Check: ");
        for (Player players : igraci) {
            for (Enemy enemies : protivnik) {
            	
                if (enemy.interselect(player, enemy)) {
                    System.out.println(" Collision detected between " + player.getName() + " and " + enemy.getType());
                    enemy.attack(player);
                    System.out.println(player.getName() + " was attacked! Health is now: " + player.getHealth());
                } else {
                    System.out.println("No collision between " + player.getName() + " and " + enemy.getType());
                }

	} 

}
	}
}
