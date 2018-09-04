package ru.artbmstu.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
@UnproducableCameraRoll(usingCameraRollClass= BlackAndWhiteCameraRoll.class)
public class ColorCameraRoll implements CameraRoll {

	public void processing() {
		System.out.println("-1 цветной кадр");
	}

	@Override
	public void seriaProcessing() {
		System.out.println("-4 цветных кадра");
	}


}
