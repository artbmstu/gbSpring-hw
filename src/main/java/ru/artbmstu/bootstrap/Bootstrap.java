package ru.artbmstu.bootstrap;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.artbmstu.service.AuthService;

@Component
public class Bootstrap implements InitializingBean {

    @Autowired
    private AuthService authService;

    @Override
    public void afterPropertiesSet() throws Exception{
        authService.initUser("admin", "admin", "admin");
    }
}
