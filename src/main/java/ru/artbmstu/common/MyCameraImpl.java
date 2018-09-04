package ru.artbmstu.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyCameraImpl implements Camera {

    @Autowired
    private CameraRoll cameraRoll;

    @Value("false")
    private boolean broken;

    @Override
    public CameraRoll getCameraRoll() {
        return null;
    }

    @Override
    public void setCameraRoll(CameraRoll cameraRoll) {
            this.cameraRoll = cameraRoll;
    }

    @Override
    public void doPhotograph() {
        if(isBroken()){
            System.out.println("Фотоаппарат сломан!");
            return;
        }
        System.out.println("Сделана серия фотографий!");
        cameraRoll.seriaProcessing();
    }

    @Override
    public void breaking() {
        this.broken=true;
    }

    @Override
    public boolean isBroken() {
        return broken;
    }

    @Override
    public void ready() {
        System.out.println("Фотоаппарат готов к использованию!");
    }

}
