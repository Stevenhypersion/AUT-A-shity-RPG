package v2_test;

/**
 * monster is a type of character in the game it have method Attack and die
 * 
 * @author Luo Zeting ID:16938158
 *@version 1.1
 */
public class Monster extends Character {

	public Monster(Level thisLevel, int atk, int hp) {
            this.setCurrentLevel(thisLevel);
            this.setAttack(atk);
            this.setHeath(hp);

	}

	/**
	 * A monster attack a player, when attack happened player will be push away
         * @param player that touched monster
	 */
	public void Attack(Player player) {
            player.setHeath(player.getHeath() - this.getAttack());
            player.getCurrentLevel().getInLevelLocation()[player.getCurrentX()][player.getCurrentY()].setHasPlayer(false);
            player.setCurrentX(player.getCurrentX() - (int) (Math.random() * 1.1 + 0.5));
            player.setCurrentY(player.getCurrentY() - (int) (Math.random() * 1.1 + 0.5));
            player.getCurrentLevel().getInLevelLocation()[player.getCurrentX()][player.getCurrentY()].setHasPlayer(true);
            System.out.println(String.format("Monster attacked you!!!\nYou lost %d heath", (int) this.getAttack()));
	}

        /**
         * this method will set up a monster
         * @param xAxis of monster
         * @param yAxis of monster
         */
	public void setMonster(int xAxis, int yAxis) {
            this.setCurrentX(xAxis);
            this.setCurrentY(yAxis);
            super.getCurrentLevel().getInLevelLocation()[xAxis][xAxis].setHasMonster(true);
	}

	/**
	 * give money to player when monster die
	 * @param player who killed monster
	 */
	public void die(Player player) {
            player.setMoney(getMoney() + 120);
            super.getCurrentLevel().getInLevelLocation()[getCurrentX()][getCurrentY()].setHasMonster(false);
	}
}
