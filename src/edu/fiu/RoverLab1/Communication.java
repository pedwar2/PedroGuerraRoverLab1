/**
 * 
 */
package edu.fiu.RoverLab1;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author pguerra
 * Implementing the Communications control class which allows the rover to 
 * send and receive commands to and from its controller. 
 */

public class Communication implements SelfCheckCapable {
	public String Receiver;
	public String Antenna;
	
	/** 
	 * Controls and interprets commands being sent to the  rover
	 */
	public void InputCommand() {
		System.out.println("Command Received");
	}
	/**
	 * Controls and sends commands being sent from the by the rover to the controls
	 */
	public void OutputCommand() {
		System.out.println("Command Sent");
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Communication Component";
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
