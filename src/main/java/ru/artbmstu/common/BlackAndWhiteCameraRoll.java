package ru.artbmstu.common;

import org.springframework.stereotype.Component;

@Component
public class BlackAndWhiteCameraRoll implements CameraRoll {
	
	public void processing(){
	    System.out.println("-1 черно-белый кадр");
	}

    @Override
    public void seriaProcessing() {
        System.out.println("-3 черно-белых кадра");
    }


}
