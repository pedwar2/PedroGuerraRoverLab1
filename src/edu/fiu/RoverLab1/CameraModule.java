/**
 * 
 */
package edu.fiu.RoverLab1;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author pguerra
 *
 *This class handles all recoding and image capture that is used by multiple classes
 */
public class CameraModule implements SelfCheckCapable {
	public String Camera;
	
	/** 
	 * Take pictures using camera
	 */
	void CaptureImage() {
		System.out.println("Image Captured");
	}
	
	/**
	 * Take a video using camera
	 */
	void RecordVideo() {
		System.out.println("Video Captured");
	}
	
	/**
	 * Sends Images to the proper modules
	 */
	
	void SendImage() {
		System.out.println("Image Sent");
	}
	
	/**
	 * Sends videos captured to the proper modules
	 */
	
	void SendVideo() {
		System.out.println("Video Sent");
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Camera Module";
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
