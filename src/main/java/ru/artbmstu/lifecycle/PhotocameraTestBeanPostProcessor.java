package ru.artbmstu.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import ru.artbmstu.common.Camera;

import java.util.HashSet;
import java.util.Set;

@Component
public class PhotocameraTestBeanPostProcessor implements BeanPostProcessor {
    private static Set<Object> testedCameras;

    PhotocameraTestBeanPostProcessor(){
        testedCameras = new HashSet<>();
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Camera && !testedCameras.contains(bean.getClass())) {
            testedCameras.add(bean.getClass());
            System.out.println("Делаю пробное фото!");
            ((Camera) bean).doPhotograph();
            System.out.println("Отлично!Работает!");
        }
        return bean;

    }

}
