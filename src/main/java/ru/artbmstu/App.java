package ru.artbmstu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.artbmstu.config.AppConfig;
import ru.artbmstu.service.CompanyService;

public class App {
    public static void main(String[] args) {
        final ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        final CompanyService companyService = ctx.getBean(CompanyService.class);
        System.out.println(companyService.findByName("test"));
    }
}
