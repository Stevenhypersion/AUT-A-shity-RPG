package v2_test;

/**
 * who able to use this sword must be a master 
 * @author Luo Zeting ID:16938158
 *
 */
public class Sword_Master extends Sword {
	Sword_Master(Level currentLevel)
	{	super(currentLevel);
		super.setSwordName("Master's Sword");
		this.setAtkBoot(70);
	}
	
}
