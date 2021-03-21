/**
 * 
 */
package edu.fiu.RoverLab1;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author pguerra
 *
 *This class takes commands from RoverMain received through Communication in order to 
 *move the rover in different directions.
 */
public class Movement implements SelfCheckCapable {
	int Wheels;
	String Motor;
	
	/**
	 * Action to move the rover forward 
	 */
	void MoveForward() {
		System.out.println("Moving Forward");
	}
	
	/** 
	 * Action to move the rover backwards
	 */
	void MoveBack() {
		System.out.println("Moving Backwards");
	}
	
	/**
	 * Action to make the rover turn left
	 */
	void TurnLeft() {
		System.out.println("Turning Left");
	}
	
	/**
	 * Action to make the rover turn right
	 */
	void TurnRight() {
		System.out.println("Turning Right");
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Movement Component";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck();
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
