package ru.artbmstu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.artbmstu.common.Camera;
import ru.artbmstu.config.AppConfig;

public class Client {

	public static void main(String[] args) {

    	  ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		  Camera camera = context.getBean(Camera.class);
          camera.doPhotograph();

	}

}
