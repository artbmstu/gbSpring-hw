package ru.artbmstu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.artbmstu.config.AppConfig;
import ru.artbmstu.model.CategoryEntity;
import ru.artbmstu.service.AdService;
import ru.artbmstu.service.CategoryService;
import ru.artbmstu.service.CompanyService;

public class App {
    public static void main(String[] args) {
        final ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        final CompanyService companyService = ctx.getBean(CompanyService.class);
        final CategoryService categoryService = ctx.getBean(CategoryService.class);
        final AdService adService = ctx.getBean(AdService.class);
        System.out.println(categoryService.findAll().get(0).getCategoryname());
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setIdcategory("1");
        categoryEntity.setCategoryname("test");
        System.out.println(adService.findByCategory(categoryEntity).get(0).getAdname());
    }
}
