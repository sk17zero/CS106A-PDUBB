/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		turnLeft();
		while (rightIsClear()){
		rebuildColumn();
		turnRight();
		jumpArch();
		rebuildColumn();
		turnAround();
		}
		}

		private void rebuildColumn() {
			while (frontIsClear()) {
				invertBeeperState();
				move();
			}
		}

		private void invertBeeperState() {
			if (noBeepersPresent()) {
			putBeeper();
			}
		   };
		
		private void jumpArch() {
			move();
			move();
			move();
			move();
			turnRight();
		}
		   

		
		
				

	
		
		
	
}
