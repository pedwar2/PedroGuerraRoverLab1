/**
 * 
 */
package edu.fiu.RoverLab1;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author pguerra
 *
 *This class helps the rover detect obstacles in its path using a variety of different on-board sensors, as well as the CameraModule.
 */
public class ObstacleDetection implements SelfCheckCapable {
	String InfraredSensor;
	String UltraSonicModule;
	String Photoresistors;

	
	/**
	 * using data from camera module, and UltrasonicModule, this will detect obstacles
	 */
	void ObstacleDetection() {
		System.out.println("Obstacle Detected");
	}
	
	/**
	 * Uses the rove'rs InfraredSensors to track lines under the rover and follow line paths.
	 */
	void LineTracking(){
		System.out.println("Tracking Line");
	}
	
	/** 
	 * uses the Photoresistors on the rover to track light sources and make the rover perform different actions based on changes in light
	 */
	void LightTracing() {
		System.out.println("Light Control received");
	}
	
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Obstacle Detection Component";
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
