package defense;
import robocode.*;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * genji - a robot by Aaron
 */
public class genji extends AdvancedRobot
{
	/**
	 * run: genji's default behavior
	 */
	public void run() {
		// Robot main loop
		while(true) {
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		back(20);
	}	
}
								