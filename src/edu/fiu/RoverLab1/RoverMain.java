/**
 * 
 */
package edu.fiu.RoverLab1;

import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author pguerra
 *
 *RoverMain is the main body of the rover. It houses the power component
 *as well as the onboard computer that connects and ties all the other rover modules together. 
 */
public class RoverMain {
	public String Pi;
	public String Power;
	public String Body;
	
	/** check rover systems when it turns on */

	public void RefCheck() {
	

}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movement rMovement = new Movement();
		rMovement.runSelfCheck();
		
		Communication rCommunication = new Communication();
		rCommunication.runSelfCheck();
		
		ObstacleDetection rObsDet = new ObstacleDetection();
		rObsDet.runSelfCheck();
		
		CameraModule rCamera = new CameraModule();
		rCamera.runSelfCheck();
	}

}
