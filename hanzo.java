/**
 * Robocode robot
 * Not the best, and has inconsistent moving, but it did ok
 *
 * @author Aaron Knestaut
 */

package defense;
import robocode.*;
import java.awt.Color;

/**
 * Hanzo - a robot by Aaron
 */
public class Hanzo extends AdvancedRobot
{
	/**
	 * run: Hanzo's default behavior
	 */
	public void run() {
		setBodyColor(Color.white);
		setGunColor(Color.orange);
		setRadarColor(Color.black);
		setScanColor(Color.blue);
		setBulletColor(Color.gray);
		// Robot main loop
		while(true) {
				double distance = Math.random()*200;
            	double angle = Math.random()*100;
            	if(Math.random() > .5) {
            		setTurnRight(angle);
            	}
            	else {
            		setTurnLeft(angle);
            	}
            	setAhead(distance);
            	setTurnGunRight(360);
            	execute();
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		double distance = e.getDistance(); //get the distance of the scanned robot
    	if(distance > 300 && distance <= 450)
        	fire(2);
   		else if(distance > 40 && distance <= 300)
        	fire(3);
        else if(distance <= 40)
        	fire(5);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		double bearing = e.getBearing(); //Get the direction which is arrived the bullet.
    	if(getEnergy() < 60) { // if the energy is low, the robot go away from the enemy
        	setTurnRight(-bearing); 
        	setAhead(100); 
    	}
    	else { //if energy is good, searches for the robot that shot it to fire back
    		turnRight(bearing);
    		setTurnGunRight(bearing);
    	}
    	execute();
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) { //turns away from the wall and moves away
		double bearing = e.getBearing(); //get the bearing of the wall
    	setTurnRight(-bearing); 
    	setAhead(90);
    	execute();
	}	

	/**
	 * onRobotDeath: If another robot dies
	 */
	public void onRobotDeath(RobotDeathEvent e) {
		System.out.println("SIMPLE GEOMETRY");
	}
}