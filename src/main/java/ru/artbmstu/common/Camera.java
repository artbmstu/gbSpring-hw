package ru.artbmstu.common;

public interface Camera {
	
	CameraRoll getCameraRoll();
	void setCameraRoll(CameraRoll cameraRoll);
	void doPhotograph();
	void breaking();
	boolean isBroken();
	public void ready();

}
