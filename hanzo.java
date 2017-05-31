/**
 * Robocode robot
 * Not the best, and has inconsistent moving, but it did ok
 *
 * @author Aaron Knestaut
 */

package defense;
import robocode.*;

/**
 * Hanzo - a robot by Aaron
 */
public class Hanzo extends AdvancedRobot
{
	/**
	 * run: Hanzo's default behavior
	 */
	public void run() {
		// Robot main loop
		while(true) {
			if(getRoundNum() <= 6) {
				double distance = Math.random()*150;
            	double angle = Math.random()*45;
            	turnRight(angle);
            	ahead(distance);
            	ahead(50);
            	turnGunRight(360);
            	back(50);
            	turnGunRight(360);
        	}
        	else {
        		ahead(90);
				turnGunRight(360);
				back(70);
				turnGunRight(360);
        	}
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		double distance = e.getDistance(); //get the distance of the scanned robot
    	if(distance > 650)
    		fire(2);
    	else if(distance > 350 && distance <= 650)
        	fire(3);
   		else if(distance <= 350)
        	fire(5);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		double bearing = e.getBearing(); //Get the direction which is arrived the bullet.
    	if(getEnergy() < 60) { // if the energy is low, the robot go away from the enemy
        	turnRight(-bearing); 
        	ahead(100); 
    	}
    	else {
    		turnLeft(360);
    	}
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		double bearing = e.getBearing(); //get the bearing of the wall
    	turnRight(-bearing);
    	ahead(80);
	}	
}
								