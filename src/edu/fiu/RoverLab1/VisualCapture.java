/**
 * 
 */
package edu.fiu.RoverLab1;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author pguerra
 * Implementing the Visual capture class which handles photo and video processing
 * This class takes all inputs from the CameraModule
 */
public class VisualCapture implements SelfCheckCapable {
	
	/**
	 * Processes images taken by the cameramodule class
	 */
	public void ImageProcessing() {
		System.out.println("Image Processed");
	}
	
	/**
	 * Processes videos recorded by the cameramodule
	 */
	public void VideoProcessing() {
		System.out.println("Video Processed");
	}
	
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

}
