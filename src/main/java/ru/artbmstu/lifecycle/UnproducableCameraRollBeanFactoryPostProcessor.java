package ru.artbmstu.lifecycle;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import ru.artbmstu.common.UnproducableCameraRoll;

@Component
public class UnproducableCameraRollBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
		for(String name: beanDefinitionNames){
			BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
			String className = beanDefinition.getBeanClassName();
			try {
				Class<?> beanClass = Class.forName(className);

				UnproducableCameraRoll annotation = beanClass.getAnnotation(UnproducableCameraRoll.class);
				
				if(annotation!=null){
					Class usingCameraRollName =annotation.usingCameraRollClass();
					beanDefinition.setBeanClassName(usingCameraRollName.getName());
				}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
	
}
