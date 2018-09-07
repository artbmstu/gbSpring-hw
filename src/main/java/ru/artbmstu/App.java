package ru.artbmstu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.artbmstu.config.AppConfig;
import ru.artbmstu.service.CategoryService;

public class App {
    public static void main(String[] args) {
        final ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        final CategoryService categoryService = ctx.getBean(CategoryService.class);
        System.out.println(categoryService.findOne("1").getCategoryName());
    }
}
